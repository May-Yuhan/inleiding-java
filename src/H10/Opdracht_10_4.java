package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht_10_4 extends Applet {

    Button button;
    String tekst, februari_schrikkeljaar, text, veerboot;
    int jaartal, maand, dag;
    TextField tekstvak_2;
    TextField tekstvak_1;

    public void init() {
        //BUTTON
        button = new Button("UITSLAG");
        add(button);

        //BUTTON LISTENER
        ButtonListener bl = new ButtonListener();
        button.addActionListener(bl);

        //TEKSTVAK
        tekstvak_2 = new TextField("", 15);
        add(tekstvak_2);

        //TEKSTVAK
        tekstvak_1 = new TextField("", 15);
        add(tekstvak_1);

        tekst = "Maand: ";
        veerboot = "Jaartal: ";

    }

    public void paint(Graphics g) {
        button.setLocation(150, 50);
        button.setSize(100, 50);

        tekstvak_2.setLocation(210, 100);
        tekstvak_1.setLocation(50, 100);



        g.drawString(tekst, 50, 150);
        g.drawString(veerboot + (jaartal == 0?"":jaartal), 215, 175);


    }


    class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            jaartal = Integer.parseInt(tekstvak_1.getText());
            maand = Integer.parseInt(tekstvak_2.getText());



            switch (maand) {
                case 1:
                    tekst = "Januari 31";
                    break;

                case 2:

                    // TEST OF HET EEN SCHRIKKELJAAR IS
                    if (((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                            jaartal % 400 == 0))
                        tekst = "Februari 29";
                    else
                        tekst = "Februari 28";
                    break;

                case 3:
                    tekst = "Maart 31";
                    break;
                case 4:
                    tekst = "April 30";
                    break;
                case 5:
                    tekst = "Mei 31";
                    break;
                case 6:
                    tekst = "Juni 30";
                    break;
                case 7:
                    tekst = "July 30";
                    break;
                case 8:
                    tekst = "Augustus 31";
                    break;
                case 9:
                    tekst = "September 30";
                    break;
                case 10:
                    tekst = "Oktober 31";
                    break;
                case 11:
                    tekst = "November 30";
                    break;
                case 12:
                    tekst = "December 31";
                    break;
                default:
                    tekst = "Sorry, alles boven het getal 12 is geen maand! =(";
                    break;
            }


            repaint();


        }


    }
}





