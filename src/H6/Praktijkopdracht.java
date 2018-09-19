package H6;

import java.awt.*;
import java.applet.Applet;

public class Praktijkopdracht extends Applet {

    double a;
    double b;
    double c;
    double d;
    double e;
    double f;
    double h;
    int i;
    double j;
    double afgerond;


    public void init () {

        setSize(500,500);

        a = 5.9;
        b = 6.3;
        c = 6.9;

        //formule / antwoord = e
        d = 6.9 + 6.3 + 5.9;
        e = d / 3;


        f = 10;
        h = e * f;


        i = (int) h;
        j = (double) i;
        afgerond = j/10;



    }

    public void paint (Graphics g) {
        //antwoord
        g.drawString("" + e, 20,20);

        //antwoord (afgerond op 2 decimalen)
        g.drawString("" + afgerond, 20,40);
    }

}
