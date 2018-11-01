package H10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht_10_5 extends Applet {

    String cijfer_string, uitslag;
    double cijfer_1, cijfer_2, som;
    TextField textvak_1;
    Button button;
    int aantal;


    public void init() {

        //APPLET WINDOW SIZE
        setSize(400, 400);

        //TEXTVAK 1
        textvak_1 = new TextField("", 40);
        add(textvak_1);
        TextvakListener tl = new TextvakListener();
        textvak_1.addActionListener(tl);

        //BUTTON
        button = new Button("OK.");
        add(button);

        //BUTTON LISTENER
        ButtonListener bl = new ButtonListener();
        button.addActionListener(bl);

        cijfer_string = "Gemiddelde: ";
        uitslag = "";

        cijfer_1 = 0;
        cijfer_2 = 0;
        som = 0;
        aantal = 0;
    }

    public void paint(Graphics g) {
        g.drawString(cijfer_string + (cijfer_1), 35, 100);
        g.drawString(uitslag, 35, 150);

        repaint();
    }


    class TextvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            //TEXTVAK 1
            if (!textvak_1.getText().isEmpty()) {
                cijfer_1 = Double.parseDouble(textvak_1.getText());

                if (cijfer_1 > 10 || cijfer_1 < 1) {
                    cijfer_1 = som / aantal;
                    return;
                }

                som += cijfer_1;
                aantal++;
                cijfer_1 = som / aantal;

            }

            if (cijfer_1 < 5.5)
                uitslag = "Helaas, je bent gezakt.";
            else
                uitslag = "Hoera, je bent geslaagd.";

            repaint();

        }
    }


    class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            //TEXTVAK 1
            if (!textvak_1.getText().isEmpty()) {
                cijfer_1 = Double.parseDouble(textvak_1.getText());

                if (cijfer_1 > 10 || cijfer_1 < 1) {
                    cijfer_1 = som / aantal;
                    return;
                }

                som += cijfer_1;
                aantal++;
                cijfer_1 = som / aantal;

            }

            if (cijfer_1 < 5.5)
                uitslag = "Helaas, je bent gezakt.";
            else
                uitslag = "Hoera, je bent geslaagd.";

            repaint();
        }
    }
}
