package Java_Challenge_2018_H8_3;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Fooicalculator extends Applet {

    Button button;
    TextField textvak_1;
    Label label;
    String string;
    double btw_percentage = 15;
    double btw_total;
    double inputAsDouble;
    double neutral;
    int double_to_int;

    double fooii;

    public void init() {
        setSize(400, 400);


        //textvak_1
        textvak_1 = new TextField("", 20);
        add(textvak_1);
        textvak_1.addActionListener(new Fooicalculator.TextFieldListener());



        // "-" button (negative)
        button = new Button("-");
        add(button);
        button.addActionListener(new NegativeButton());

        // "+" button (positive)
        button = new Button("+");
        add(button);
        button.addActionListener(new PositiveButton());


        //string
        string = "";

        // - negative button value
        neutral = 1;

        double_to_int = (int) btw_percentage;
    }

    public void paint(Graphics g) {
        g.drawString(btw_total + "", 175, 70);
        g.drawString(btw_percentage + "%", 175, 50);
        g.drawString(fooii+ "",50,50);
    }


    class NegativeButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            btw_percentage = btw_percentage - neutral;
            repaint();


        }
    }


    class PositiveButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            btw_percentage = btw_percentage + neutral;
            repaint();

        }
    }



    class TextFieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String inputAsString = textvak_1.getText();
            inputAsDouble = Double.parseDouble(inputAsString);
            btw_total = inputAsDouble * (btw_percentage / 100 + 1);

            fooii = inputAsDouble;
            repaint();

        }
    }
}

