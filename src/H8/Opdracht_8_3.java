package H8;


import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht_8_3 extends Applet {

    Button knop;
    TextField textvak_1;
    TextField textvak_2;
    Label label;
    String string;
    final double btw_percentage = 21;
    double btw_total;
    double inputAsDouble;



    public void init () {

        setSize (400,400);



        //button
        knop = new Button("OK");
        add (knop);
        knop.addActionListener(new TextFieldListener());

        //textvak_1
        textvak_1 = new TextField("",20);
        add (textvak_1);
        textvak_1.addActionListener (new TextFieldListener());



        //label
        label = new Label("");
        add (label);

        //string
        string = "";
        
    }

    public void paint (Graphics g){
        g.drawString(btw_total + "", 50,60);

    }



    class TextFieldListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            String inputAsString = textvak_1.getText();
            inputAsDouble = Double.parseDouble( inputAsString );
            btw_total = inputAsDouble * (btw_percentage / 100 + 1);
            repaint ();
        }
    }
}
