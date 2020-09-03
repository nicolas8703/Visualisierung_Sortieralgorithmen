import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

/**
 * Die Klasse VisualisierungsGui.
 */
public class VisualisierungsGui extends JFrame {
    /**
     * Instantiates a new Visualisierungs gui.
     *
     * @param zahlen      Die zu sortierenden Zahlen
     * @param zeit        Die verzögerung zwischen den Visualisierungen
     * @param algorithmus Der ausgewählte Algorithmus
     * @param xValue      Der xValue ist die Anzahl der Zahlen im Zahlen Vector
     * @param yValue      Der yValue ist der grösste Wert der zu sortierenden Zahlen
     */
    VisualisierungsGui(Vector zahlen, int zeit, String algorithmus, int xValue, int yValue) {
        super("Visualisierung von Sortieralgorithmen");
        JPanel[][] kacheln = new JPanel[yValue][xValue];
        JPanel hauptPanel = new JPanel();
        JPanel einstellungsPanel = new JPanel();
        JPanel visualisierungsPanel = new JPanel();
        JButton start = new JButton("Start");
        JButton restart = new JButton("Neustart");

        getContentPane().add(hauptPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1280, 700);
        setResizable(true);

        hauptPanel.setLayout(new BorderLayout());
        hauptPanel.add(einstellungsPanel, BorderLayout.NORTH);
        hauptPanel.add(visualisierungsPanel, BorderLayout.CENTER);
        visualisierungsPanel.setBackground(Color.WHITE);
        einstellungsPanel.setLayout(new GridLayout(2, 3));
        einstellungsPanel.setBackground(Color.WHITE);
        einstellungsPanel.add(start);
        einstellungsPanel.add(restart);
        visualisierungsPanel.setLayout(new GridLayout(yValue, xValue));

        for (int i = 0; i < yValue; i++) {
            for (int j = 0; j < xValue; j++) {
                kacheln[i][j] = new JPanel();
                visualisierungsPanel.add(kacheln[i][j]);
            }
        }
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new WorkerVisialisierung(zahlen, kacheln, zeit, algorithmus, xValue, yValue).execute();
            }
        });
        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}




