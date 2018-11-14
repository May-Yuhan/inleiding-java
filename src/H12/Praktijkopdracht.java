package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    // GLOBAL VARIABLES
    TextField textfield_1, textfield_2;
    Button button;
    String[] name; // Array voor namen
    String[] phone; // Array voor telefoonnummers


    int teller; // 1-10
    int posArray = 0; // positie in de array 0-9
    int ypos = 100; // om omlaag tegaan

    public void init() {

        // APPLET WINDOW SIZE
        setSize(500, 400);

        name = new String[10];
        phone = new String[10];

        // BUTTON
        button = new Button("OK");
        add(button);

        // BUTTON LISTENER
        button.addActionListener(new TextFieldListener());

        // NAME TEXTFIELD
        textfield_1 = new TextField(20);
        add(textfield_1);

        // NUMBER TEXTFIELD
        textfield_2 = new TextField(20);
        add(textfield_2);

    }

    public void paint(Graphics g) {
        if (teller == 10) { // als er 10x op de knop is gedrukt (teller) dan activeerd hij de for loop
            for (int i = 0; i < 10; i++) {
                g.drawString("naam: " + name[i], 80, ypos);
                g.drawString("telefoonnummer: " + phone[i], 190, ypos);
                ypos += 20;
            } // gaat langs elke array positie en plaats ze onder elkaar
            ypos = 100;
            teller = 0;
        } // reset de plaats en teller
        g.drawString(teller + " van de 10", 80, 60); // laat zien hoe vaak er op de knop is gedrukt


    }

    public class TextFieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (posArray == 10) {
                posArray = 0;
                repaint();
            } // als de posArray 10 is dan word hij weer 0 om de index te resetten

            name[posArray] = textfield_1.getText(); // Plaats de tekst van textfield_1 in de array name op de angegeven positie
            phone[posArray] = textfield_2.getText(); // ^

            teller++; // telt hoeveel keer je op de knop hebt gedrukt en geeft aab hoeveel keer er al een naam en nummer is opgegeven
            posArray++; // positie van de index 0-9
            repaint();
        }
    }
}

