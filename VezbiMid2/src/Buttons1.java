import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/*
Add 10 buttons
Hint: flow layout
they change color when clicked
 */
public class Buttons1 {

    public static void main(String[] args) {
        Random r= new Random();
        JFrame frame= new JFrame();
        JPanel panel = new JPanel();
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        int n=10;
        for (int i = 0; i<n ; i++){
            if(i<=n/2) {
                JButton button = new JButton();
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        button.setBackground(new Color(r.nextInt(100)));
                    }
                });
                char butText = (char) (r.nextInt(25) + 'A');
                button.setText(String.valueOf(butText));
                frame.add(button);
            }
            else{
                JButton button = new JButton();
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        button.setBackground(new Color(r.nextInt(100)));
                    }
                });
                int butText1 = r.nextInt(25);
                button.setForeground(Color.WHITE);
                button.setText(String.valueOf(butText1));
                frame.add(button);
            }
        }
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500 ,500);
;
    }


}
