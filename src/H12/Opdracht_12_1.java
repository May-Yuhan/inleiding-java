package H12;

//07-11-2018 | STUDNTNMR.2040021

import java.awt.*;
import java.applet.*;

public class Opdracht_12_1 extends Applet {

    double[] tabel;
    int teller = 30;
    double temp = 0;
    double result;


    public void init(){

        tabel = new double[10];


        for(int i = 0; i < tabel.length; i++) {

            tabel[i] = 1000 * (i+1);



        }

        for (int i = 0; i < tabel.length; i++) {

            temp += tabel[i];

        }



    }

    public void paint (Graphics g){

        for(int tabellen = 0; tabellen < tabel.length; ++tabellen){

            teller += 20;

            g.drawString("" + tabel[tabellen],50,teller);


        }

        teller = 30;
        g.drawString("" + temp / 10, 120, 50);



    }

}

