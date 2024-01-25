import javax.swing.*;
import java.awt.*;

class main {
    static int sum = 50;
    static int numberOfMoves=51;
    static int allottedMoves = 7;
    static int sumCurrent = 0;
    static int n=9;
    static int toClick = 1;
    static Buttons buttons = new Buttons();

    static Label[] LABELS = Window.setup(sum);
    static JFrame frame = Window.CreateWindow(LABELS[0], LABELS[1], LABELS[2], buttons);



    public static void main(String[] args) {
        buttons.panel = buttons.BUTTONS(generalButton_METHODS.valueOfButton(1),false);
        Window.OpenWindow(frame,LABELS[0],LABELS[1],LABELS[2],buttons);
    }
    public static void upWindow() {
        for (int i = 0; i < n * n; i++) {
            if (!buttons.buttonList.get(i).beenClicked) {
                if (buttons.buttonList.get(i).row % main.toClick == 0 ||
                        buttons.buttonList.get(i).column % main.toClick == 0) {
                    buttons.buttonList.get(i).button.setBackground(Color.GREEN);
                } else {
                    buttons.buttonList.get(i).button.setBackground(Color.white);
                }
                LABELS[1].setText(String.valueOf(main.sumCurrent));
                LABELS[2].setText(String.valueOf(main.allottedMoves) + " moves left");
            }


        }
    }
    public static void error(int i){
        Window.throwError(i);
    }
}
