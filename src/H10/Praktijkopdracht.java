package H10;

/*
 Dennis Juman - 09-10-2018. :D
 Studentnummer: 2040021
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    TextField textfield;
    Button button;
    double getal;
    String uitkomst;

    public void init() {
        setSize(400, 400);

        //BUTTON
        button = new Button("OK");
        add(button);

        //BUTTON LISTENER
        ButtonListener bl = new ButtonListener();
        button.addActionListener(bl);

        //TEXTFIELD
        textfield = new TextField(10);
        add(textfield);

        //TEXTFIELD LISTENER
        TextfieldListener tl = new TextfieldListener();
        textfield.addActionListener(tl);

        uitkomst = "";
    }

    public void paint(Graphics g) {
        g.drawString(uitkomst, 125, 50);
    }

    //BUTTON LISTENER
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            getal = Double.parseDouble(textfield.getText());

            if (getal < 1 || getal > 10) {
                uitkomst = "Verkeerd cijfer ingevoerd.";
            } else if (getal <= 3) {
                uitkomst = "Slecht";
            } else if (getal <= 4) {
                uitkomst = "Onvoldoende";
            } else if (getal < 5.5) {
                uitkomst = "Matig";
            } else if (getal >= 8) {
                uitkomst = "Goed";
            } else {
                uitkomst = "Voldoende";
            }

            repaint();

        }
    }

    //TEXTFIELD LISTENER
    class TextfieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            getal = Double.parseDouble(textfield.getText());

            if (getal < 1 || getal > 10) {
                uitkomst = "Verkeerd cijfer ingevoerd.";
            } else if (getal <= 3) {
                uitkomst = "Slecht";
            } else if (getal <= 4) {
                uitkomst = "Onvoldoende";
            } else if (getal < 5.5) {
                uitkomst = "Matig";
            } else if (getal >= 8) {
                uitkomst = "Goed";
            } else {
                uitkomst = "Voldoende";
            }

            repaint();
        }
    }
}


