import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    private JPanel kachel_11 = new JPanel();
    private JPanel kachel_12 = new JPanel();
    private JPanel kachel_13 = new JPanel();
    private JPanel kachel_14 = new JPanel();
    private JPanel kachel_15 = new JPanel();
    private JPanel kachel_16 = new JPanel();
    private JPanel kachel_17 = new JPanel();
    private JPanel kachel_18 = new JPanel();
    private JPanel kachel_19 = new JPanel();
    private JPanel kachel_110 = new JPanel();

    private JPanel kachel_21 = new JPanel();
    private JPanel kachel_22 = new JPanel();
    private JPanel kachel_23 = new JPanel();
    private JPanel kachel_24 = new JPanel();
    private JPanel kachel_25 = new JPanel();
    private JPanel kachel_26 = new JPanel();
    private JPanel kachel_27 = new JPanel();
    private JPanel kachel_28 = new JPanel();
    private JPanel kachel_29 = new JPanel();
    private JPanel kachel_210 = new JPanel();

    private JPanel kachel_31 = new JPanel();
    private JPanel kachel_32 = new JPanel();
    private JPanel kachel_33 = new JPanel();
    private JPanel kachel_34 = new JPanel();
    private JPanel kachel_35 = new JPanel();
    private JPanel kachel_36 = new JPanel();
    private JPanel kachel_37 = new JPanel();
    private JPanel kachel_38 = new JPanel();
    private JPanel kachel_39 = new JPanel();
    private JPanel kachel_310 = new JPanel();

    private JPanel kachel_41 = new JPanel();
    private JPanel kachel_42 = new JPanel();
    private JPanel kachel_43 = new JPanel();
    private JPanel kachel_44 = new JPanel();
    private JPanel kachel_45 = new JPanel();
    private JPanel kachel_46 = new JPanel();
    private JPanel kachel_47 = new JPanel();
    private JPanel kachel_48 = new JPanel();
    private JPanel kachel_49 = new JPanel();
    private JPanel kachel_410 = new JPanel();

    private JPanel kachel_51 = new JPanel();
    private JPanel kachel_52 = new JPanel();
    private JPanel kachel_53 = new JPanel();
    private JPanel kachel_54 = new JPanel();
    private JPanel kachel_55 = new JPanel();
    private JPanel kachel_56 = new JPanel();
    private JPanel kachel_57 = new JPanel();
    private JPanel kachel_58 = new JPanel();
    private JPanel kachel_59 = new JPanel();
    private JPanel kachel_510 = new JPanel();

    private JPanel kachel_61 = new JPanel();
    private JPanel kachel_62 = new JPanel();
    private JPanel kachel_63 = new JPanel();
    private JPanel kachel_64 = new JPanel();
    private JPanel kachel_65 = new JPanel();
    private JPanel kachel_66 = new JPanel();
    private JPanel kachel_67 = new JPanel();
    private JPanel kachel_68 = new JPanel();
    private JPanel kachel_69 = new JPanel();
    private JPanel kachel_610 = new JPanel();

    private JPanel kachel_71 = new JPanel();
    private JPanel kachel_72 = new JPanel();
    private JPanel kachel_73 = new JPanel();
    private JPanel kachel_74 = new JPanel();
    private JPanel kachel_75 = new JPanel();
    private JPanel kachel_76 = new JPanel();
    private JPanel kachel_77 = new JPanel();
    private JPanel kachel_78 = new JPanel();
    private JPanel kachel_79 = new JPanel();
    private JPanel kachel_710 = new JPanel();

    private JPanel kachel_81 = new JPanel();
    private JPanel kachel_82 = new JPanel();
    private JPanel kachel_83 = new JPanel();
    private JPanel kachel_84 = new JPanel();
    private JPanel kachel_85 = new JPanel();
    private JPanel kachel_86 = new JPanel();
    private JPanel kachel_87 = new JPanel();
    private JPanel kachel_88 = new JPanel();
    private JPanel kachel_89 = new JPanel();
    private JPanel kachel_810 = new JPanel();

    private JPanel kachel_91 = new JPanel();
    private JPanel kachel_92 = new JPanel();
    private JPanel kachel_93 = new JPanel();
    private JPanel kachel_94 = new JPanel();
    private JPanel kachel_95 = new JPanel();
    private JPanel kachel_96 = new JPanel();
    private JPanel kachel_97 = new JPanel();
    private JPanel kachel_98 = new JPanel();
    private JPanel kachel_99 = new JPanel();
    private JPanel kachel_910 = new JPanel();

    private JPanel kachel_101 = new JPanel();
    private JPanel kachel_102 = new JPanel();
    private JPanel kachel_103 = new JPanel();
    private JPanel kachel_104 = new JPanel();
    private JPanel kachel_105 = new JPanel();
    private JPanel kachel_106 = new JPanel();
    private JPanel kachel_107 = new JPanel();
    private JPanel kachel_108 = new JPanel();
    private JPanel kachel_109 = new JPanel();
    private JPanel kachel_1010 = new JPanel();

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
        super("Tschau Sepp");
        getContentPane().add(hauptPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1280, 720);
        setResizable(false);

        hauptPanel.setLayout(new BorderLayout());
        hauptPanel.add(einstellungsPanel, BorderLayout.NORTH);
        hauptPanel.add(visualisierungsPanel, BorderLayout.CENTER);
        //einstellungsPanel.setBackground(Color.MAGENTA);
        //einstellungsPanel.setSize(1280, 220);
        visualisierungsPanel.setBackground(Color.WHITE);
        //visualisierungsPanel.setSize(1280, 500);

        einstellungsPanel.setLayout(new GridLayout(2,3));
        einstellungsPanel.add(algorithmusAuswahlTitel);
        algorithmusAuswahlTitel.setText("Algorithmus: ");
        einstellungsPanel.add(vectorEinleserTitel);
        vectorEinleserTitel.setText("Zahlen eingeben: (von 0-10, mit ',' dazwischen und maximal 10 Zahlen)");
        einstellungsPanel.add(pauseEinleserTitel);
        pauseEinleserTitel.setText("Pause zwischen den Sortierungen: (in Sekunden)");
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
        visualisierungsPanel.add(kachel_110);
        visualisierungsPanel.add(kachel_210);
        visualisierungsPanel.add(kachel_310);
        visualisierungsPanel.add(kachel_410);
        visualisierungsPanel.add(kachel_510);
        visualisierungsPanel.add(kachel_610);
        visualisierungsPanel.add(kachel_710);
        visualisierungsPanel.add(kachel_810);
        visualisierungsPanel.add(kachel_910);
        visualisierungsPanel.add(kachel_1010);

        visualisierungsPanel.add(kachel_19);
        visualisierungsPanel.add(kachel_29);
        visualisierungsPanel.add(kachel_39);
        visualisierungsPanel.add(kachel_49);
        visualisierungsPanel.add(kachel_59);
        visualisierungsPanel.add(kachel_69);
        visualisierungsPanel.add(kachel_79);
        visualisierungsPanel.add(kachel_89);
        visualisierungsPanel.add(kachel_99);
        visualisierungsPanel.add(kachel_109);

        visualisierungsPanel.add(kachel_18);
        visualisierungsPanel.add(kachel_28);
        visualisierungsPanel.add(kachel_38);
        visualisierungsPanel.add(kachel_48);
        visualisierungsPanel.add(kachel_58);
        visualisierungsPanel.add(kachel_68);
        visualisierungsPanel.add(kachel_78);
        visualisierungsPanel.add(kachel_88);
        visualisierungsPanel.add(kachel_98);
        visualisierungsPanel.add(kachel_108);

        visualisierungsPanel.add(kachel_17);
        visualisierungsPanel.add(kachel_27);
        visualisierungsPanel.add(kachel_37);
        visualisierungsPanel.add(kachel_47);
        visualisierungsPanel.add(kachel_57);
        visualisierungsPanel.add(kachel_67);
        visualisierungsPanel.add(kachel_77);
        visualisierungsPanel.add(kachel_87);
        visualisierungsPanel.add(kachel_97);
        visualisierungsPanel.add(kachel_107);

        visualisierungsPanel.add(kachel_16);
        visualisierungsPanel.add(kachel_26);
        visualisierungsPanel.add(kachel_36);
        visualisierungsPanel.add(kachel_46);
        visualisierungsPanel.add(kachel_56);
        visualisierungsPanel.add(kachel_66);
        visualisierungsPanel.add(kachel_76);
        visualisierungsPanel.add(kachel_86);
        visualisierungsPanel.add(kachel_96);
        visualisierungsPanel.add(kachel_106);

        visualisierungsPanel.add(kachel_15);
        visualisierungsPanel.add(kachel_25);
        visualisierungsPanel.add(kachel_35);
        visualisierungsPanel.add(kachel_45);
        visualisierungsPanel.add(kachel_55);
        visualisierungsPanel.add(kachel_65);
        visualisierungsPanel.add(kachel_75);
        visualisierungsPanel.add(kachel_85);
        visualisierungsPanel.add(kachel_95);
        visualisierungsPanel.add(kachel_105);

        visualisierungsPanel.add(kachel_14);
        visualisierungsPanel.add(kachel_24);
        visualisierungsPanel.add(kachel_34);
        visualisierungsPanel.add(kachel_44);
        visualisierungsPanel.add(kachel_54);
        visualisierungsPanel.add(kachel_64);
        visualisierungsPanel.add(kachel_74);
        visualisierungsPanel.add(kachel_84);
        visualisierungsPanel.add(kachel_94);
        visualisierungsPanel.add(kachel_104);

        visualisierungsPanel.add(kachel_13);
        visualisierungsPanel.add(kachel_23);
        visualisierungsPanel.add(kachel_33);
        visualisierungsPanel.add(kachel_43);
        visualisierungsPanel.add(kachel_53);
        visualisierungsPanel.add(kachel_63);
        visualisierungsPanel.add(kachel_73);
        visualisierungsPanel.add(kachel_83);
        visualisierungsPanel.add(kachel_93);
        visualisierungsPanel.add(kachel_103);

        visualisierungsPanel.add(kachel_12);
        visualisierungsPanel.add(kachel_22);
        visualisierungsPanel.add(kachel_32);
        visualisierungsPanel.add(kachel_42);
        visualisierungsPanel.add(kachel_52);
        visualisierungsPanel.add(kachel_62);
        visualisierungsPanel.add(kachel_72);
        visualisierungsPanel.add(kachel_82);
        visualisierungsPanel.add(kachel_92);
        visualisierungsPanel.add(kachel_102);

        visualisierungsPanel.add(kachel_11);
        visualisierungsPanel.add(kachel_21);
        visualisierungsPanel.add(kachel_31);
        visualisierungsPanel.add(kachel_41);
        visualisierungsPanel.add(kachel_51);
        visualisierungsPanel.add(kachel_61);
        visualisierungsPanel.add(kachel_71);
        visualisierungsPanel.add(kachel_81);
        visualisierungsPanel.add(kachel_91);
        visualisierungsPanel.add(kachel_101);

        Vector zahlen1 = new Vector();
        zahlen1.add(10);
        zahlen1.add(9);
        zahlen1.add(8);
        zahlen1.add(7);
        zahlen1.add(6);
        zahlen1.add(5);
        zahlen1.add(4);
        zahlen1.add(3);
        zahlen1.add(2);
        zahlen1.add(1);
        //bubbleSort(zahlen1, 1);

        //shakerSort(zahlen1, 1);


        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                new WorkerVisialisierung(zahlen1, kachel_11, kachel_12, kachel_13, kachel_14, kachel_15, kachel_16, kachel_17, kachel_18, kachel_19, kachel_110).execute();
            }
        });



        /**
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Vector zahlen = new Vector();
                String temp = vectorEinleser.getText();
                String[] temp1 = temp.split(",");
                for (int i = 0; i < temp1.length; i++) {
                    zahlen.add(i, temp1[i]);
                }

                if(pauseEinleser.getText().isEmpty() || vectorEinleser.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Bitte alle Felder ausfüllen!","Fehlermeldung",JOptionPane.WARNING_MESSAGE);
                }else if(Integer.parseInt(pauseEinleser.getText().toString()) < 1){
                    JOptionPane.showMessageDialog(null,"Die Pause muss mindestens eine Sekunde lang sein!","Fehlermeldung",JOptionPane.WARNING_MESSAGE);
                }else if(Integer.parseInt(pauseEinleser.getText().toString()) > 5){
                    JOptionPane.showMessageDialog(null,"Die Pause darf höchstens fünf Sekunden lang sein!","Fehlermeldung",JOptionPane.WARNING_MESSAGE);
                }else if(zahlen.size() > 10){
                    JOptionPane.showMessageDialog(null,"Es dürfen maximal 10 Zahlen eingegeben werden","Fehlermeldung",JOptionPane.WARNING_MESSAGE);
                }else if(zahlen.size() < 3){
                    JOptionPane.showMessageDialog(null,"Es müssen mindestens 4 Zahlen eingegeben werden","Fehlermeldung",JOptionPane.WARNING_MESSAGE);
                }else {
                    if(algorithmusAuswahl.getSelectedItem().equals("Bubble Sort")){

                        Vector zahlen1 = new Vector();
                        zahlen1.add(10);
                        zahlen1.add(9);
                        zahlen1.add(8);
                        zahlen1.add(7);
                        zahlen1.add(6);
                        zahlen1.add(5);
                        zahlen1.add(4);
                        zahlen1.add(3);
                        zahlen1.add(2);
                        zahlen1.add(1);
                        int zeit = Integer.parseInt(pauseEinleser.getText().toString());
                        bubbleSort(zahlen1, 1);

                    }
                    if(algorithmusAuswahl.getSelectedItem().equals("Quick Sort")){
                        System.out.println("Quick Sort");
                    }
                    if(algorithmusAuswahl.getSelectedItem().equals("Shaker Sort")){
                        System.out.println("Shaker Sort");
                    }
                    if(algorithmusAuswahl.getSelectedItem().equals("Heap Sort")){
                        System.out.println("Heap Sort");

                    }
                }
            }
        });
                         */


    }


    public void vectorDarstellen(Vector zahlen){

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

        kachel_21.setBackground(null);
        kachel_22.setBackground(null);
        kachel_23.setBackground(null);
        kachel_24.setBackground(null);
        kachel_25.setBackground(null);
        kachel_26.setBackground(null);
        kachel_27.setBackground(null);
        kachel_28.setBackground(null);
        kachel_29.setBackground(null);
        kachel_210.setBackground(null);

        kachel_32.setBackground(null);
        kachel_33.setBackground(null);
        kachel_34.setBackground(null);
        kachel_35.setBackground(null);
        kachel_36.setBackground(null);
        kachel_37.setBackground(null);
        kachel_38.setBackground(null);
        kachel_39.setBackground(null);
        kachel_310.setBackground(null);

        kachel_41.setBackground(null);
        kachel_42.setBackground(null);
        kachel_43.setBackground(null);
        kachel_44.setBackground(null);
        kachel_45.setBackground(null);
        kachel_46.setBackground(null);
        kachel_47.setBackground(null);
        kachel_48.setBackground(null);
        kachel_49.setBackground(null);
        kachel_410.setBackground(null);

        kachel_51.setBackground(null);
        kachel_52.setBackground(null);
        kachel_53.setBackground(null);
        kachel_54.setBackground(null);
        kachel_55.setBackground(null);
        kachel_56.setBackground(null);
        kachel_57.setBackground(null);
        kachel_58.setBackground(null);
        kachel_59.setBackground(null);
        kachel_510.setBackground(null);
        kachel_62.setBackground(null);
        kachel_63.setBackground(null);
        kachel_64.setBackground(null);
        kachel_65.setBackground(null);
        kachel_66.setBackground(null);
        kachel_67.setBackground(null);
        kachel_68.setBackground(null);
        kachel_69.setBackground(null);
        kachel_610.setBackground(null);

        kachel_71.setBackground(null);
        kachel_72.setBackground(null);
        kachel_73.setBackground(null);
        kachel_74.setBackground(null);
        kachel_75.setBackground(null);
        kachel_76.setBackground(null);
        kachel_77.setBackground(null);
        kachel_78.setBackground(null);
        kachel_79.setBackground(null);
        kachel_710.setBackground(null);

        kachel_81.setBackground(null);
        kachel_82.setBackground(null);
        kachel_83.setBackground(null);
        kachel_84.setBackground(null);
        kachel_85.setBackground(null);
        kachel_86.setBackground(null);
        kachel_87.setBackground(null);
        kachel_88.setBackground(null);
        kachel_89.setBackground(null);
        kachel_810.setBackground(null);
        kachel_92.setBackground(null);
        kachel_93.setBackground(null);
        kachel_94.setBackground(null);
        kachel_95.setBackground(null);
        kachel_96.setBackground(null);
        kachel_97.setBackground(null);
        kachel_98.setBackground(null);
        kachel_99.setBackground(null);
        kachel_910.setBackground(null);

        kachel_101.setBackground(null);
        kachel_102.setBackground(null);
        kachel_103.setBackground(null);
        kachel_104.setBackground(null);
        kachel_105.setBackground(null);
        kachel_106.setBackground(null);
        kachel_107.setBackground(null);
        kachel_108.setBackground(null);
        kachel_109.setBackground(null);
        kachel_1010.setBackground(null);



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
        if(zahlen.size() > 1){
            if(Integer.parseInt(zahlen.get(1).toString()) >= 1){
                kachel_21.setBackground(Color.CYAN);
            }
            if(Integer.parseInt(zahlen.get(1).toString()) >= 2){
                kachel_22.setBackground(Color.CYAN);
            }
            if(Integer.parseInt(zahlen.get(1).toString()) >= 3){
                kachel_23.setBackground(Color.CYAN);
            }
            if(Integer.parseInt(zahlen.get(1).toString()) >= 4){
                kachel_24.setBackground(Color.CYAN);
            }
            if(Integer.parseInt(zahlen.get(1).toString()) >= 5){
                kachel_25.setBackground(Color.CYAN);
            }
            if(Integer.parseInt(zahlen.get(1).toString()) >= 6){
                kachel_26.setBackground(Color.CYAN);
            }
            if(Integer.parseInt(zahlen.get(1).toString()) >= 7){
                kachel_27.setBackground(Color.CYAN);
            }
            if(Integer.parseInt(zahlen.get(1).toString()) >= 8){
                kachel_28.setBackground(Color.CYAN);
            }
            if(Integer.parseInt(zahlen.get(1).toString()) >= 9){
                kachel_29.setBackground(Color.CYAN);
            }
            if(Integer.parseInt(zahlen.get(1).toString()) >= 10){
                kachel_210.setBackground(Color.CYAN);
            }
        }
        if(zahlen.size() > 2){
            if(Integer.parseInt(zahlen.get(2).toString()) >= 1){
                kachel_31.setBackground(Color.yellow);
            }
            if(Integer.parseInt(zahlen.get(2).toString()) >= 2){
                kachel_32.setBackground(Color.yellow);
            }
            if(Integer.parseInt(zahlen.get(2).toString()) >= 3){
                kachel_33.setBackground(Color.yellow);
            }
            if(Integer.parseInt(zahlen.get(2).toString()) >= 4){
                kachel_34.setBackground(Color.yellow);
            }
            if(Integer.parseInt(zahlen.get(2).toString()) >= 5){
                kachel_35.setBackground(Color.yellow);
            }
            if(Integer.parseInt(zahlen.get(2).toString()) >= 6){
                kachel_36.setBackground(Color.yellow);
            }
            if(Integer.parseInt(zahlen.get(2).toString()) >= 7){
                kachel_37.setBackground(Color.yellow);
            }
            if(Integer.parseInt(zahlen.get(2).toString()) >= 8){
                kachel_38.setBackground(Color.yellow);
            }
            if(Integer.parseInt(zahlen.get(2).toString()) >= 9){
                kachel_39.setBackground(Color.yellow);
            }
            if(Integer.parseInt(zahlen.get(2).toString()) >= 10){
                kachel_310.setBackground(Color.yellow);
            }
        }
        if(zahlen.size() > 3){
            if(Integer.parseInt(zahlen.get(3).toString()) >= 1){
                kachel_41.setBackground(Color.GRAY);
            }
            if(Integer.parseInt(zahlen.get(3).toString()) >= 2){
                kachel_42.setBackground(Color.GRAY);
            }
            if(Integer.parseInt(zahlen.get(3).toString()) >= 3){
                kachel_43.setBackground(Color.GRAY);
            }
            if(Integer.parseInt(zahlen.get(3).toString()) >= 4){
                kachel_44.setBackground(Color.GRAY);
            }
            if(Integer.parseInt(zahlen.get(3).toString()) >= 5){
                kachel_45.setBackground(Color.GRAY);
            }
            if(Integer.parseInt(zahlen.get(3).toString()) >= 6){
                kachel_46.setBackground(Color.GRAY);
            }
            if(Integer.parseInt(zahlen.get(3).toString()) >= 7){
                kachel_47.setBackground(Color.GRAY);
            }
            if(Integer.parseInt(zahlen.get(3).toString()) >= 8){
                kachel_48.setBackground(Color.GRAY);
            }
            if(Integer.parseInt(zahlen.get(3).toString()) >= 9){
                kachel_49.setBackground(Color.GRAY);
            }
            if(Integer.parseInt(zahlen.get(3).toString()) >= 10){
                kachel_410.setBackground(Color.GRAY);
            }
        }

        if(zahlen.size() > 4){
            if(Integer.parseInt(zahlen.get(4).toString()) >= 1){
                kachel_51.setBackground(Color.MAGENTA);
            }
            if(Integer.parseInt(zahlen.get(4).toString()) >= 2){
                kachel_52.setBackground(Color.MAGENTA);
            }
            if(Integer.parseInt(zahlen.get(4).toString()) >= 3){
                kachel_53.setBackground(Color.MAGENTA);
            }
            if(Integer.parseInt(zahlen.get(4).toString()) >= 4){
                kachel_54.setBackground(Color.MAGENTA);
            }
            if(Integer.parseInt(zahlen.get(4).toString()) >= 5){
                kachel_55.setBackground(Color.MAGENTA);
            }
            if(Integer.parseInt(zahlen.get(4).toString()) >= 6){
                kachel_56.setBackground(Color.MAGENTA);
            }
            if(Integer.parseInt(zahlen.get(4).toString()) >= 7){
                kachel_57.setBackground(Color.MAGENTA);
            }
            if(Integer.parseInt(zahlen.get(4).toString()) >= 8){
                kachel_58.setBackground(Color.MAGENTA);
            }
            if(Integer.parseInt(zahlen.get(4).toString()) >= 9){
                kachel_59.setBackground(Color.MAGENTA);
            }
            if(Integer.parseInt(zahlen.get(4).toString()) >= 10){
                kachel_510.setBackground(Color.MAGENTA);
            }
        }
        if(zahlen.size() > 5){
            if(Integer.parseInt(zahlen.get(5).toString()) >= 1){
                kachel_61.setBackground(Color.DARK_GRAY);
            }
            if(Integer.parseInt(zahlen.get(5).toString()) >= 2){
                kachel_62.setBackground(Color.DARK_GRAY);
            }
            if(Integer.parseInt(zahlen.get(5).toString()) >= 3){
                kachel_63.setBackground(Color.DARK_GRAY);
            }
            if(Integer.parseInt(zahlen.get(5).toString()) >= 4){
                kachel_64.setBackground(Color.DARK_GRAY);
            }
            if(Integer.parseInt(zahlen.get(5).toString()) >= 5){
                kachel_65.setBackground(Color.DARK_GRAY);
            }
            if(Integer.parseInt(zahlen.get(5).toString()) >= 6){
                kachel_66.setBackground(Color.DARK_GRAY);
            }
            if(Integer.parseInt(zahlen.get(5).toString()) >= 7){
                kachel_67.setBackground(Color.DARK_GRAY);
            }
            if(Integer.parseInt(zahlen.get(5).toString()) >= 8){
                kachel_68.setBackground(Color.DARK_GRAY);
            }
            if(Integer.parseInt(zahlen.get(5).toString()) >= 9){
                kachel_69.setBackground(Color.DARK_GRAY);
            }
            if(Integer.parseInt(zahlen.get(5).toString()) >= 10){
                kachel_610.setBackground(Color.DARK_GRAY);
            }
        }
        if(zahlen.size() > 6){
            if(Integer.parseInt(zahlen.get(6).toString()) >= 1){
                kachel_71.setBackground(Color.RED);
            }
            if(Integer.parseInt(zahlen.get(6).toString()) >= 2){
                kachel_72.setBackground(Color.RED);
            }
            if(Integer.parseInt(zahlen.get(6).toString()) >= 3){
                kachel_73.setBackground(Color.RED);
            }
            if(Integer.parseInt(zahlen.get(6).toString()) >= 4){
                kachel_74.setBackground(Color.RED);
            }
            if(Integer.parseInt(zahlen.get(6).toString()) >= 5){
                kachel_75.setBackground(Color.RED);
            }
            if(Integer.parseInt(zahlen.get(6).toString()) >= 6){
                kachel_76.setBackground(Color.RED);
            }
            if(Integer.parseInt(zahlen.get(6).toString()) >= 7){
                kachel_77.setBackground(Color.RED);
            }
            if(Integer.parseInt(zahlen.get(6).toString()) >= 8){
                kachel_78.setBackground(Color.RED);
            }
            if(Integer.parseInt(zahlen.get(6).toString()) >= 9){
                kachel_79.setBackground(Color.RED);
            }
            if(Integer.parseInt(zahlen.get(6).toString()) >= 10){
                kachel_710.setBackground(Color.RED);
            }
        }
        if(zahlen.size() > 7){
            if(Integer.parseInt(zahlen.get(7).toString()) >= 1){
                kachel_81.setBackground(Color.GREEN);
            }
            if(Integer.parseInt(zahlen.get(7).toString()) >= 2){
                kachel_82.setBackground(Color.GREEN);
            }
            if(Integer.parseInt(zahlen.get(7).toString()) >= 3){
                kachel_83.setBackground(Color.GREEN);
            }
            if(Integer.parseInt(zahlen.get(7).toString()) >= 4){
                kachel_84.setBackground(Color.GREEN);
            }
            if(Integer.parseInt(zahlen.get(7).toString()) >= 5){
                kachel_85.setBackground(Color.GREEN);
            }
            if(Integer.parseInt(zahlen.get(7).toString()) >= 6){
                kachel_86.setBackground(Color.GREEN);
            }
            if(Integer.parseInt(zahlen.get(7).toString()) >= 7){
                kachel_87.setBackground(Color.GREEN);
            }
            if(Integer.parseInt(zahlen.get(7).toString()) >= 8){
                kachel_88.setBackground(Color.GREEN);
            }
            if(Integer.parseInt(zahlen.get(7).toString()) >= 9){
                kachel_89.setBackground(Color.GREEN);
            }
            if(Integer.parseInt(zahlen.get(7).toString()) >= 10){
                kachel_810.setBackground(Color.GREEN);
            }
        }

        if(zahlen.size() > 8){
            if(Integer.parseInt(zahlen.get(8).toString()) >= 1){
                kachel_91.setBackground(Color.ORANGE);
            }
            if(Integer.parseInt(zahlen.get(8).toString()) >= 2){
                kachel_92.setBackground(Color.ORANGE);
            }
            if(Integer.parseInt(zahlen.get(8).toString()) >= 3){
                kachel_93.setBackground(Color.ORANGE);
            }
            if(Integer.parseInt(zahlen.get(8).toString()) >= 4){
                kachel_94.setBackground(Color.ORANGE);
            }
            if(Integer.parseInt(zahlen.get(8).toString()) >= 5){
                kachel_95.setBackground(Color.ORANGE);
            }
            if(Integer.parseInt(zahlen.get(8).toString()) >= 6){
                kachel_96.setBackground(Color.ORANGE);
            }
            if(Integer.parseInt(zahlen.get(8).toString()) >= 7){
                kachel_97.setBackground(Color.ORANGE);
            }
            if(Integer.parseInt(zahlen.get(8).toString()) >= 8){
                kachel_98.setBackground(Color.ORANGE);
            }
            if(Integer.parseInt(zahlen.get(8).toString()) >= 9){
                kachel_99.setBackground(Color.ORANGE);
            }
            if(Integer.parseInt(zahlen.get(8).toString()) >= 10){
                kachel_910.setBackground(Color.ORANGE);
            }
        }
        if(zahlen.size() > 9){
            if(Integer.parseInt(zahlen.get(9).toString()) >= 1){
                kachel_101.setBackground(Color.PINK);
            }
            if(Integer.parseInt(zahlen.get(9).toString()) >= 2){
                kachel_102.setBackground(Color.PINK);
            }
            if(Integer.parseInt(zahlen.get(9).toString()) >= 3){
                kachel_103.setBackground(Color.PINK);
            }
            if(Integer.parseInt(zahlen.get(9).toString()) >= 4){
                kachel_104.setBackground(Color.PINK);
            }
            if(Integer.parseInt(zahlen.get(9).toString()) >= 5){
                kachel_105.setBackground(Color.PINK);
            }
            if(Integer.parseInt(zahlen.get(9).toString()) >= 6){
                kachel_106.setBackground(Color.PINK);
            }
            if(Integer.parseInt(zahlen.get(9).toString()) >= 7){
                kachel_107.setBackground(Color.PINK);
            }
            if(Integer.parseInt(zahlen.get(9).toString()) >= 8){
                kachel_108.setBackground(Color.PINK);
            }
            if(Integer.parseInt(zahlen.get(9).toString()) >= 9){
                kachel_109.setBackground(Color.PINK);
            }
            if(Integer.parseInt(zahlen.get(9).toString()) >= 10){
                kachel_1010.setBackground(Color.PINK);
            }
        }
    }

    private void bubbleSort(Vector zahlen, int zeit){
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
                    vectorDarstellen(zahlen);
                    try {
                        TimeUnit.SECONDS.sleep(zeit);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
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
                    vectorDarstellen(zahlen);
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
                    vectorDarstellen(zahlen);
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


