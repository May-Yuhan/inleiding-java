package H5;

/*
 * OPDRACHT 4.4, STAAFDIAGRAM HOOFDSTUK 5 - DENNIS JUMAN
 */

import java.applet.Applet;
import java.awt.*;

    public class Opdracht_5_2 extends Applet {

        //vertical / horizontal line color
        Color linecolor;


        //object velarie
        int width_velarie;
        int length_velarie;
        int y_velarie;
        int x_velarie;
        Color fillcolor_velarie;

        //object jeroen
        int width_jeroen;
        int length_jeroen;
        int y_jeroen;
        int x_jeroen;
        Color fillcolor_jeroen;

        //object hans
        int width_hans;
        int length_hans;
        int y_hans;
        int x_hans;
        Color fillcolor_hans;

    public void init () {

        //initialisatie
        setSize (400,400); //window size (applet size)


        //variabele velarie
        width_velarie = 50;
        length_velarie = 40; //40 = 40 KG
        x_velarie = 0;
        y_velarie = 350 - length_velarie;
        fillcolor_velarie = Color.green;


        //variabele jeroen
        width_jeroen = 50;
        length_jeroen = 80;  // 80 = 80 KG
        x_jeroen = 100;
        y_jeroen = 350 - length_jeroen;
        fillcolor_jeroen = Color.orange;


        //variabele hans
        width_hans = 50;
        length_hans = 100; //100 = 100 KG
        x_hans = 200;
        y_hans = 350 - length_hans;
        fillcolor_hans = Color.red;

    }

    public void paint (Graphics g) {

        //line color (black)
        g.setColor(linecolor);

        //bottom line (vertical)
        g.drawLine(0,350,400,350);

        //25 KG line
        g.drawLine(0,325,250,325);

        //50 KG line
        g.drawLine(0,300,250,300);

        //75 KG line
        g.drawLine(0,275,250,275);

        //100 KG line
        g.drawLine(0,250,400,250);

        // right vertical line
        g.drawLine(400,350,400,250);



            //staafdiagram Valerie
            g.setColor(fillcolor_velarie);
            g.fillRect(x_velarie,y_velarie, width_velarie, length_velarie);
            g.drawString("Valerie: 40 KG",275,325);


            //staafdiagram Jeroen
            g.setColor(fillcolor_jeroen);
            g.fillRect(x_jeroen,y_jeroen,width_jeroen,length_jeroen);
            g.drawString("Valerie: 80 KG",275,300);

            //staafdiagram Hans
            g.setColor(fillcolor_hans);
            g.fillRect(x_hans, y_hans, width_hans, length_hans);
            g.drawString("Valerie: 100 KG",275,275);

    }

}
