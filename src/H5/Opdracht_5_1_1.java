package H5;
import java.awt.*;
import java.applet.Applet;

public class Opdracht_5_1_1 extends Applet {
    //declaratie
    Color fillcolor;
    Color linecolor;
    Color backgroundcolor;
    int width;
    int heigth;



    public void init () {
        fillcolor = Color.orange;
        linecolor = Color.magenta;
        backgroundcolor = Color.white;

        /*width en heigth waren niet gebruikt omdat alles die properties er al in stonden van opdracht 2.
        * als ik een bepaalde width en heigth ga toekenen aan dit moeten al de berekeningen opnieuw worden gemaakt
        * om alles gescheiden te houden. Maar in Variabelen_2 staat het wel met width en heigth om te demonstreren
        * dat het me lukte.
        * */
      //  width = 500;
      //  heigth = 500;
    }


        public void paint(Graphics g) {

            g.setColor(linecolor);
            g.drawLine(10,10,505,10);
            g.drawString("Lijn",250,25);

            //rechthoek
            g.drawRect(10,40,500,250);
            g.drawString("Rechthoek",240,310);


            //gevulde rechthoek met ovaal
            g.setColor(fillcolor);
            g.fillRect(10,320,500,250);

            g.setColor(linecolor);
            g.drawOval(10,320,500,250);
            g.drawString("Gevulde Rechthoek met Ovaal",200,590);


            //taartpunt met ovaal eromheen
            g.setColor(linecolor);
            g.drawOval(550,40,500,250);

            g.setColor(Color.magenta);
            g.fillArc(550,40,500,250,0,45);

            g.setColor(linecolor);
            g.drawString("Taartpunt met ovaal eromheen",700,310);


            //afgeronde driehoek
            g.setColor(linecolor);
            g.drawRoundRect(550,320,500,250,30,30);
            g.drawString("Afgeronde driekhoek",750,590);


    }
}

            //Tekeningen

            //lijn





