package H8;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht_8_2 extends Applet {


    Button vaders, moeders, meisjes, jongens;
    int teller_vaders, teller_moeders, teller_meisjes, teller_jongens, teller_totaal;
    Vader_ButtonListener v_bl;

    public void init() {
        //WINDOW SIZE
        setSize(500, 500);

        //BUTTON VADERS
        vaders = new Button("Vaders");
        v_bl = new Vader_ButtonListener();
        vaders.addActionListener(v_bl);
        add(vaders);

        //BUTTON MOEDERS
        moeders = new Button("Moeders");
        Moeder_ButtonListener m_bl = new Moeder_ButtonListener();
        moeders.addActionListener(m_bl);
        add(moeders);

        //BUTTON MEISJES
        meisjes = new Button("Meisjes");
        Meisjes_ButtonListener me_bl = new Meisjes_ButtonListener();
        meisjes.addActionListener(me_bl);
        add(meisjes);

        //BUTTON JONGENS
        jongens = new Button("Jongens");
        Jongens_ButtonListener jo_bl = new Jongens_ButtonListener();
        jongens.addActionListener(jo_bl);
        add(jongens);


        //TELLERS/COUNTER
        teller_vaders = 0;
        teller_moeders = 0;
        teller_meisjes = 0;
        teller_jongens = 0;
        teller_totaal = 0;
    }


    //TELLER TOEGEVOEGD OM IETS TE DOEN ALS KNOP GEDRUKT WORDT.
    class Vader_ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            teller_vaders = teller_vaders + 1;
            teller_totaal = teller_totaal +1;

            repaint();
        }

    }


    class Moeder_ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller_moeders = teller_moeders + 1;
            teller_totaal = teller_totaal +1;
            repaint();
        }
    }

    class Meisjes_ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller_meisjes = teller_meisjes + 1;
            teller_totaal = teller_totaal +1;

            repaint();
        }
    }

    class Jongens_ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller_jongens = teller_jongens + 1;
            teller_totaal = teller_totaal +1;

            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString("" + teller_totaal, 75, 250);
        g.drawString("" + teller_vaders, 75, 50);
        g.drawString("" + teller_moeders, 75, 100);
        g.drawString("" + teller_meisjes, 75, 150);
        g.drawString("" + teller_jongens, 75, 200);
    }

}
