package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_13_1 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        driehoek(g,100,200,300,200,207,40);
    }

    void driehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {

        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x2,y2,x3,y3);
        g.drawLine(x3,y3,x1,y1);


    }

}
