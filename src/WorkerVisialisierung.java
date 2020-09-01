import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

/**
 * Nicolas Feige
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date 1.9.2020
 */


public class WorkerVisialisierung extends SwingWorker <Vector, Vector>{

    private Vector zahlen;
    JPanel kachel_11 = new JPanel();
    JPanel kachel_12 = new JPanel();
    JPanel kachel_13 = new JPanel();
    JPanel kachel_14 = new JPanel();
    JPanel kachel_15 = new JPanel();
    JPanel kachel_16 = new JPanel();
    JPanel kachel_17 = new JPanel();
    JPanel kachel_18 = new JPanel();
    JPanel kachel_19 = new JPanel();
    JPanel kachel_110 = new JPanel();




    public WorkerVisialisierung(Vector zahlen, JPanel kachel_11, JPanel kachel_12, JPanel kachel_13, JPanel kachel_14, JPanel kachel_15, JPanel kachel_16, JPanel kachel_17, JPanel kachel_18, JPanel kachel_19, JPanel kachel_110) {
        this.zahlen = zahlen;
        this.kachel_11 = kachel_11;
        this.kachel_12 = kachel_12;
        this.kachel_13 = kachel_13;
        this.kachel_14 = kachel_14;
        this.kachel_15 = kachel_15;
        this.kachel_16 = kachel_16;
        this.kachel_17 = kachel_17;
        this.kachel_18 = kachel_18;
        this.kachel_19 = kachel_19;
        this.kachel_110 = kachel_110;

    }


    @Override
    protected Vector doInBackground() throws Exception {

        boolean fertig = true;
        int cnt = 0;
        int vergleichungen = 0;

        while (fertig) {
            fertig = false;
            for (int i = 0; i < zahlen.size() - 1; i++) {
                if (Integer.parseInt(zahlen.get(i).toString()) > Integer.parseInt(zahlen.get(i + 1).toString())) {
                    int temp = Integer.parseInt(zahlen.get(i).toString());
                    zahlen.setElementAt(zahlen.get(i + 1), i);
                    zahlen.setElementAt(temp, i + 1);
                    fertig = true;


                    kachel_11.setBackground(null);
                    kachel_12.setBackground(null);
                    kachel_13.setBackground(null);
                    kachel_14.setBackground(null);
                    kachel_15.setBackground(null);
                    kachel_16.setBackground(null);
                    kachel_17.setBackground(null);
                    kachel_18.setBackground(null);
                    kachel_19.setBackground(null);
                    kachel_110.setBackground(null);

                    if(zahlen.size() > 0){
                        if(Integer.parseInt(zahlen.get(0).toString()) >= 1){
                            kachel_11.setBackground(Color.BLUE);
                        }
                        if(Integer.parseInt(zahlen.get(0).toString()) >= 2){
                            kachel_12.setBackground(Color.BLUE);
                        }
                        if(Integer.parseInt(zahlen.get(0).toString()) >= 3){
                            kachel_13.setBackground(Color.BLUE);
                        }
                        if(Integer.parseInt(zahlen.get(0).toString()) >= 4){
                            kachel_14.setBackground(Color.BLUE);
                        }
                        if(Integer.parseInt(zahlen.get(0).toString()) >= 5){
                            kachel_15.setBackground(Color.BLUE);
                        }
                        if(Integer.parseInt(zahlen.get(0).toString()) >= 6){
                            kachel_16.setBackground(Color.BLUE);
                        }
                        if(Integer.parseInt(zahlen.get(0).toString()) >= 7){
                            kachel_17.setBackground(Color.BLUE);
                        }
                        if(Integer.parseInt(zahlen.get(0).toString()) >= 8){
                            kachel_18.setBackground(Color.BLUE);
                        }
                        if(Integer.parseInt(zahlen.get(0).toString()) >= 9){
                            kachel_19.setBackground(Color.BLUE);
                        }
                        if(Integer.parseInt(zahlen.get(0).toString()) >= 10){
                            kachel_110.setBackground(Color.BLUE);
                        }
                    }



                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return null;
    }


    protected void done()
    {


        try
        {
            //JOptionPane.showMessageDialog();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
