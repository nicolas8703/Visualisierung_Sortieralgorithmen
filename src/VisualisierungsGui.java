import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Vector;

/**
 * Nicolas Feige
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 1.08.2020
 */
public class VisualisierungsGui extends JFrame {

    private JComboBox algorithmusAuswahl = new JComboBox();
    private JTextField vectorEinleser = new JTextField();
    private JTextField pauseEinleser = new JTextField();

    private int xWert;
    private int yWert;
    private JPanel[][] kacheln;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        VisualisierungsGui g = new VisualisierungsGui();
    }

    /**
     * Instantiates a new Visualisierungs gui.
     * Creates the gui and adds an ActionListener.
     */
    VisualisierungsGui(){
        super("Visualisierung von Sortieralgorithmen");
        //JPanel[][] kacheln = new JPanel[10][10];
        JPanel einstellungsSplit = new JPanel();
        JPanel hauptPanel = new JPanel();
        JPanel einstellungsPanel = new JPanel();
        JPanel visualisierungsPanel = new JPanel();
        JLabel algorithmusAuswahlTitel = new JLabel("Algorithmus: ");
        JLabel pauseEinleserTitel = new JLabel("Pause zwischen den Sortierungen: (in Millisekunden)");
        JLabel vectorEinleserTitel = new JLabel("Zahlen eingeben: (von 0-10, mit ',' dazwischen und maximal 10 Zahlen)");
        JButton start = new JButton("Start");
        JButton start1 = new JButton("Start1");
        JPanel bttnSplit = new JPanel();


        getContentPane().add(hauptPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1280, 720);
        setResizable(false);

        hauptPanel.setLayout(new BorderLayout());
        hauptPanel.add(einstellungsPanel, BorderLayout.NORTH);
        hauptPanel.add(visualisierungsPanel, BorderLayout.CENTER);
        //visualisierungsPanel.setBackground(Color.WHITE);
        visualisierungsPanel.setBackground(null);
        einstellungsPanel.setLayout(new GridLayout(2,3));
        einstellungsPanel.add(algorithmusAuswahlTitel);
        einstellungsPanel.add(vectorEinleserTitel);
        einstellungsPanel.add(pauseEinleserTitel);
        einstellungsPanel.add(algorithmusAuswahl);
        algorithmusAuswahl.addItem("Bubble Sort");
        algorithmusAuswahl.addItem("Quick Sort");
        algorithmusAuswahl.addItem("Shaker Sort");
        algorithmusAuswahl.addItem("Heap Sort");
        einstellungsPanel.add(vectorEinleser);
        einstellungsPanel.add(einstellungsSplit);
        einstellungsSplit.setLayout(new GridLayout(1,2));
        einstellungsSplit.add(pauseEinleser);
        einstellungsSplit.add(bttnSplit);
        bttnSplit.setLayout(new GridLayout(1,2));
        bttnSplit.add(start);
        bttnSplit.add(start1);

        start1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Vector zahlen = new Vector();
                int groessteZahl;

                String temp = vectorEinleser.getText();
                String[] temp1 = temp.split(",");
                for (int i = 0; i < temp1.length; i++) {
                    zahlen.add(i, temp1[i]);
                }
                groessteZahl = getGroesteZahl(zahlen);

                xWert = zahlen.size();
                yWert = groessteZahl;

                kacheln = new JPanel[yWert][xWert];

                visualisierungsPanel.setLayout(new GridLayout(yWert, xWert));
                for(int i = 0; i < yWert; i++){
                    for (int j = 0; j < xWert; j++) {
                        kacheln[i][j] = new JPanel();
                        visualisierungsPanel.add(kacheln[i][j]);
                    }
                }
                kacheln[2][3].setBackground(Color.CYAN);
                setVisible(true);

                //new WorkerVisialisierung(zahlen, 200, "Bubble Sort", visualisierungsPanel, xWert, yWert, kacheln).execute();
            }
        });

        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Vector zahlen = new Vector();
                int groessteZahl;
                int kleinsteZahl;
                String temp = vectorEinleser.getText();
                String[] temp1 = temp.split(",");
                for (int i = 0; i < temp1.length; i++) {
                    zahlen.add(i, temp1[i]);
                }
                kleinsteZahl = getKleinsteZahl(zahlen);
                groessteZahl = getGroesteZahl(zahlen);

                xWert = zahlen.size();
                yWert = groessteZahl;


                if (pauseEinleser.getText().isEmpty() || vectorEinleser.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Bitte alle Felder ausfüllen!", "Fehlermeldung", JOptionPane.WARNING_MESSAGE);
                } else if (Integer.parseInt(pauseEinleser.getText()) < 100) {
                    JOptionPane.showMessageDialog(null, "Die Pause muss mindestens 100 Millisekunden lang sein!", "Fehlermeldung", JOptionPane.WARNING_MESSAGE);
                } else if (Integer.parseInt(pauseEinleser.getText()) > 2000) {
                    JOptionPane.showMessageDialog(null, "Die Pause darf höchstens zwei Sekunden lang sein!", "Fehlermeldung", JOptionPane.WARNING_MESSAGE);
                } else if (zahlen.size() > 10) {
                    JOptionPane.showMessageDialog(null, "Es dürfen maximal 10 Zahlen eingegeben werden", "Fehlermeldung", JOptionPane.WARNING_MESSAGE);
                } else if (zahlen.size() < 3) {
                    JOptionPane.showMessageDialog(null, "Es müssen mindestens 4 Zahlen eingegeben werden", "Fehlermeldung", JOptionPane.WARNING_MESSAGE);
                } else if (kleinsteZahl < 1) {
                    JOptionPane.showMessageDialog(null, "Es darf keine Zahl unter 1 sein!", "Fehlermeldung", JOptionPane.WARNING_MESSAGE);
                }else if (groessteZahl > 10) {
                    JOptionPane.showMessageDialog(null, "Es darf keine Zahl über 10 sein!", "Fehlermeldung", JOptionPane.WARNING_MESSAGE);
                }else {
                    new WorkerVisialisierung(zahlen, Integer.parseInt(pauseEinleser.getText()), algorithmusAuswahl.getSelectedItem().toString(), visualisierungsPanel, xWert, yWert, kacheln).execute();
                }
            }
        });
    }
    /**
     * Bestimmt die grösste Zahl von Zahlen
     * @param zahlen die Zahlen
     * @return int   die grösste Zahl von zahlen
     */
    private int getGroesteZahl(Vector zahlen) {
        Vector temp = new Vector();
        for (int i = 0; i < zahlen.size(); i++) {
            temp.add(Integer.parseInt(zahlen.get(i).toString()));
        }
        Collections.sort(temp);
        return Integer.parseInt(temp.get(temp.size() - 1).toString());
    }
    /**
     * Bestimmt die kleinste Zahl von Zahlen
     * @param zahlen die Zahlen
     * @return int   die kleinste Zahl von zahlen
     */
    private int getKleinsteZahl(Vector zahlen) {
        Vector temp = new Vector();
        for (int i = 0; i < zahlen.size(); i++) {
            temp.add(Integer.parseInt(zahlen.get(i).toString()));
        }
        Collections.sort(temp);
        return Integer.parseInt(temp.get(0).toString());
    }
    }




