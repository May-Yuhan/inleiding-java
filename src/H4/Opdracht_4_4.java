package H4;

/*
 * 14-09-2018 Created by Dennis Juman
 * Opdracht 4.2
 */


import java.awt.*;
import java.applet.*;

public class Opdracht_4_4 extends Applet{

    public void init(){
        setSize(500,500);
        setBackground(Color.black);
    }

    public void paint (Graphics g) {

        //staafdiagram Valerie
            g.setColor(Color.pink);
            g.fillRect(40,110,125,40);
            g.drawString("Valerie: 40 KG",60,175);

        //staafdiagram Jeroen
            g.setColor(Color.blue);
            g.fillRect(175,50,125,100);
            g.drawString("Jeroen: 100 KG",190,175);

        //staafdiagram Hans
            g.setColor(Color.orange);
            g.fillRect(310,70,125,80);
            g.drawString("Hans: 80 KG",330,175);





    }
}
