package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht_10_3 extends Applet {

    TextField textvak;
    String tekst;
    int maand;


    public void init() {
        setSize(400, 400);

        //textvak
        textvak = new TextField("", 40);
        add(textvak);
        TextvakListener tl = new TextvakListener();
        textvak.addActionListener(tl);
        tekst = "";



    }


    public void paint(Graphics g) {
        g.drawString(tekst,35,50);


    }

    class TextvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            maand = Integer.parseInt(textvak.getText());

            switch (maand) {
                case 1:
                    tekst = "Januari (1-31 dagen)";
                    break;
                case 2:
                    tekst = "Februari (1-28 dagen)";
                    break;
                case 3:
                    tekst = "Maart (1-31 dagen)";
                    break;
                case 4:
                    tekst = "April (1-30 dagen)";
                    break;
                case 5:
                    tekst = "Mei (1-31 dagen)";
                    break;
                case 6:
                    tekst = "Juni (1-30 dagen)";
                    break;
                case 7:
                    tekst = "July (1-31 dagen)";
                    break;
                case 8:
                    tekst = "Augustus (1-31 dagen)";
                    break;
                case 9:
                    tekst = "September (1-30 dagen)";
                    break;
                case 10:
                    tekst = "Oktober (1-31 dagen)";
                    break;
                case 11:
                    tekst = "November (1-30 dagen)";
                    break;
                case 12:
                    tekst = "December (1-31 dagen)";
                    break;
                default:
                    tekst = "Sorry, alles boven het getal 12 is geen maand! =(";
                    break;
            }

            repaint();
        }

    }
}
