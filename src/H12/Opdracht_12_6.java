package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht_12_6 extends Applet {

    // GLOBAL VARIABLES
    TextField textfield;
    int[] table = {2, 2, 2, 5, 9, 9, 1, 7, 4}; // ARRAY OF EIGHT
    int input; // INPUT FROM TEXTFIELD
    int aantal;


    public void init(){

        // APPLET WINDOW SIZE
        setSize(400,400);

        // TEXTFIELD
        textfield = new TextField(20);
        add(textfield);

        // TEXTFIELD LISTENER
        textfield.addActionListener(new TextFieldListener());

    }

    public void paint (Graphics g){
        int x = 50;
        int y = 80;
        g.drawString("waarde: " + input, x, y);
        y += 20;
        g.drawString("aantal: " + aantal, x, y);

    }


    public class TextFieldListener implements ActionListener{
        public void actionPerformed (ActionEvent e){

            input = Integer.parseInt(textfield.getText());

            aantal = 0;

            for (int i = 0; i < table.length; i++) {
                if (table[i] == input){
                    aantal++;
                }
            }

            repaint();

        }
    }
}
