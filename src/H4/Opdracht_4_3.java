    package H4;

    //imported java libraries
    import java.awt.*;
    import java.applet.*;



/*
 * CREATED ON 14-09-2018, DENNIS JUMAN
 */


    //opdracht 4.3
    public class Opdracht_4_3 extends Applet {


        //core settings
    public void init(){
        setBackground(Color.black);
        setSize(400, 400);
}




//flag
    public void paint(Graphics flag_color){
        flag_color.setColor(Color.red);
        flag_color.fillRect(50,50,200,50);


        //white flag color
        flag_color.setColor(Color.white);
        flag_color.fillRect(50,100,200,50);


        //blue flag color
        flag_color.setColor(Color.blue);
        flag_color.fillRect(50,150,200,50);

        //white flag color
        flag_color.setColor(Color.white);
        flag_color.fillRect(50,50,10,500);
    }

}
