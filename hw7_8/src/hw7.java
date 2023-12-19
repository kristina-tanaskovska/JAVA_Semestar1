/*Write a program that asks the user to input 10 numbers.
The program must output square subtract of last and first, last-1 and 2nd*/
import java.util.*;
public class hw7 {
    public static void main(String[] args){
        //calling scanner
        Scanner sc = new Scanner(System.in);
        //giving instructions to users
        System.out.println("Enter 10 numbers: ");
        //initialing variables, array,integers
        int[] numArray = new int[10];
        int result =0;
        int j= numArray.length-1;
        //for loop taking in 10 values in array
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = sc.nextInt();
        }
        //for loop printing the given numbers like the given example in the exercise
        System.out.print("You entered numbers: ");
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i]+ " ");
        }
        //outputting results
        System.out.println();
        System.out.print("The result is: ");
        //loop that moves elements from first to last
        for (int i = 0; i < numArray.length ; i++) {
            //calculates the power of the difference of last and first element (result)
            result=(numArray[i]-numArray[j])*(numArray[i]-numArray[j]);
            //goes through elements in reverse
            j--;
            //outputs result
            System.out.print(result+" ");
        }


    }
}
