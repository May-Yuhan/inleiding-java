package H8;

//import library / event handlers
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht_8_1 extends Applet {


    Button button;
    Button button_2;
    String words;
    TextField textfield;
    Label label;


    public void init() {

        setSize(500,500);

        //RETURN BUTTON
        button = new Button("RETURN");
        button.addActionListener(new ButtonListener());
        add(button);

        //RESET
        button_2 = new Button("ERASE");
        button_2.addActionListener(new ResetKnopListener());
        add(button_2);

        //LABEL NEXT TO RETURN BUTTON
        label = new Label("SEARCH");
        add(label);

        //TEXT FIELD STOCK TEXT
        textfield = new TextField("CLICK ON ME", 20);
        add(textfield);
    }


    public void paint(Graphics g) {
        g.drawString(words, 50, 60);
    }


    class ResetKnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
           textfield.setText(" ");
           words = textfield.getText();
           repaint();
        }
    }


    class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            words = textfield.getText();
            repaint();
        }

    }

}








