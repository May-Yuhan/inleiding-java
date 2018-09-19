package H6;

import java.applet.Applet;
import java.awt.*;


public class Opdracht_6_3 extends Applet {


    int a;
    int b;
    int c;

    public void init () {

        a = 2147483647;
        b = 2147483647;
        c = a + b;

    }

    public void paint (Graphics g) {
        g.drawString("" + c,20,20);
    }
}
