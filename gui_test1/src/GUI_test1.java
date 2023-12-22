import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_test1 implements ActionListener {

    int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    //is constructer and is treated as a method
    public GUI_test1(){
        //creating the objects
         frame= new JFrame();
         panel = new JPanel();
         JButton button= new JButton("Click meeee");
        label = new JLabel("Number of clicks 0");

        button.setBackground(Color.RED);
        //this means it goes to the class its already in and uses an action listener method
        button.addActionListener(this); //this isnt read, must impliment in class

        //to use an object
        //top bottom left right dimentions in pixels
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0, 1));
        //add button to pannel
        panel.add(button);
        panel.add(label);

        //add something with object constraints
        //adding the pannel to the frame
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);

        /*for(int i=1;i<=9;i++)
        {
            for(int j=1; j<=9;j++){
                panel.add(new JButton(""+i));
            }
            System.out.println();
        }*/
    }

    public static void main(String[] args){
        //this is connected to the above class
        new GUI_test1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks "+ count);
    }
}
