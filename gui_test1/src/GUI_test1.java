import javax.swing.*;
import java.awt.*;

public class GUI_test1 {

    //is constructer and is treated as a method
    public GUI_test1(){
        //creating the objects
        JFrame frame= new JFrame();
        JPanel panel = new JPanel();
        JButton button= new JButton("Click meeee");
        JLabel label = new JLabel("Number of clicks 0");

        button.setBackground(Color.RED);
        //this means it goes to the class its already in and uses an action listener method
        button.addActionListener(this);

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
}
