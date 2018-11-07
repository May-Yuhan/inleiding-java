package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_11_5 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int a = 50;
        int b = 50;

        int x = 50;
        int y = 50;


        for (x = 50; x <= 500; x += 50) {
            y += 50;

            g.drawRect(x, y, 50, 50);

        }
    }
}
