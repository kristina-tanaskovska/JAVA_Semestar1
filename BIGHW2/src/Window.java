import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window {

    static int n = main.n;//nxn playing board
    static int numberOfMoves = main.numberOfMoves;
    static int sum = main.sum;

    public static Label[] setup(int sum) {
        Label SUM = new Label("The Target sum is: " + String.valueOf(main.sum));
        Label TARGET = new Label(" "+ 0 );
        Label MOVES = new Label(String.valueOf(main.allottedMoves + 1) + " moves left");
        Label ret[] = new Label[3];
        ret[0] = SUM;
        ret[1] = TARGET;
        ret[2] = MOVES;

        return ret;

    }

    public static void updateWindow(JFrame frame, Label TARGET, Label SUM, Label MOVES, Buttons buttons) {
        SUM.setText(String.valueOf(main.sumCurrent));
        MOVES.setText(String.valueOf(main.allottedMoves) + " moves left");
        frame.getContentPane().removeAll();
        frame.add(SUM, BorderLayout.NORTH);
        frame.add(MOVES, BorderLayout.EAST);
        frame.add(buttons.panel, BorderLayout.CENTER);
        frame.add(TARGET, BorderLayout.SOUTH);

        setMenu(frame);
    }

    static void setMenu(JFrame frame) {
        Menu menu = new Menu(frame);

        menu.menu.add(menu.loadFromFile);
        menu.menu.add(menu.saveToFile);
        frame.setJMenuBar(menu.menuBar);
    }
    static void close(){}
    public static JFrame CreateWindow(Label TARGET, Label SUM, Label MOVES, Buttons buttons) {

        generalButton_METHODS methods = new generalButton_METHODS();
        JFrame frame = new JFrame("The Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 900);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        SUM.setFont(new Font("Times New Roman", Font.BOLD, 16));
        TARGET.setFont(new Font("Times New Roman", Font.BOLD, 16));
        MOVES.setFont(new Font("Times New Roman", Font.BOLD, 16));
        updateWindow(frame, TARGET, SUM, MOVES, buttons);
        return frame;
    }

    public static void OpenWindow(JFrame frame, Label TARGET, Label SUM, Label MOVES, Buttons buttons) {

        generalButton_METHODS methods = new generalButton_METHODS();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 900);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        updateWindow(frame, TARGET, SUM, MOVES, buttons);
    }

    public static void youWin() {
        main.frame.getContentPane().removeAll();
        Label LABEL = new Label("you win");
        LABEL.setFont(new Font("Times New Roman", Font.BOLD, 32));
        main.frame.add(LABEL, BorderLayout.CENTER);
        newGameButton();
    }

    public static void youLose() {
        main.frame.getContentPane().removeAll();
        Label LABEL = new Label("you lose");
        LABEL.setFont(new Font("Times New Roman", Font.BOLD, 32));
        JPanel newGame=new JPanel();
        main.frame.add(LABEL, BorderLayout.CENTER);
        newGameButton();

    }
    public static void throwError(int i){
        main.frame.getContentPane().removeAll();
        Label LABEL = new Label("wrong/corrupted file");
        switch(i){
            case 1:
                LABEL.setFont(new Font("Times New Roman", Font.BOLD, 32));
                main.frame.add(LABEL, BorderLayout.CENTER);
                break;


        }

    }

    static void newGameButton(){
        JButton again = new JButton("New Game?");
        again.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent newGame) {
                main.allottedMoves = 7;
                Buttons buttons = new Buttons();
                buttons.panel = buttons.BUTTONS(generalButton_METHODS.valueOfButton(1),false);
                Label[] LABELS = Window.setup(50);
                Window.OpenWindow(main.frame,LABELS[0],LABELS[1],LABELS[2],buttons);
            }
        });
        JPanel newGame=new JPanel();

        newGame.add(again);
        main.frame.add(newGame, BorderLayout.SOUTH);
    }
}