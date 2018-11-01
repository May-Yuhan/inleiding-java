package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_11_1 extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {

        for (int verticale_lijnen = 20; verticale_lijnen < 220; verticale_lijnen +=20){

            g.drawLine(50,verticale_lijnen,300,verticale_lijnen);
        }
    }
}