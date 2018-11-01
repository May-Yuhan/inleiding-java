package H11;
// 10-11-2018 | studentnummer: 2040021
import java.applet.Applet;
import java.awt.*;

public class Opdracht_11_2 extends Applet {

    String string;

    public void init() {
        string = "";
    }

    public void paint (Graphics g){
        int getallen = 0;
         int regelruimte = 0;

        for(getallen = 20; getallen >= 10; getallen--) {

            regelruimte += 20;

            System.out.println(getallen);
            string.valueOf(getallen);

            g.drawString("" + getallen,50,regelruimte);

            repaint();
        }
    }

}
