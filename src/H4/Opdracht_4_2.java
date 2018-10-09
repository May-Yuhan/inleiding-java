package H4;

import java.awt.*;
import java.applet.*;


public class Opdracht_4_2 extends Applet {

    public void init() {
        setBackground(Color.white);
        setSize(2000, 2000);
    }

    public void paint(Graphics g) {


        g.setColor(Color.black);
        g.drawLine(250, 0, 500, 500);

        g.setColor(Color.black);
        g.drawLine(500, 500,0,500);

        g.setColor(Color.black);
        g.drawLine(0,500,250,0);




        g.setColor(Color.black);
        g.drawRect(45, 500, 400, 400);

        g.drawRect(75, 550, 100, 200);
        g.drawRect(300, 550, 100, 100);


    }

}
