package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht_10_2 extends Applet {

    TextField textvak;
    int ingevoerde_getal;
    int laagste_getal;

    public void init() {
        setSize(400, 400);

        textvak = new TextField("",20);
        add(textvak);
        TextvakListener tl = new TextvakListener();
        textvak.addActionListener(tl);

        laagste_getal = 50;
    }




    public void paint(Graphics g) {
        g.drawString("ingevoerde getal = " + ingevoerde_getal,20,20);
        g.drawString("laagste getal = " + laagste_getal,20,40);

        textvak.setLocation(20,50);

    }

    class TextvakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

        ingevoerde_getal = Integer.parseInt(textvak.getText());

        if (ingevoerde_getal < laagste_getal) {
            laagste_getal = ingevoerde_getal;

        }

        repaint();
        }

    }

}
