package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_11_6 extends Applet {



    public void init(){

    }

    public void paint (Graphics g){

        int x = 0;
        int y = 0;
        int width = 350;

        for(int height = 300; height >= 50; height -= 50){

            width -= 50;

            x += 25;
            y += 25;

            g.drawOval(x,y,width,height);

        }

    }
}
