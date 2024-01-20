/*
In the Java programming language, write a program that opens a
400x200 window with two 200x200 buttons. One button says "Close" -
which closes the program, and on the other the number "16". Each time you press this button,
the number is halved until 1.
When 1 is reached the button does not change anymore.
*/

import javax.swing.*;

public class GuiMid2 extends JFrame {
    public GuiMid2(){
        this.setSize(400, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args){
        new GuiMid2();
    }
}
