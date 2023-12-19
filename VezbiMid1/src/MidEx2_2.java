import java.util.*;
public class MidEx2_2 {
    public static void main(String[] args){
        System.out.println("Insert string");
        Scanner sc=new Scanner(System.in);
        String a = sc.nextLine();
        char[] charA= a.toCharArray();
        char[] reverse= new char[charA.length];
        int n= charA.length;
        for(int i= charA.length-1; i>=0; i--){
            reverse[n]=charA[i];
            n--;
        }
        for(int i=0; i< charA.length; i++){
            if (charA[i] == reverse[n]){
                System.out.println("The "+i+" Character matches");
            }
            else {
                System.out.println("It is not palindrome");
            }
            n--;
        }
    }
}
