package H4;

import java.awt.*;
import java.applet.Applet;

/*
** Dennis Juman 14-09-2018 -- traffic light
 */

public class Opdracht_4_6 extends Applet {

    public void init() {
        setSize(500,500);
        setBackground(Color.white);
    }

    public void paint (Graphics g) {

      g.setColor(Color.black);
      g.fillRoundRect(10,15,60,120,33,33);

      //green light
      g.setColor(Color.green);
      g.fillRoundRect(25,20,30,30,50,50);

      //orange light
        g.setColor(Color.orange);
        g.fillRoundRect(25,60,30,30,50,50);

        //red light
      g.setColor(Color.red);
      g.fillRoundRect(25,100,30,30,50,50);

      g.setColor(Color.black);
      g.fillRect(32,131,15,100);

    }

}
