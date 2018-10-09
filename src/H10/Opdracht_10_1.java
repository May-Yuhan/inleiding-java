package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht_10_1 extends Applet {

        TextField textvak;
        int hoogste_getal, ingevoerde_getal;
        String s;


        public void init() {

            setSize(400,400);

            textvak = new TextField("",20);
            add (textvak);
            TextvakListener tl = new TextvakListener();
            textvak.addActionListener (tl);


        }





        public void paint(Graphics g) {
        g.drawString("Het hoogste getal is: " + hoogste_getal,20,20);
        g.drawString("Het ingevoerde getal is: " + ingevoerde_getal,20,40);

        textvak.setLocation(20,50);

        }
        class TextvakListener implements ActionListener{

            public void  actionPerformed(ActionEvent e){

                ingevoerde_getal = Integer.parseInt(textvak.getText());

                if ( ingevoerde_getal > hoogste_getal ) {
                    hoogste_getal = ingevoerde_getal;

                }

                repaint();



            }
        }

    }
