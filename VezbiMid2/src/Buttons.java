import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons{
    public static int counter =16;
    public static void main(String[] args) {

        JFrame frame=new JFrame();
        JPanel panel = new JPanel();
        JButton button1 = new JButton("CLOSE");
        JButton button2 = new JButton(""+counter);
        frame.setSize(400,200);
        frame.setVisible(true);

        button1.setPreferredSize(new Dimension(200, 200));

        button2.setPreferredSize(new Dimension(200, 200));


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(counter>0){
                    counter = counter/2;
                    button2.setText(""+counter);
                    button2.setText(String.valueOf(counter));
                }
            }
        });
        panel.add(button1);
        panel.add(button2);
        frame.add(panel);

    }

}
