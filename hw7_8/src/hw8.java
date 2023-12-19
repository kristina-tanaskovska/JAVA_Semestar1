//This program takes in one string/word and outputs every other character in reverse order
import java.util.*;
public class hw8 {
    public static void main(String[] args){
        //defining scanner
        Scanner sc= new Scanner(System.in);
        //giving instructions to user
        System.out.println("Please enter a string");
        //defining string
        String str1= sc.nextLine();
        //converting string to character array for further manipulation
        //+the reverse method could have been used but i did the reverse with a for loop
        char[] strArray = str1.toCharArray();
        //loop to go through the array
        for (int i = strArray.length-1; i >=0 ; i--) {
            //to print every other element
            if (i%2 != 0){
                System.out.print(strArray[i]);
            }
            //to print the space
            //could have been done in only if statement too
            else{
                System.out.print(" ");
            }
        }
    }
}
