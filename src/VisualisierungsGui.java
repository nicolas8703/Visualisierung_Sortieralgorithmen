import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

/**
 * Nicolas Feige
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 01.08.2020
 */


public class VisualisierungsGui extends JFrame {

    private JPanel hauptPanel = new JPanel();
    private JPanel einstellungsPanel = new JPanel();
    private JPanel visualisierungsPanel = new JPanel();

    private JComboBox algorithmusAuswahl = new JComboBox();
    private JLabel algorithmusAuswahlTitel = new JLabel();

    private JTextField vectorEinleser = new JTextField();
    private JLabel vectorEinleserTitel = new JLabel();

    private JTextField pauseEinleser = new JTextField();
    private JLabel pauseEinleserTitel = new JLabel();

    private JPanel einstellungsSplit = new JPanel();
    private JButton start = new JButton();

    public static void main(String[] args) {
        VisualisierungsGui g = new VisualisierungsGui();
    }

    VisualisierungsGui(){
        super("Visualisierung von Sortieralgorithmen");
        JPanel[][] kacheln = new JPanel[10][10];
        getContentPane().add(hauptPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1280, 720);
        setResizable(false);
        hauptPanel.setLayout(new BorderLayout());
        hauptPanel.add(einstellungsPanel, BorderLayout.NORTH);
        hauptPanel.add(visualisierungsPanel, BorderLayout.CENTER);
        visualisierungsPanel.setBackground(Color.WHITE);
        einstellungsPanel.setLayout(new GridLayout(2,3));
        einstellungsPanel.add(algorithmusAuswahlTitel);
        algorithmusAuswahlTitel.setText("Algorithmus: ");
        einstellungsPanel.add(vectorEinleserTitel);
        vectorEinleserTitel.setText("Zahlen eingeben: (von 0-10, mit ',' dazwischen und maximal 10 Zahlen)");
        einstellungsPanel.add(pauseEinleserTitel);
        pauseEinleserTitel.setText("Pause zwischen den Sortierungen: (in Millisekunden)");
        einstellungsPanel.add(algorithmusAuswahl);
        algorithmusAuswahl.addItem("Bubble Sort");
        algorithmusAuswahl.addItem("Quick Sort");
        algorithmusAuswahl.addItem("Shaker Sort");
        algorithmusAuswahl.addItem("Heap Sort");
        einstellungsPanel.add(vectorEinleser);
        einstellungsPanel.add(einstellungsSplit);
        einstellungsSplit.setLayout(new GridLayout(1,2));
        einstellungsSplit.add(pauseEinleser);
        einstellungsSplit.add(start);
        start.setText("Start");
        visualisierungsPanel.setLayout(new GridLayout(10,10));

        for(int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++) {
                kacheln[i][j] = new JPanel();
                visualisierungsPanel.add(kacheln[i][j]);
            }
        }

        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Vector zahlen = new Vector();
                Vector temp2 = new Vector();
                int groessteZahl;
                int kleinsteZahl;
                String temp = vectorEinleser.getText();
                String[] temp1 = temp.split(",");
                for (int i = 0; i < temp1.length; i++) {
                    zahlen.add(i, temp1[i]);
                }
                kleinsteZahl = getKleinsteZahl(zahlen);
                groessteZahl = getGroesteZahl(zahlen);

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
                    int zeit = Integer.parseInt(pauseEinleser.getText());
                    if (algorithmusAuswahl.getSelectedItem().equals("Bubble Sort")) {
                        new WorkerVisialisierung(zahlen, kacheln, zeit, "Bubble Sort").execute();
                    }
                    if (algorithmusAuswahl.getSelectedItem().equals("Quick Sort")) {
                        new WorkerVisialisierung(zahlen, kacheln, zeit, "Quick Sort").execute();
                    }
                    if (algorithmusAuswahl.getSelectedItem().equals("Shaker Sort")) {
                        new WorkerVisialisierung(zahlen, kacheln, zeit, "Shaker Sort").execute();
                    }
                    if (algorithmusAuswahl.getSelectedItem().equals("Heap Sort")) {
                        new WorkerVisialisierung(zahlen, kacheln, zeit, "Heap Sort").execute();
                    }

                }
            }


        });
    }
    public int getGroesteZahl(Vector zahlen) {
        Vector temp = new Vector();
        for (int i = 0; i < zahlen.size(); i++) {
            temp.add(Integer.parseInt(zahlen.get(i).toString()));
        }
        Collections.sort(temp);
        return Integer.parseInt(temp.get(temp.size() - 1).toString());
    }

    private int getKleinsteZahl(Vector zahlen) {
        Vector temp = new Vector();
        for (int i = 0; i < zahlen.size(); i++) {
            temp.add(Integer.parseInt(zahlen.get(i).toString()));
        }
        Collections.sort(temp);
        return Integer.parseInt(temp.get(0).toString());
    }

    private void shakerSort(Vector zahlen, int zeit){
        boolean change = true;
        int j = 0;
        int l = zahlen.size();

        while (change == true) {
            change = false;

            for (int i = j; i < l - 1; ++i) {
                if (Integer.parseInt(zahlen.get(i).toString()) > Integer.parseInt(zahlen.get(i + 1).toString())) {
                    int c = Integer.parseInt(zahlen.get(i).toString());
                    zahlen.add(i, zahlen.get(i + 1));
                    zahlen.add(i+1, c);
                    change = true;
                    //vectorDarstellen(zahlen);
                    try {
                        TimeUnit.SECONDS.sleep(zeit);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            if (change == false) {
                break;
            }
            change = false;
            l--;

            for (int i = l - 1; i >= j; i--) {
                if (Integer.parseInt(zahlen.get(i).toString()) > Integer.parseInt(zahlen.get(i + 1).toString())) {
                    int c = Integer.parseInt(zahlen.get(i).toString());
                    zahlen.add(i, zahlen.get(i + 1));
                    zahlen.add(i+1, c);
                    change = true;
                    //vectorDarstellen(zahlen);
                    try {
                        TimeUnit.SECONDS.sleep(zeit);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            j++;
        }
        System.out.println(zahlen.get(0));
        System.out.println(zahlen.get(1));
        System.out.println(zahlen.get(2));
        System.out.println(zahlen.get(3));
        System.out.println(zahlen.get(4));
        System.out.println(zahlen.get(5));
        System.out.println(zahlen.get(6));
        System.out.println(zahlen.get(7));
        System.out.println(zahlen.get(8));
        System.out.println(zahlen.get(9));

    }

    }




