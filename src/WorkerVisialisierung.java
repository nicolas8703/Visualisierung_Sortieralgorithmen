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


    /**
     * Instantiates a new Worker visialisierung.
     *
     * @param zahlen      die zahlen
     * @param kacheln     die kacheln für die Visualisierung
     * @param zeit        die zuverzögernde zeit
     * @param algorithmus der verwendete algorithmus
     */
    public WorkerVisialisierung(Vector zahlen, JPanel[][] kacheln, int zeit, String algorithmus) {
        this.zahlen = zahlen;
        this.kacheln = kacheln;
        this.zeit = zeit;
        this.algorithmus = algorithmus;
    }
    /**
     *  Führt eine Aufgabe aus, während das gui responive bleibt.
     */

    @Override
    protected Object doInBackground() throws Exception {
        System.out.println("test");
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
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                kachel[i][j].setBackground(null);
            }
        }
        for (int i = 0; i < 10; i++) {
            if (zahlen.size() > i) {
                for (int j = 0; j < 10; j++) {
                    if (Integer.parseInt(zahlen.get(i).toString()) >= zahlen.size() - j) {
                        kachel[j][i].setBackground(Color.BLUE);
                    }
                }
            }
        }
        try {
            TimeUnit.MILLISECONDS.sleep(zeit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
