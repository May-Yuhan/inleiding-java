package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_11_4 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int drie = 0;

        for (int keer = 1; keer <= 10; ++keer) {
            drie = 3;
            drie *= keer;
            System.out.println(drie);
        }
    }
}
