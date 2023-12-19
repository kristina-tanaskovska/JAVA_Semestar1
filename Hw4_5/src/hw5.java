import java.util.*;
public class hw5 {
    public static void main(String[] arg){
        Scanner SC= new Scanner(System.in);
//called the scanner into the program
//let the user input the values of two numbers
        System.out.println("Enter to numbers");
        int num1= SC.nextInt();
        int num2=SC.nextInt();
//comparing the two numbers and printing the biggest
        if (num1>num2){
            System.out.println("The greater number is: "+num1);
        }
        else  {
            System.out.println("The greater number is: "+num2);
        }
//calculating the arithmetic mean
        double ar= (double) (num1 + num2) /2;
//printing the arithmetic mean
        System.out.println("The arithmetic mean is: "+num1+"+"+num2+"/2="+ar);

    }
}

