import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

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
        einstellungsPanel.add(new JLabel("Welcome to Tutorials Point"));
        einstellungsPanel.setBackground(Color.MAGENTA);
        //einstellungsPanel.setSize(1280, 220);
        visualisierungsPanel.setBackground(Color.WHITE);
        //visualisierungsPanel.setSize(1280, 500);

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

/**
        Vector zahlen = new Vector();

        zahlen.add(8);
        zahlen.add(3);
        zahlen.add(9);
        zahlen.add(1);
        zahlen.add(10);
        zahlen.add(8);
        zahlen.add(3);
        zahlen.add(9);
        zahlen.add(1);
        zahlen.add(10);

        zahlen.add(10);
        zahlen.add(10);
        zahlen.add(10);
        zahlen.add(0);
        zahlen.add(10);
        zahlen.add(10);
        zahlen.add(10);
        zahlen.add(10);
        zahlen.add(10);
        zahlen.add(10);

        vectorDarstellen(zahlen);
 */
    }

    private void vectorDarstellen(Vector zahlen){


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
}

