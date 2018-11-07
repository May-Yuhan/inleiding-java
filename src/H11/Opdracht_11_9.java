package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_11_9 extends Applet {

    public void init() {


    }

    public void paint(Graphics g) {


        int x = 0;
        int blacks = 0;



        for (int width = 0; width <= 7; ++width) {

            x += 50;
            g.drawRect(x, 50, 50, 50);

            if(width == 0 || width == 2 || width == 4 || width == 6){


            g.setColor(Color.black);
            g.fillRect(x, 50,50,50);

            }

            else{
                g.setColor(Color.white);
                g.fillRect(x,50,50,50);
            }
        }

        x = 0;

        for (int width = 0; width <= 7; ++width) {

            x += 50;
            g.drawRect(x, 100, 50, 50);

            if(width == 1 || width == 3 || width == 5 || width == 7){


                g.setColor(Color.black);
                g.fillRect(x, 100,50,50);

            }

            else{
                g.setColor(Color.white);
                g.fillRect(x,100,50,50);
            }
        }

        x = 0;

        for (int width = 0; width <= 7; ++width) {

            x += 50;
            g.drawRect(x, 150, 50, 50);

            if(width == 0 || width == 2 || width == 4 || width == 6){


                g.setColor(Color.black);
                g.fillRect(x, 150,50,50);

            }

            else{
                g.setColor(Color.white);
                g.fillRect(x,150,50,50);
            }
        }

        x = 0;

        for (int width = 0; width <= 7; ++width) {

            x += 50;
            g.drawRect(x, 200, 50, 50);

            if(width == 1 || width == 3 || width == 5 || width == 7){


                g.setColor(Color.black);
                g.fillRect(x, 200,50,50);

            }

            else{
                g.setColor(Color.white);
                g.fillRect(x,200,50,50);
            }
        }

        x = 0;

        for (int width = 0; width <= 7; ++width) {

            x += 50;
            g.drawRect(x, 250, 50, 50);

            if(width == 0 || width == 2 || width == 4 || width == 6){


                g.setColor(Color.black);
                g.fillRect(x, 250,50,50);

            }

            else{
                g.setColor(Color.white);
                g.fillRect(x,250,50,50);
            }
        }

        x = 0;

        for (int width = 0; width <= 7; ++width) {

            x += 50;
            g.drawRect(x, 300, 50, 50);

            if(width == 1 || width == 3 || width == 5 || width == 7){


                g.setColor(Color.black);
                g.fillRect(x, 300,50,50);

            }

            else{
                g.setColor(Color.white);
                g.fillRect(x,300,50,50);
            }
        }


        x = 0;

        for (int width = 0; width <= 7; ++width) {

            x += 50;
            g.drawRect(x, 350, 50, 50);

            if(width == 0 || width == 2 || width == 4 || width == 6){


                g.setColor(Color.black);
                g.fillRect(x, 350,50,50);

            }

            else{
                g.setColor(Color.white);
                g.fillRect(x,350,50,50);
            }
        }

        x = 0;

        for (int width = 0; width <= 7; ++width) {

            x += 50;
            g.drawRect(x, 400, 50, 50);

            if(width == 1 || width == 3 || width == 5 || width == 7){


                g.setColor(Color.black);
                g.fillRect(x, 400,50,50);

            }

            else{
                g.setColor(Color.white);
                g.fillRect(x,400,50,50);
            }
        }

    }
}

