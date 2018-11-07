package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_11_8 extends Applet {

    public void init(){


    }

    public void paint (Graphics g){

        int width = 0;

        for (int circle = 10; circle < 1000; circle += 10) {

            width +=10;

            g.drawOval(50,50,width,circle);

        }
        
    }
}
