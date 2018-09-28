package Java_Challenge_2018_H8_3;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*DENNIS JUMAN */

public class Horeca_App extends Applet {

    Button fris, bier, wijn, koffie, binn_gedist, buit_gedist, nieuwe_bestelling;
    double reset, teller_fris, teller_bier, teller_wijn, teller_koffie, teller_binn_gedist, teller_buit_gedist, teller_nieuwe_bestelling, total;


    public void init() {


        //fris
        fris = new Button("Fris");
        add(fris);
        fris.addActionListener(new Counter_fris());


        //bier
        bier = new Button("Bier");
        add(bier);
        bier.addActionListener(new Counter_bier());


        //wijn
        wijn = new Button("Wijn");
        add(wijn);
        wijn.addActionListener(new Counter_wijn());


        //koffie
        koffie = new Button("Koffie");
        koffie.addActionListener(new Counter_koffie());
        add(koffie);



        //binn gedist
        binn_gedist = new Button("Binn gedist");
        add(binn_gedist);
        binn_gedist.addActionListener(new Counter_binn_gedist());


        //buit gedist
        buit_gedist = new Button("Buit gedist");
        buit_gedist.addActionListener(new Counter_binn_gedist());
        add(buit_gedist);



        //nieuwe bestelling
        nieuwe_bestelling = new Button("Nieuwe bestelling");
        nieuwe_bestelling.addActionListener(new Reset());
        add(nieuwe_bestelling);


    }


    public void paint(Graphics g) {
        g.drawString("Bestelling Totaal: " + reset, 125, 100);
        g.drawString("Totaal Dagomzet: " + total, 125, 120);
    }

    class Counter_fris implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            //fris
            teller_fris = teller_fris + 2.25;
            total = total + 2.25;
            reset = reset + 2.25;

            repaint();

        }
    }

    class Counter_bier implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            //bier
            teller_bier = teller_bier + 2.50;
            total = total + 2.50;
            reset = reset + 2.50;

            repaint();

        }
    }

        class Counter_wijn implements ActionListener {

            public void actionPerformed(ActionEvent e) {

                //wijn
                teller_wijn = teller_wijn + 2.75;
                total = total + 2.75;
                reset = reset + 2.75;

                repaint();

            }
        }

        class Counter_koffie implements ActionListener {

            public void actionPerformed(ActionEvent e) {

                //koffie
                teller_koffie = teller_koffie + 2.00;
                total = total + 2.00;
                reset = reset + 2.00;

                repaint();

            }
        }

        class Counter_binn_gedist implements ActionListener {

            public void actionPerformed(ActionEvent e) {

                //Binnenlands gedistilleerd
                teller_binn_gedist = teller_binn_gedist + 3.0;
                total = total + 3.0;
                reset = reset + 3.0;

                repaint();


            }
        }

        class Counter_buit_gedist implements ActionListener {

            public void actionPerformed(ActionEvent e) {

                //Buitenlands gedistilleerd:
                teller_buit_gedist = teller_buit_gedist + 3.75;
                total = total + 3.75;
                reset = reset + 3.75;

                repaint();

            }
        }

        class Reset implements ActionListener {

            public void actionPerformed(ActionEvent e) {

                //bestelling totaal
                reset = 0;

                repaint();

            }
        }
    }
