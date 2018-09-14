package H2;



//Java Bibliotheek
import java.awt.*;
import java.applet.*;

    //een klasse met de naam Applets van het type Applet
    public class Applets extends Applet {

        //een (lege) methode die de Applet initialiseert
        public void init() {
            setBackground(Color.blue);

        }
        //een methode die de inhoud van het scherm tekent
        public void paint(Graphics g) {
            g.setColor(Color.yellow);
            g.drawString("Dennis Juman", 150, 150 );
        }

    }



