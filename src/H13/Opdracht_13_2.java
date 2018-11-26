package H13;

import java.applet.Applet;
import java.awt.*;


public class Opdracht_13_2 extends Applet {

    public void init(){
        setSize(900,450);
    }

    public void paint (Graphics g){
        lego(g);

    }

    void lego(Graphics g){

        int y = 50;
        int x = 0;
        for (int i = 0; i < 7 ; i++) {

            x += 100;


            g.setColor(Color.red);
            g.fillRect(x,y,100,50);
            g.setColor(Color.black);
            g.drawRect(x,y,100,50);
        }


        x = 25;

        for (int i = 0; i < 7 ; i++) {

            x += 100;


            g.setColor(Color.red);
            g.fillRect(x,y+50,100,50);
            g.setColor(Color.black);
            g.drawRect(x,y+50,100,50);
        }

        x = 0;

        for (int i = 0; i < 7 ; i++) {

            x += 100;


            g.setColor(Color.red);
            g.fillRect(x,y+100,100,50);
            g.setColor(Color.black);
            g.drawRect(x,y+100,100,50);
        }

        x = 25;

        for (int i = 0; i < 7 ; i++) {

            x += 100;


            g.setColor(Color.red);
            g.fillRect(x,y+150,100,50);
            g.setColor(Color.black);
            g.drawRect(x,y+150,100,50);
        }

        x = 0;

        for (int i = 0; i < 7 ; i++) {

            x += 100;


            g.setColor(Color.red);
            g.fillRect(x,y+200,100,50);
            g.setColor(Color.black);
            g.drawRect(x,y+200,100,50);


        }

        x = 25;

        for (int i = 0; i < 7 ; i++) {

            x += 100;


            g.setColor(Color.red);
            g.fillRect(x,y+250,100,50);
            g.setColor(Color.black);
            g.drawRect(x,y+250,100,50);
        }

        x = 0;

        for (int i = 0; i < 7 ; i++) {

            x += 100;


            g.setColor(Color.red);
            g.fillRect(x,y+300,100,50);
            g.setColor(Color.black);
            g.drawRect(x,y+300,100,50);
        }
    }
}
