package H11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {


    Button knop;
    TextField tekstvak;
    int getal;

    public void init(){

        getal = 0;

        // KNOP
        knop = new Button("PRESS");
        add (knop);

        // KNOP LISTENER
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);

        // TEKSTVAK
        tekstvak = new TextField(20);
        add (tekstvak);

        // TEKSTVAK LISTENER
        TekstvakListener tl = new TekstvakListener();
        tekstvak.addActionListener(kl);

    }

    public void paint(Graphics g){

        int y = 40;


        for(int teller = 1; teller <= 10; ++teller){

            int uitkomst = 0;
            uitkomst = teller * getal;

            y +=20;

            g.drawString(teller + " x " + getal  + " = " + uitkomst,95,y);



        }



    }


    public class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            getal = Integer.parseInt(tekstvak.getText());
            repaint();
        }
    }

    public class TekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e){}

    }
}
