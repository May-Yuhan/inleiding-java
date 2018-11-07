package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_11_3 extends Applet {

    String string;

    public void init(){

    }

    public void paint (Graphics g){

      int a = 0;
      int b = 1;

        for(int d = 0; d < 10; ++ d) {

            int c = a + b;

            // Voorbeiden op de volgende iteratie
            a = b;
            b = c;

            string.valueOf(c);
            System.out.println(c);

        }

    }
}
