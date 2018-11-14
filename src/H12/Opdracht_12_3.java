package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EventListener;

public class Opdracht_12_3 extends Applet {

    TextField[] textfield;
    Button button;
    int getallen[];

    public void init() {

        setSize(600, 200);

        textfield = new TextField[5];
        getallen = new int[5];

        for (int i = 0; i < textfield.length; i++) {

            textfield[i] = new TextField("", 10);
            add(textfield[i]);

        }

        // BUTTON
        button = new Button("SORT");
        button.addActionListener(new ButtonListener());
        add(button);
    }

    public class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            ArrayList<Integer> toSort = new ArrayList<>();

                for (int i = 0; i < getallen.length; i++) {
                    int invoer = Integer.parseInt(textfield[i].getText());
                    toSort.add(invoer);

                }

                // SORTEREN
                Collections.sort(toSort);
                for (int i = 0; i < textfield.length; i++) {
                textfield[i].setText("" + toSort.get(i));
            }
        }
    }
}
