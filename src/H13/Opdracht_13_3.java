package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht_13_3 extends Applet {
    Button button1;
    Button button2;
    int width;
    int height;
    Color color;
    boolean test = false;

    public void init() {
        setSize(600, 400);
        width = 10; height = 5;

        button1 = new Button("Rode bakstenen muur");
        button1.addActionListener( new Button1Listener());

        button2 = new Button("Grijze betonnen muur");
        button2.addActionListener( new Button2Listener());

        add(button1);
        add(button2);
    }

    class Button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            test = true;
            width = 40;
            height = 20;
            color = Color.red;
            repaint();
        }
    }

    class Button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            test = true;
            width = 60;
            height = 30;
            color = Color.lightGray;
            repaint();
        }
    }


    void knop(Graphics g, int x, int y, int length) {

        int tempX = x;

        for (int row = 0; row < length; row++) {

            for (int i = 0; i < 8; i++) {

                g.setColor(color);
                g.fillRect(x, y, width, height);
                g.setColor(Color.black);
                g.drawRect(x, y, width, height);
                x += width;
            }

            if (row % 2 == 0) {
                x = tempX + (width / 2);
            } else {
                x = tempX;
            }

            y += height;

        }

    }

    public void paint(Graphics g) {
        if (test == true) {
            knop(g, 60, 60, 10);
        } else {
            return;
        }

    }

}
