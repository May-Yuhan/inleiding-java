package H6;

import java.awt.*;
import java.applet.Applet;

public class Opdracht_6_2 extends Applet {

     int minuten;
     int secondes;
     int uur_uitkomst;
     int dag_uitkomst;
     int dag_uren;
     int jaar_uren;
     int jaar_dagen;


    public void init () {
        /*
        INT PRIMITIEF GEBRUIKT INPLAATS VAN DOUBLE OMDAT
        ER GEEN KLEIN GETAL UITKOMSTEN WAREN (NIKS MET COMMA'S ETC)

        */
        setSize (500,500);

        //secondes per uur (60 minuten)
        minuten = 60;
        secondes = 60;
        uur_uitkomst = 60 * 60;

        //secondes per dag (24 uur)
        dag_uren = 24;
        dag_uitkomst = uur_uitkomst * dag_uren;


        //secondes per jaar (jaar 365 dagen 1 dag is 24 uur == 24x365)
        jaar_dagen = 365;
        jaar_uren = dag_uitkomst * jaar_dagen;
    }


    public void paint (Graphics g) {

        //UUR
        g.drawString("" +uur_uitkomst,20,20);

        //DAG
        g.drawString("" +dag_uitkomst,20,40);

        //JAAR
        g.drawString("" +jaar_uren,20,60);
    }
}
