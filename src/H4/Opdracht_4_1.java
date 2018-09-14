package H4;

import java.awt.*;
import java.applet.*;

public class Opdracht_4_1 extends Applet {

    public void init() {
        setSize(500, 500);
    }



    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(250, 0, 500, 500);

        g.setColor(Color.pink);
        g.drawLine(500, 500,0,500);

        g.setColor(Color.green);
        g.drawLine(0,500,250,0);


    }
}
