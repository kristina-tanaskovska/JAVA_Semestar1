import javax.swing.*;
import java.util.Random;

public class BasicGUI2_2 {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog(null, "Enter your name","Personal details", JOptionPane.QUESTION_MESSAGE );
        String input2 = JOptionPane.showInputDialog(null, "Enter wanted grade","WISH", JOptionPane.QUESTION_MESSAGE );

        int grade = Integer.parseInt(input2);
        Random r = new Random();
        boolean truth = r.nextBoolean();

        String output = "I know you, "+input1+". You wish to have "+input2+". This wish will be "+truth;
        JOptionPane.showMessageDialog(null, output,"Fortune below", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
