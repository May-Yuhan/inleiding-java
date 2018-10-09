package H4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_4_7 extends Applet {

    public void init(){
        setSize(500,500);
        setBackground(Color.white);
    }

    public void paint(Graphics g){

        //dobbelsteen
        g.setColor(Color.black);

        g.drawRoundRect(0,0,500,500,50,50);

        g.fillRoundRect(100,100,50,50,100,100);

        g.fillRoundRect(350,100,50,50,100,100);

        g.fillRoundRect(100,350,50,50,100,100);

        g.fillRoundRect(350,350,50,50,100,100);

    }

}
