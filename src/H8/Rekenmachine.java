package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Rekenmachine extends Applet {


    TextField textfield1,textfield2;
    Button button1,button2,button3,button4;


    double result;



    public void init(){
        setSize(400,400);

        //textfield1 = bedrag invoer textvak 1
        textfield1 = new TextField(10);
        add (textfield1);


        //textfield2 = bedrag invoer textvak 2
        textfield2 = new TextField(10);
        add (textfield2);


        // button1 = keer (x a.k.a *)
        button1 = new Button("x");
        add(button1);
        MultiplyListener b1l = new MultiplyListener();
        button1.addActionListener (b1l);


        //button2
        button2 = new Button(":");
        add (button2);
        DivisionListener b2l = new DivisionListener();
        button2.addActionListener (b2l);


        //button3
        button3 = new Button("+");
        add (button3);
        ButtonListener3 b3l = new ButtonListener3();
        button3.addActionListener (b3l);



        //button4
        button4 = new Button("-");
        add (button4);
        ButtonListener4 b4l = new ButtonListener4();
        button4.addActionListener (b4l);


    }

    public void paint(Graphics g) {

        button1.setSize(20,20);
        button1.setLocation(220,9);

        button2.setSize(20,20);
        button2.setLocation(245,9);

        button3.setSize(20,20);
        button3.setLocation(270,9);

        button4.setSize(20,20);
        button4.setLocation(295,9);

    }

    class MultiplyListener implements ActionListener{

        public void actionPerformed(ActionEvent e){

            double num1 = Double.parseDouble(textfield1.getText());
            double num2 = Double.parseDouble(textfield2.getText());

            result = num1 * num2;
            textfield1.setText("" + result);
            textfield2.setText("");

            repaint();

        }
    }



    class DivisionListener implements ActionListener{

        public void actionPerformed(ActionEvent e){

            double num1 = Double.parseDouble(textfield1.getText());
            double num2 = Double.parseDouble(textfield2.getText());

            result = num1 / num2;
            textfield1.setText("" + result);
            textfield2.setText("");

            repaint();

        }
    }

    class ButtonListener3 implements ActionListener{

        public void actionPerformed(ActionEvent e){

            double num1 = Double.parseDouble(textfield1.getText());
            double num2 = Double.parseDouble(textfield2.getText());

            result = num1 + num2;
            textfield1.setText("" + result);
            textfield2.setText("");

            repaint();

        }
    }

    class ButtonListener4 implements ActionListener{

        public void actionPerformed(ActionEvent e){

            double num1 = Double.parseDouble(textfield1.getText());
            double num2 = Double.parseDouble(textfield2.getText());

            result = num1 - num2;
            textfield1.setText("" + result);
            textfield2.setText("");

            repaint();

        }
    }




}
