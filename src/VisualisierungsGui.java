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


    int groessteZahl;
    int kleinsteZahl;
    Vector zahlen;
    int zeit;
    String algorithmus;

    /**
     * Instantiates a new Visualisierungs gui.
     * Creates the gui and adds an ActionListener.
     */
    VisualisierungsGui(Vector zahlen, int groessteZahl, int kleinsteZahl, int zeit, String algorithmus){
        super("Visualisierung von Sortieralgorithmen");

        this.zahlen = zahlen;
        this.groessteZahl = groessteZahl;
        this.kleinsteZahl = kleinsteZahl;
        this.zeit = zeit;
        this.algorithmus = algorithmus;

        JPanel[][] kacheln = new JPanel[10][10];

        JPanel hauptPanel = new JPanel();
        JPanel einstellungsPanel = new JPanel();
        JPanel visualisierungsPanel = new JPanel();

        JButton start = new JButton("Start");


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
        einstellungsPanel.add(start);

        visualisierungsPanel.setLayout(new GridLayout(10,10));

        for(int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++) {
                kacheln[i][j] = new JPanel();
                visualisierungsPanel.add(kacheln[i][j]);
            }
            new WorkerVisialisierung(zahlen, kacheln, zeit, algorithmus);
        }
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new WorkerVisialisierung(zahlen, kacheln, zeit, algorithmus);
            }
        });
    }
}




