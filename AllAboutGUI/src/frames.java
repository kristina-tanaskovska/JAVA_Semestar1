import javax.swing.*;
import java.awt.*;

public class frames extends JFrame { // JFrame is the superclass
   frames(){
       this.setVisible(true); //make frame visible
       this.setSize(420 , 420); //to have specific dimentions
       this.setResizable(false);//prevent frame from being resized
       this.setTitle("JFrame title goes here"); //title of window
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close application

       //the image icon has to be in the project folder
       ImageIcon image = new ImageIcon("ImageIcon.jpg"); //change icon
       this.setIconImage(image.getImage());

       this.getContentPane().setBackground(new Color(0, 153, 0)); //change color of background

   }
}
