import java.util.*;
public class MidEx3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string ");
        String a= sc.nextLine();
        String[] newArray= a.split(" ", 0);
        char[] charArray = new char[newArray.length];
        for(int i=0; i< newArray.length; i++){
            charArray[i]= newArray[i].charAt(0);
        }
        printArray(charArray);
    }

    public static void printArray(char[] charArray){
        for(int i=0; i<charArray.length; i++){
            System.out.print(charArray[i]);
        }
    }
}
