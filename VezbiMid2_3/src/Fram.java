import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Fram {
    Scanner sc = new Scanner(System.in);
    static String i;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton();
        JTextField field = new JTextField();

        field.setPreferredSize(new Dimension(50, 50));
        button.setSize(50,50);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i = field.getText();
                if (isInteger(i)) {
                    button.setText("Integer: " + i);
                } else {
                    button.setText("ERROR");
                }
            }
        });
        frame.setVisible(true);
        frame.setSize(400, 200);

        panel.add(field);
        panel.add(button);
        frame.add(panel);
    }
    private static boolean isInteger(String input) {
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false; // If any character is not a digit, it's not an integer
            }
        }
        return true;
    }

}
