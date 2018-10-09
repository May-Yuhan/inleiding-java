package H4;

import java.applet.Applet;
import java.awt.*;


/*
** created by Dennis 14-09-2018
 */

public class Opdracht_4_5 extends Applet {

    //core settings / background color
    public void init() {
        setBackground(Color.blue);
        setSize(500,500);
    }

    // filled yellow circle
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(200,250,50,50,0,360);
    }
}
