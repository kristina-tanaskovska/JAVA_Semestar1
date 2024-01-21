import javax.swing.*;
import java.awt.*;

public class BasicGUI1 {
    public static void main(String[] args) {
        JFrame  frame = new JFrame("Personal details");
        JPanel panel = new JPanel();
        JButton btr = new JButton("OK");
        JLabel label = new JLabel("Enter you name: ");
        JTextField fieldtxt = new JTextField();
        JCheckBox check = new JCheckBox("Student");
        String[] list = new String[]{"1", "2", "3"};
        JComboBox combo = new JComboBox(list);

        fieldtxt.setPreferredSize(new Dimension( 100, 50));



        panel.add(btr);
        panel.add(label);
        panel.add(fieldtxt);
        panel.add(check);
        panel.add(combo);

        frame.add(panel);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(700, 700);
        frame.setResizable(false);
        frame.revalidate();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

    }
}
