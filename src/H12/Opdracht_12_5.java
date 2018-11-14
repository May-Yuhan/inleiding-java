package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht_12_5 extends Applet {

    Button button;
    TextField textfield;
    int table[] = {0, 1, 2, 4, 6, 8, 10, 12, 14, 16, 18};
    int input;

    public void init() {

        button = new Button("OK");
        add(button);

        textfield = new TextField(20);
        button.addActionListener(new ButtonListener());
        add(textfield);


    }


    public void paint(Graphics g) {

        for (int i = 0; i < 10; i++) {

            if (table[i] == input) {

                g.drawString("Index: " + i, 50, 50);
                g.drawString("Table: " + table[i], 50, 70);
                break;
            }
        }

    }

    public class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = Integer.parseInt(textfield.getText());


            repaint();
        }
    }
}




