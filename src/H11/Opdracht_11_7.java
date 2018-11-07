package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_11_7 extends Applet {
    
    public void init(){
        
    }
    
    public void paint (Graphics g){

        int x = 0;
        int y = 0;
        int width = 510;

        for(int height = 500; height >= 10; height -= 10){

            width -= 10;

            x += 5;
            y += 5;

            g.drawOval(x,y,width,height);

        }
    }
}
