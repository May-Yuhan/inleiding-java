package H2;

/*opdracht 2 Dennis Juman 12-09-2018.
*
*/


import java.applet.Applet;
import java.awt.*;


public class Applets {


    //een class naam dat een verlenging geeft tot Applet dat je zelf toe kent
    public class DitIsEenSoortVanTagBlijkbaarEnMagNietDezelfdeNaamHebbenAlsDeTagHetMagWelMaarDanZonderDeHoofdletterA extends Applet {

        //een (lege) methode die de Applet initialiseert
        public void init() {
            //achtergrond kleur
            setBackground(Color.magenta);

        }
        //een methode die de inhoud van het scherm tekent
        public void paint(Graphics g) {
            //gele letters
            g.setColor(Color.yellow);
            //text vak
            g.drawString("Dennis Juman - 12-09-2018", 50, 60 );
        }

    }
}
