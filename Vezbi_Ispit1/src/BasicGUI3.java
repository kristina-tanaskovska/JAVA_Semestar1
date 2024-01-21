import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class BasicGUI3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button changing buttons");
        JPanel panel = new JPanel();
        Random r = new Random(25);
       char randomLetter = (char) (r.nextInt(25) +'A');
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();



        for (int i = 0; i < 5; i++) {
            JButton btr = new JButton(""+r.nextInt(25, 'a'));
            btr.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    btr.setBackground(Color.RED);
                }
            });
            panel.add(btr);
        }
        for (int i = 0; i < 5; i++) {
            JButton btr = new JButton(randomLetter+"");
            btr.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    btr.setBackground(Color.BLUE);
                    btr.setPreferredSize(new Dimension(100, 200));

                }
            });
            panel.add(btr);
        }

        frame.setVisible(true);
        panel.setLayout(new FlowLayout());
        frame.add(panel);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.revalidate();
    }
}
