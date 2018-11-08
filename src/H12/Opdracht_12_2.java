package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_12_2 extends Applet {

    Button button[];

    public void init(){

        button = new Button[25];

        for (int i = 0; i < 25; i++) {

            button[i] = new Button("BUTTON " + (1+i));
            add(button[i]);

        }

        }

    }



