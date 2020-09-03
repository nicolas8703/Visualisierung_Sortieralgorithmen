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
 * @date 3.9.2020
 */


public class EinstellungenGui extends JFrame {

    private JPanel hauptPanel = new JPanel();
    private JPanel spieler1Panel = new JPanel();
    private JPanel spieler2Panel = new JPanel();
    private JPanel spieler3Panel = new JPanel();

    private JLabel titelAlgortihmus = new JLabel("Algorithmus: ");
    private JLabel titelPause = new JLabel("Pause zwischen den Sortierungen: (in Millisekunden)");
    private JLabel titelZahlen = new JLabel("Zahlen eingeben: (von 0-10, mit ',' dazwischen und maximal 10 Zahlen)");

    private JComboBox algorithmusAuswahl = new JComboBox();
    private JTextField eingabePause = new JTextField();
    private JTextField eingabeZahlen = new JTextField();

    private JPanel startPanel = new JPanel();
    private JLabel startPanelSplit = new JLabel();
    private JButton start = new JButton("Start");


    EinstellungenGui(){
        super("Sortieralgorithmus Visualisierung");
        getContentPane().add(hauptPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(330,300);
        setResizable(false);

        algorithmusAuswahl.addItem("Bubble Sort");
        algorithmusAuswahl.addItem("Quick Sort");
        algorithmusAuswahl.addItem("Shaker Sort");
        algorithmusAuswahl.addItem("Heap Sort");
        hauptPanel.setLayout(new GridLayout(4,1));
        hauptPanel.add(spieler1Panel);
        spieler1Panel.setLayout(new GridLayout(2,1));
        spieler1Panel.add(titelAlgortihmus);
        spieler1Panel.add(algorithmusAuswahl);

        hauptPanel.add(spieler2Panel);
        spieler2Panel.setLayout(new GridLayout(2,1));
        spieler2Panel.add(titelPause);
        spieler2Panel.add(eingabePause);

        hauptPanel.add(spieler3Panel);
        spieler3Panel.setLayout(new GridLayout(2,1));
        spieler3Panel.add(titelZahlen);
        spieler3Panel.add(eingabeZahlen);

        hauptPanel.add(startPanel);
        startPanel.setLayout(new GridLayout(2,1));
        startPanel.add(startPanelSplit);
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

                if (eingabePause.getText().isEmpty() || eingabeZahlen.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Bitte alle Felder ausfüllen!", "Fehlermeldung", JOptionPane.WARNING_MESSAGE);
                } else if (Integer.parseInt(eingabePause.getText()) < 100) {
                    JOptionPane.showMessageDialog(null, "Die Pause muss mindestens 100 Millisekunden lang sein!", "Fehlermeldung", JOptionPane.WARNING_MESSAGE);
                } else if (Integer.parseInt(eingabePause.getText()) > 2000) {
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
                    new VisualisierungsGui(zahlen, groessteZahl, kleinsteZahl, Integer.parseInt(eingabePause.getText()), algorithmusAuswahl.getSelectedItem().toString());
                }
            }
        });
    }
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

    public static void main(String[] args) {
        EinstellungenGui g = new EinstellungenGui();
    }
}
