package H4;

import java.awt.*;
import java.applet.*;


public class Opdracht_4_2 extends Applet {

    public void init() {
        setBackground(Color.white);
        setSize(2000, 2000);
    }

    public void paint(Graphics g) {



        g.setColor(Color.red);
        g.drawLine(250, 0, 500, 500);

        g.setColor(Color.pink);
        g.drawLine(500, 500,0,500);

        g.setColor(Color.green);
        g.drawLine(0,500,250,0);





        //red line
        g.setColor(Color.yellow);
        g.drawLine(400, 500, 0, 900);

        //pink line
        g.setColor(Color.pink);
        g.drawLine(400, 100,400,400);

        //green line
        g.setColor(Color.green);
        g.drawLine(400,400,100,400);

        // purple line
        g.setColor(Color.magenta);
        g.drawLine(100,400,100,100);



    }

}
