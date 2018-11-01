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
      int c = 0;


        for(a = 0; a < 10; ++ a);

        b += a;

        c = a + b;

        string.valueOf(c);
        System.out.println(c);



    }
}
