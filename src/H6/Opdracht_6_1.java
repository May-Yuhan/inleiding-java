package H6;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_6_1 extends Applet {

    int Dennis, Jan, Ali, Jeannette, d;

    double bedrag, uitkomst_bedrag, a, b, e, afgerond;


    //declaratie / initialisatie
    public void init() {

        setSize(400, 400);

        Dennis = 0;
        Jan = 0;
        Ali = 0;
        Jeannette = 0;


        bedrag = 113;
        uitkomst_bedrag = bedrag / 100 * 25;

        a = 100;

        b = uitkomst_bedrag * a;

        d = (int) b;
        e = (double) d;

        afgerond = e/100;









        }

        public void paint (Graphics g) {
            g.drawString("Dennis (niet afgerond): " + uitkomst_bedrag, 20,25);
            g.drawString("Jan (niet afgerond): " + uitkomst_bedrag, 20,50);
            g.drawString("Ali: " + afgerond, 20,75);
            g.drawString("Jennette: " + afgerond, 20,100);

    }


}
