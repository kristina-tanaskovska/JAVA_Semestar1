import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button2 {
    static int counter1=100;
    static int counter2 = 0;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton(""+counter1);
        JLabel label = new JLabel(""+counter2);
        JPanel panel = new JPanel();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter1 --;
                counter2++;
                button.setText(String.valueOf(counter1));
                label.setText(String.valueOf(counter2));
            }
        });
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setResizable(false);

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.revalidate();
        //panel.revalidate; to update frame
    }
}
