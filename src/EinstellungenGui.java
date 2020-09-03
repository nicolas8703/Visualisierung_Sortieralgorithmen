import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Vector;


/**
 * The type Einstellungen gui.
 */
public class EinstellungenGui extends JFrame {

    private JComboBox algorithmusAuswahl = new JComboBox();
    private JTextField eingabePause = new JTextField();
    private JTextField eingabeZahlen = new JTextField();


    /**
     * Instantiates a new Einstellungen gui.
     */
    EinstellungenGui() {
        super("Sortieralgorithmus Visualisierung");
        JPanel hauptPanel = new JPanel();
        getContentPane().add(hauptPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(330, 300);
        setResizable(false);

        algorithmusAuswahl.addItem("Bubble Sort");
        algorithmusAuswahl.addItem("Quick Sort");
        algorithmusAuswahl.addItem("Shaker Sort");
        algorithmusAuswahl.addItem("Heap Sort");
        hauptPanel.setLayout(new GridLayout(4, 1));
        JPanel spieler1Panel = new JPanel();
        hauptPanel.add(spieler1Panel);
        spieler1Panel.setLayout(new GridLayout(2, 1));
        JLabel titelAlgortihmus = new JLabel("Algorithmus: ");
        spieler1Panel.add(titelAlgortihmus);
        spieler1Panel.add(algorithmusAuswahl);

        JPanel spieler2Panel = new JPanel();
        hauptPanel.add(spieler2Panel);
        spieler2Panel.setLayout(new GridLayout(2, 1));
        JLabel titelPause = new JLabel("Pause zwischen den Sortierungen: (in Millisekunden)");
        spieler2Panel.add(titelPause);
        spieler2Panel.add(eingabePause);

        JPanel spieler3Panel = new JPanel();
        hauptPanel.add(spieler3Panel);
        spieler3Panel.setLayout(new GridLayout(2, 1));
        JLabel titelZahlen = new JLabel("Zahlen eingeben: (mit ',' dazwischen)");
        spieler3Panel.add(titelZahlen);
        spieler3Panel.add(eingabeZahlen);

        JPanel startPanel = new JPanel();
        hauptPanel.add(startPanel);
        startPanel.setLayout(new GridLayout(2, 1));
        JLabel startPanelSplit = new JLabel();
        startPanel.add(startPanelSplit);
        JButton start = new JButton("Start");
        startPanel.add(start);
        start.setFont(new Font("SansSerif", Font.BOLD, 12));


        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Vector zahlen = new Vector();
                int groessteZahl;
                int kleinsteZahl;
                String temp = eingabeZahlen.getText();
                String[] temp1 = temp.split(",");
                for (int i = 0; i < temp1.length; i++) {
                    zahlen.add(i, temp1[i]);
                }
                kleinsteZahl = getKleinsteZahl(zahlen);
                groessteZahl = getGroesteZahl(zahlen);

                int xValue = zahlen.size();
                int yValue = groessteZahl;


                if (eingabePause.getText().isEmpty() || eingabeZahlen.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Bitte alle Felder ausfüllen!", "Fehlermeldung", JOptionPane.WARNING_MESSAGE);
                } else if (Integer.parseInt(eingabePause.getText()) < 10) {
                    JOptionPane.showMessageDialog(null, "Die Pause muss mindestens 10 Millisekunden lang sein!", "Fehlermeldung", JOptionPane.WARNING_MESSAGE);
                } else if (Integer.parseInt(eingabePause.getText()) > 2000) {
                    JOptionPane.showMessageDialog(null, "Die Pause darf höchstens zwei Sekunden lang sein!", "Fehlermeldung", JOptionPane.WARNING_MESSAGE);
                } else if (zahlen.size() < 2) {
                    JOptionPane.showMessageDialog(null, "Es müssen mindestens 2 Zahlen eingegeben werden", "Fehlermeldung", JOptionPane.WARNING_MESSAGE);
                } else if (kleinsteZahl < 1) {
                    JOptionPane.showMessageDialog(null, "Es darf keine Zahl unter 1 sein!", "Fehlermeldung", JOptionPane.WARNING_MESSAGE);
                } else {
                    new VisualisierungsGui(zahlen, Integer.parseInt(eingabePause.getText()), algorithmusAuswahl.getSelectedItem().toString(), xValue, yValue);
                }
            }
        });
    }

    /**
     * Gets die grösste Zahl aus dem Vector zahlen
     *
     * @param zahlen Der Vector zahlen
     * @return die gröste Zahl
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
     * Gets die kleinste Zahl aus dem Vector zahlen
     *
     * @param zahlen Der Vector zahlen
     * @return die kleinste Zahl
     */
    private int getKleinsteZahl(Vector zahlen) {
        Vector temp = new Vector();
        for (int i = 0; i < zahlen.size(); i++) {
            temp.add(Integer.parseInt(zahlen.get(i).toString()));
        }
        Collections.sort(temp);
        return Integer.parseInt(temp.get(0).toString());
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        EinstellungenGui g = new EinstellungenGui();
    }
}
