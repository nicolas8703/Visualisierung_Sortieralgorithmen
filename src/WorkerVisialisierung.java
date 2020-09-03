import javax.swing.*;
import java.awt.*;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

/**
 * Nicolas Feige
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 1.8.2020
 */
public class WorkerVisialisierung extends SwingWorker {

    private Vector zahlen;
    private JPanel[][] kacheln;
    private int zeit;
    private String algorithmus;

    private int heap_cnt = 0;
    private int heap_vergleiche = 0;
    private int bubble_cnt = 0;
    private int bubble_vergleiche = 0;
    private int shaker_cnt = 0;
    private int shaker_vergleiche = 0;
    private int quick_cnt = 0;
    private int quick_vergleiche = 0;
    private JPanel visualisierungsPanel;
    private int xWert;
    private int yWert;
    private VisualisierungsGui v;


    /**
     * Instantiates a new Worker visialisierung.
     *
     * @param zahlen      die zahlen
     * @param zeit        die zuverzögernde zeit
     * @param algorithmus der verwendete algorithmus
     */
    public WorkerVisialisierung(Vector zahlen, int zeit, String algorithmus, JPanel visualisierungsPanel, int xWert, int yWert, JPanel[][] kacheln) {
        this.zahlen = zahlen;
        this.kacheln = kacheln;
        this.zeit = zeit;
        this.algorithmus = algorithmus;
        this.visualisierungsPanel = visualisierungsPanel;
        this.xWert = xWert;
        this.yWert = yWert;
        //this.v = v;
        //kacheln = new JPanel[yWert][xWert];
    }
    /**
     *  Führt eine Aufgabe aus, während das gui responive bleibt.
     */

    @Override
    protected Object doInBackground() throws Exception {

        kacheln[1][2].setBackground(Color.CYAN);
        visualisierungsPanel.setVisible(true);
        if(algorithmus == "Bubble Sort"){
            bubbleSort(zahlen, zeit);
            JOptionPane.showMessageDialog(null,
                    "Vergleiche: "+ bubble_vergleiche +"\n" +
                            "Schleifendurchläufe: "+ bubble_cnt + "\n");
        }
        if(algorithmus == "Quick Sort"){
            int start = 0;
            int end = zahlen.size()-1;
            quickSort(zahlen, zeit, start, end);
            JOptionPane.showMessageDialog(null,
                    "Vergleiche: "+ quick_vergleiche +"\n" +
                            "Schleifendurchläufe: "+ quick_cnt + "\n");
        }
        if(algorithmus == "Shaker Sort"){
            shakerSort(zahlen, zeit);
            JOptionPane.showMessageDialog(null,
                    "Vergleiche: "+ shaker_vergleiche +"\n" +
                            "Schleifendurchläufe: "+ shaker_cnt + "\n");
        }
        if(algorithmus == "Heap Sort"){
            heapSort(zahlen, zeit);
            JOptionPane.showMessageDialog(null,
                    "Vergleiche: "+ heap_vergleiche +"\n" +
                            "Schleifendurchläufe: "+ heap_cnt + "\n");
        }
        //visualisierungsPanel.removeAll();
        return null;
    }

    /**
     * Bubble sort.
     *
     * @param zahlen the zahlen
     * @param zeit   the zeit
     */
    public void bubbleSort(Vector zahlen, int zeit){
        boolean fertig = true;
        vectorDarstellen(zahlen, kacheln, zeit);
        while (fertig) {
            fertig = false;
            for (int i = 0; i < zahlen.size() - 1; i++) {
                if (Integer.parseInt(zahlen.get(i).toString()) > Integer.parseInt(zahlen.get(i + 1).toString())) {
                    int temp = Integer.parseInt(zahlen.get(i).toString());
                    zahlen.setElementAt(zahlen.get(i + 1), i);
                    zahlen.setElementAt(temp, i + 1);
                    fertig = true;
                    vectorDarstellen(zahlen, kacheln, zeit);
                }
                bubble_cnt++;
                bubble_vergleiche++;
            }
        }
    }

    /**
     * Shaker sort.
     *
     * @param zahlen the zahlen
     * @param zeit   the zeit
     */
    private void shakerSort(Vector zahlen, int zeit) {
        boolean fertig = true;
        int j = 0;
        int l = zahlen.size();
        vectorDarstellen(zahlen, kacheln, zeit);
        while (fertig) {
            fertig = false;
            for (int i = j; i < l - 1; ++i) {
                if (Integer.parseInt(zahlen.get(i).toString()) > Integer.parseInt(zahlen.get(i + 1).toString())) {
                    int temp = Integer.parseInt(zahlen.get(i).toString());
                    zahlen.setElementAt(zahlen.get(i + 1), i);
                    zahlen.setElementAt(temp, i + 1);
                    fertig = true;
                    shaker_vergleiche++;
                }
                shaker_cnt++;
            }
            if (!fertig) {
                break;
            }
            fertig = false;
            l--;
            for (int i = l - 1; i >= j; i--) {
                if (Integer.parseInt(zahlen.get(i).toString()) > Integer.parseInt(zahlen.get(i+1).toString())) {
                    int temp = Integer.parseInt(zahlen.get(i).toString());
                    zahlen.setElementAt(zahlen.get(i + 1), i);
                    zahlen.setElementAt(temp, i + 1);
                    fertig = true;
                    vectorDarstellen(zahlen, kacheln, zeit);
                    shaker_vergleiche++;
                }
                shaker_cnt++;
            }
            j++;
        }
        vectorDarstellen(zahlen, kacheln, zeit);
    }

    /**
     * Heap sort.
     *
     * @param zahlen the zahlen
     * @param zeit   the zeit
     */
    private void heapSort(Vector zahlen, int zeit) {
        int n = zahlen.size();
        vectorDarstellen(zahlen, kacheln, zeit);
        for (int i = n / 2 - 1; i >= 0; i--) {
            heap(zahlen, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = Integer.parseInt(zahlen.get(0).toString());
            zahlen.setElementAt(zahlen.get(i) ,0);;
            zahlen.setElementAt(temp, i);
            vectorDarstellen(zahlen, kacheln, zeit);
            heap_vergleiche++;
            heap(zahlen, i, 0);
        }
    }

    /**
     * Heap.
     *
     * @param zahlen the zahlen
     * @param n      the n
     * @param i      the
     */
    public void heap(Vector zahlen, int n, int i) {
        heap_cnt++;
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && Integer.parseInt(zahlen.get(l).toString()) > Integer.parseInt(zahlen.get(largest).toString())) {
            largest = l;
        }
        if (r < n && Integer.parseInt(zahlen.get(r).toString()) > Integer.parseInt(zahlen.get(largest).toString())) {
            largest = r;
        }
        if (largest != i) {
            heap_vergleiche++;
            int swap = Integer.parseInt(zahlen.get(i).toString());
            zahlen.setElementAt(zahlen.get(largest), i);
            zahlen.setElementAt(swap, largest);
            vectorDarstellen(zahlen, kacheln, zeit);
            heap(zahlen, n, largest);
        }
    }

    /**
     * Quick sort.
     *
     * @param zahlen the zahlen
     * @param zeit   the zeit
     * @param start  the start
     * @param end    the end
     */
    private void quickSort(Vector zahlen, int zeit, int start, int end) {
        quick_cnt++;
        vectorDarstellen(zahlen, kacheln, zeit);
        int partition = quick(zahlen, start, end);

        if (partition - 1 > start) {
            quick_vergleiche++;
            quickSort(zahlen, zeit, start, partition - 1);
            vectorDarstellen(zahlen, kacheln, zeit);
        }
        if (partition + 1 < end) {
            quick_vergleiche++;
            quickSort(zahlen, zeit, partition + 1, end);
            vectorDarstellen(zahlen, kacheln, zeit);
        }
    }

    /**
     * Quick int.
     *
     * @param zahlen the zahlen
     * @param start  the start
     * @param end    the end
     * @return the int
     */
    public int quick(Vector zahlen, int start, int end) {
        int pivoit = Integer.parseInt(zahlen.get(end).toString());

        for (int i = start; i < end; i++) {
            if (Integer.parseInt(zahlen.get(i).toString()) < pivoit) {
                int temp = Integer.parseInt(zahlen.get(start).toString());
                zahlen.setElementAt(zahlen.get(i), start);
                zahlen.setElementAt(temp, i);
                start++;
                quick_cnt++;
            }
        }
        int temp = Integer.parseInt(zahlen.get(start).toString());
        zahlen.setElementAt(pivoit, start);
        zahlen.setElementAt(temp, end);
        return start;
    }
/**
 * Stellt den Vector zahlen visuel dar
 *
 */
    private void vectorDarstellen(Vector zahlen, JPanel[][] kachel, int zeit){
        for (int i = 0; i < yWert; i++) {
            for (int j = 0; j < xWert; j++) {
                kachel[i][j].setBackground(null);
            }
        }
        for (int i = 0; i < xWert; i++) {
            if (zahlen.size() > xWert) {
                for (int j = 0; j < yWert; j++) {
                    if (Integer.parseInt(zahlen.get(xWert).toString()) >= zahlen.size() - yWert) {
                        kachel[yWert][xWert].setBackground(Color.BLUE);
                    }
                }
            }
        }
        try {
            TimeUnit.MILLISECONDS.sleep(zeit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        visualisierungsPanel.setVisible(true);
    }

                /**
                if(Integer.parseInt(zahlen.get(xWert).toString()) >= 1){
                    kachel[9][xWert].setBackground(Color.BLUE);
                }
                if(Integer.parseInt(zahlen.get(xWert).toString()) >= 2){
                    kachel[8][xWert].setBackground(Color.BLUE);
                }
                if(Integer.parseInt(zahlen.get(xWert).toString()) >= 3){
                    kachel[7][xWert].setBackground(Color.BLUE);
                }
                if(Integer.parseInt(zahlen.get(xWert).toString()) >= 4){
                    kachel[6][xWert].setBackground(Color.BLUE);
                }
                if(Integer.parseInt(zahlen.get(xWert).toString()) >= 5){
                    kachel[5][xWert].setBackground(Color.BLUE);
                }
                if(Integer.parseInt(zahlen.get(xWert).toString()) >= 6){
                    kachel[4][xWert].setBackground(Color.BLUE);
                }
                if(Integer.parseInt(zahlen.get(xWert).toString()) >= 7){
                    kachel[3][xWert].setBackground(Color.BLUE);
                }
                if(Integer.parseInt(zahlen.get(xWert).toString()) >= 8){
                    kachel[2][xWert].setBackground(Color.BLUE);
                }
                if(Integer.parseInt(zahlen.get(xWert).toString()) >= 9){
                    kachel[1][xWert].setBackground(Color.BLUE);
                }
                if(Integer.parseInt(zahlen.get(xWert).toString()) >= 10){
                    kachel[0][xWert].setBackground(Color.BLUE);
                }



        if(zahlen.size() > 0){
            if(Integer.parseInt(zahlen.get(0).toString()) >= 1){
                kachel[9][0].setBackground(Color.BLUE);
            }
            if(Integer.parseInt(zahlen.get(0).toString()) >= 2){
                kachel[8][0].setBackground(Color.BLUE);
            }
            if(Integer.parseInt(zahlen.get(0).toString()) >= 3){
                kachel[7][0].setBackground(Color.BLUE);
            }
            if(Integer.parseInt(zahlen.get(0).toString()) >= 4){
                kachel[6][0].setBackground(Color.BLUE);
            }
            if(Integer.parseInt(zahlen.get(0).toString()) >= 5){
                kachel[5][0].setBackground(Color.BLUE);
            }
            if(Integer.parseInt(zahlen.get(0).toString()) >= 6){
                kachel[4][0].setBackground(Color.BLUE);
            }
            if(Integer.parseInt(zahlen.get(0).toString()) >= 7){
                kachel[3][0].setBackground(Color.BLUE);
            }
            if(Integer.parseInt(zahlen.get(0).toString()) >= 8){
                kachel[2][0].setBackground(Color.BLUE);
            }
            if(Integer.parseInt(zahlen.get(0).toString()) >= 9){
                kachel[1][0].setBackground(Color.BLUE);
            }
            if(Integer.parseInt(zahlen.get(0).toString()) >= 10){
                kachel[0][0].setBackground(Color.BLUE);
            }
        }
        if(zahlen.size() > 1){
            if(Integer.parseInt(zahlen.get(1).toString()) >= 1){
                kachel[9][1].setBackground(Color.CYAN);
            }
            if(Integer.parseInt(zahlen.get(1).toString()) >= 2){
                kachel[8][1].setBackground(Color.CYAN);
            }
            if(Integer.parseInt(zahlen.get(1).toString()) >= 3){
                kachel[7][1].setBackground(Color.CYAN);
            }
            if(Integer.parseInt(zahlen.get(1).toString()) >= 4){
                kachel[6][1].setBackground(Color.CYAN);
            }
            if(Integer.parseInt(zahlen.get(1).toString()) >= 5){
                kachel[5][1].setBackground(Color.CYAN);
            }
            if(Integer.parseInt(zahlen.get(1).toString()) >= 6){
                kachel[4][1].setBackground(Color.CYAN);
            }
            if(Integer.parseInt(zahlen.get(1).toString()) >= 7){
                kachel[3][1].setBackground(Color.CYAN);
            }
            if(Integer.parseInt(zahlen.get(1).toString()) >= 8){
                kachel[2][1].setBackground(Color.CYAN);
            }
            if(Integer.parseInt(zahlen.get(1).toString()) >= 9){
                kachel[1][1].setBackground(Color.CYAN);
            }
            if(Integer.parseInt(zahlen.get(1).toString()) >= 10){
                kachel[0][1].setBackground(Color.CYAN);
            }
        }
        if(zahlen.size() > 2){
            if(Integer.parseInt(zahlen.get(2).toString()) >= 1){
                kachel[9][2].setBackground(Color.yellow);
            }
            if(Integer.parseInt(zahlen.get(2).toString()) >= 2){
                kachel[8][2].setBackground(Color.yellow);
            }
            if(Integer.parseInt(zahlen.get(2).toString()) >= 3){
                kachel[7][2].setBackground(Color.yellow);
            }
            if(Integer.parseInt(zahlen.get(2).toString()) >= 4){
                kachel[6][2].setBackground(Color.yellow);
            }
            if(Integer.parseInt(zahlen.get(2).toString()) >= 5){
                kachel[5][2].setBackground(Color.yellow);
            }
            if(Integer.parseInt(zahlen.get(2).toString()) >= 6){
                kachel[4][2].setBackground(Color.yellow);
            }
            if(Integer.parseInt(zahlen.get(2).toString()) >= 7){
                kachel[3][2].setBackground(Color.yellow);
            }
            if(Integer.parseInt(zahlen.get(2).toString()) >= 8){
                kachel[2][2].setBackground(Color.yellow);
            }
            if(Integer.parseInt(zahlen.get(2).toString()) >= 9){
                kachel[1][2].setBackground(Color.yellow);
            }
            if(Integer.parseInt(zahlen.get(2).toString()) >= 10){
                kachel[0][2].setBackground(Color.yellow);
            }
        }
        if(zahlen.size() > 3){
            if(Integer.parseInt(zahlen.get(3).toString()) >= 1){
                kachel[9][3].setBackground(Color.GRAY);
            }
            if(Integer.parseInt(zahlen.get(3).toString()) >= 2){
                kachel[8][3].setBackground(Color.GRAY);
            }
            if(Integer.parseInt(zahlen.get(3).toString()) >= 3){
                kachel[7][3].setBackground(Color.GRAY);
            }
            if(Integer.parseInt(zahlen.get(3).toString()) >= 4){
                kachel[6][3].setBackground(Color.GRAY);
            }
            if(Integer.parseInt(zahlen.get(3).toString()) >= 5){
                kachel[5][3].setBackground(Color.GRAY);
            }
            if(Integer.parseInt(zahlen.get(3).toString()) >= 6){
                kachel[4][3].setBackground(Color.GRAY);
            }
            if(Integer.parseInt(zahlen.get(3).toString()) >= 7){
                kachel[3][3].setBackground(Color.GRAY);
            }
            if(Integer.parseInt(zahlen.get(3).toString()) >= 8){
                kachel[2][3].setBackground(Color.GRAY);
            }
            if(Integer.parseInt(zahlen.get(3).toString()) >= 9){
                kachel[1][3].setBackground(Color.GRAY);
            }
            if(Integer.parseInt(zahlen.get(3).toString()) >= 10){
                kachel[0][3].setBackground(Color.GRAY);
            }
        }
        if(zahlen.size() > 4){
            if(Integer.parseInt(zahlen.get(4).toString()) >= 1){
                kachel[9][4].setBackground(Color.MAGENTA);
            }
            if(Integer.parseInt(zahlen.get(4).toString()) >= 2){
                kachel[8][4].setBackground(Color.MAGENTA);
            }
            if(Integer.parseInt(zahlen.get(4).toString()) >= 3){
                kachel[7][4].setBackground(Color.MAGENTA);
            }
            if(Integer.parseInt(zahlen.get(4).toString()) >= 4){
                kachel[6][4].setBackground(Color.MAGENTA);
            }
            if(Integer.parseInt(zahlen.get(4).toString()) >= 5){
                kachel[5][4].setBackground(Color.MAGENTA);
            }
            if(Integer.parseInt(zahlen.get(4).toString()) >= 6){
                kachel[4][4].setBackground(Color.MAGENTA);
            }
            if(Integer.parseInt(zahlen.get(4).toString()) >= 7){
                kachel[3][4].setBackground(Color.MAGENTA);
            }
            if(Integer.parseInt(zahlen.get(4).toString()) >= 8){
                kachel[2][4].setBackground(Color.MAGENTA);
            }
            if(Integer.parseInt(zahlen.get(4).toString()) >= 9){
                kachel[1][4].setBackground(Color.MAGENTA);
            }
            if(Integer.parseInt(zahlen.get(4).toString()) >= 10){
                kachel[0][4].setBackground(Color.MAGENTA);
            }
        }
        if(zahlen.size() > 5){
            if(Integer.parseInt(zahlen.get(5).toString()) >= 1){
                kachel[9][5].setBackground(Color.DARK_GRAY);
            }
            if(Integer.parseInt(zahlen.get(5).toString()) >= 2){
                kachel[8][5].setBackground(Color.DARK_GRAY);
            }
            if(Integer.parseInt(zahlen.get(5).toString()) >= 3){
                kachel[7][5].setBackground(Color.DARK_GRAY);
            }
            if(Integer.parseInt(zahlen.get(5).toString()) >= 4){
                kachel[6][5].setBackground(Color.DARK_GRAY);
            }
            if(Integer.parseInt(zahlen.get(5).toString()) >= 5){
                kachel[5][5].setBackground(Color.DARK_GRAY);
            }
            if(Integer.parseInt(zahlen.get(5).toString()) >= 6){
                kachel[4][5].setBackground(Color.DARK_GRAY);
            }
            if(Integer.parseInt(zahlen.get(5).toString()) >= 7){
                kachel[3][5].setBackground(Color.DARK_GRAY);
            }
            if(Integer.parseInt(zahlen.get(5).toString()) >= 8){
                kachel[2][5].setBackground(Color.DARK_GRAY);
            }
            if(Integer.parseInt(zahlen.get(5).toString()) >= 9){
                kachel[1][5].setBackground(Color.DARK_GRAY);
            }
            if(Integer.parseInt(zahlen.get(5).toString()) >= 10){
                kachel[0][5].setBackground(Color.DARK_GRAY);
            }
        }
        if(zahlen.size() > 6){
            if(Integer.parseInt(zahlen.get(6).toString()) >= 1){
                kachel[9][6].setBackground(Color.RED);
            }
            if(Integer.parseInt(zahlen.get(6).toString()) >= 2){
                kachel[8][6].setBackground(Color.RED);
            }
            if(Integer.parseInt(zahlen.get(6).toString()) >= 3){
                kachel[7][6].setBackground(Color.RED);
            }
            if(Integer.parseInt(zahlen.get(6).toString()) >= 4){
                kachel[6][6].setBackground(Color.RED);
            }
            if(Integer.parseInt(zahlen.get(6).toString()) >= 5){
                kachel[5][6].setBackground(Color.RED);
            }
            if(Integer.parseInt(zahlen.get(6).toString()) >= 6){
                kachel[4][6].setBackground(Color.RED);
            }
            if(Integer.parseInt(zahlen.get(6).toString()) >= 7){
                kachel[3][6].setBackground(Color.RED);
            }
            if(Integer.parseInt(zahlen.get(6).toString()) >= 8){
                kachel[2][6].setBackground(Color.RED);
            }
            if(Integer.parseInt(zahlen.get(6).toString()) >= 9){
                kachel[1][6].setBackground(Color.RED);
            }
            if(Integer.parseInt(zahlen.get(6).toString()) >= 10){
                kachel[0][6].setBackground(Color.RED);
            }
        }
        if(zahlen.size() > 7){
            if(Integer.parseInt(zahlen.get(7).toString()) >= 1){
                kachel[9][7].setBackground(Color.GREEN);
            }
            if(Integer.parseInt(zahlen.get(7).toString()) >= 2){
                kachel[8][7].setBackground(Color.GREEN);
            }
            if(Integer.parseInt(zahlen.get(7).toString()) >= 3){
                kachel[7][7].setBackground(Color.GREEN);
            }
            if(Integer.parseInt(zahlen.get(7).toString()) >= 4){
                kachel[6][7].setBackground(Color.GREEN);
            }
            if(Integer.parseInt(zahlen.get(7).toString()) >= 5){
                kachel[5][7].setBackground(Color.GREEN);
            }
            if(Integer.parseInt(zahlen.get(7).toString()) >= 6){
                kachel[4][7].setBackground(Color.GREEN);
            }
            if(Integer.parseInt(zahlen.get(7).toString()) >= 7){
                kachel[3][7].setBackground(Color.GREEN);
            }
            if(Integer.parseInt(zahlen.get(7).toString()) >= 8){
                kachel[2][7].setBackground(Color.GREEN);
            }
            if(Integer.parseInt(zahlen.get(7).toString()) >= 9){
                kachel[1][7].setBackground(Color.GREEN);
            }
            if(Integer.parseInt(zahlen.get(7).toString()) >= 10){
                kachel[0][7].setBackground(Color.GREEN);
            }
        }
        if(zahlen.size() > 8){
            if(Integer.parseInt(zahlen.get(8).toString()) >= 1){
                kachel[9][8].setBackground(Color.ORANGE);
            }
            if(Integer.parseInt(zahlen.get(8).toString()) >= 2){
                kachel[8][8].setBackground(Color.ORANGE);
            }
            if(Integer.parseInt(zahlen.get(8).toString()) >= 3){
                kachel[7][8].setBackground(Color.ORANGE);
            }
            if(Integer.parseInt(zahlen.get(8).toString()) >= 4){
                kachel[6][8].setBackground(Color.ORANGE);
            }
            if(Integer.parseInt(zahlen.get(8).toString()) >= 5){
                kachel[5][8].setBackground(Color.ORANGE);
            }
            if(Integer.parseInt(zahlen.get(8).toString()) >= 6){
                kachel[4][8].setBackground(Color.ORANGE);
            }
            if(Integer.parseInt(zahlen.get(8).toString()) >= 7){
                kachel[3][8].setBackground(Color.ORANGE);
            }
            if(Integer.parseInt(zahlen.get(8).toString()) >= 8){
                kachel[2][8].setBackground(Color.ORANGE);
            }
            if(Integer.parseInt(zahlen.get(8).toString()) >= 9){
                kachel[1][8].setBackground(Color.ORANGE);
            }
            if(Integer.parseInt(zahlen.get(8).toString()) >= 10){
                kachel[0][8].setBackground(Color.ORANGE);
            }
        }
        if(zahlen.size() > 9){
            if(Integer.parseInt(zahlen.get(9).toString()) >= 1){
                kachel[9][9].setBackground(Color.PINK);
            }
            if(Integer.parseInt(zahlen.get(9).toString()) >= 2){
                kachel[8][9].setBackground(Color.PINK);
            }
            if(Integer.parseInt(zahlen.get(9).toString()) >= 3){
                kachel[7][9].setBackground(Color.PINK);
            }
            if(Integer.parseInt(zahlen.get(9).toString()) >= 4){
                kachel[6][9].setBackground(Color.PINK);
            }
            if(Integer.parseInt(zahlen.get(9).toString()) >= 5){
                kachel[5][9].setBackground(Color.PINK);
            }
            if(Integer.parseInt(zahlen.get(9).toString()) >= 6){
                kachel[4][9].setBackground(Color.PINK);
            }
            if(Integer.parseInt(zahlen.get(9).toString()) >= 7){
                kachel[3][9].setBackground(Color.PINK);
            }
            if(Integer.parseInt(zahlen.get(9).toString()) >= 8){
                kachel[2][9].setBackground(Color.PINK);
            }
            if(Integer.parseInt(zahlen.get(9).toString()) >= 9){
                kachel[1][9].setBackground(Color.PINK);
            }
            if(Integer.parseInt(zahlen.get(9).toString()) >= 10){
                kachel[0][9].setBackground(Color.PINK);
            }
        }
                 */
}
