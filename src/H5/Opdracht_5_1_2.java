package H5;

import java.awt.*;
import java.applet.Applet;

public class Opdracht_5_1_2 extends Applet {

    //shotcut / declaratie
    Color fillcolor;
    Color linecolor;
    Color background;
    int width;
    int length;

    public void init () {
        //opstart / initialisatie
        background = Color.white;
        fillcolor = Color.green;
        linecolor = Color.orange;
        width = 500;
        length = 250;

    }

    public void paint (Graphics g) {

        g.setColor(fillcolor);
        g.fillOval(0,0,width, length);
        g.setColor(linecolor);
        g.drawString("Gevulde Ovaal",210,270);


        g.setColor(linecolor);
        g.drawOval(0,300,width, length);
        g.drawString("Ovaal",225, 570);
    }


}



