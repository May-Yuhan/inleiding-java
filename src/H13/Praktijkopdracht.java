package H13;


//DENNIS JUMAN 2040021

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {


    public void init() {
        setSize(1500, 900);

    }


    public void paint(Graphics g) {

        int x, y;
        x = 150;
        y = 150;

        for (int i = 0; i < 5; i++) {

            boom(g, x, y, 75, 125);
            x += 250;

            if (i == 4) {

                x = 150;
                y += 450;

                for (int j = 0; j < 5; j++) {

                    boom(g, x, y, 75, 125);
                    x += 250;

                }

            }

        }

    }

    void boom(Graphics g, int x, int y, int width, int height) {

        g.setColor(new Color(156, 93, 82));
        g.fillRect(x, y, width, height + 125);
        g.setColor(new Color(0, 204, 0));
        g.fillOval(x - 73, y - 150, width + 150, height + 50);

    }

}
