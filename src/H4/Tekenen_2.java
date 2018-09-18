package H4;

import java.awt.*;
import java.applet.Applet;

public class Tekenen_2 extends Applet {

    public void init() {
        setSize(500,500);
        setBackground(Color.white);
    }

    public void paint(Graphics g) {

        g.setColor(Color.magenta);
        g.fillOval(0,0,200,100);
        g.setColor(Color.black);
        g.drawString("Gevulde Ovaal",60,115);

        g.drawOval(250,0,100,100);
        g.drawString("Ovaal",285, 115);
    }


}
