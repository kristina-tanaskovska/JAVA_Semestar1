import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Button implements ActionListener {

    int numberCover;//1-9; depending on this value rows and columns divisible by it will be 'uncovered'
    int numberValue;//the number which contributes to the final sum
    int row;//>0; divisibility is checked with numberCover
    int column;//>0; divisibility is checked with numberCover
    int genCount;
    boolean beenClicked = false;

    String Cover = String.valueOf(numberValue); //????for use with button manipulation
    String unCover = String.valueOf(numberValue); //for use with button manipulation
    JButton button = new JButton(Cover);


    public Button(int genCount, int n, int numberValue, boolean istrue) {//constructor for button

        row = (int) genCount / n + 1;
        column = genCount % n + 1;
        this.genCount = genCount;
        this.numberValue = numberValue;
        button.setText(String.valueOf(numberValue));
        button.addActionListener(this::actionPerformed);
        beenClicked = istrue;

    }

 /*   ActionListener AL = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }


    };*/

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(main.sumCurrent);
        if (beenClicked == false) {
            if (row % main.toClick == 0 || column % main.toClick == 0) {

                beenClicked = true;
                button.setBackground(Color.RED);
                main.sumCurrent += numberValue;
                main.toClick = numberValue;
                button.setText("-=-");
                main.allottedMoves--;
                generalButton_METHODS.checkWin();
                main.upWindow();
                //    main.allottedMoves--;
                //    generalButton_METHODS.checkWin();
            }
        }

    }
}


