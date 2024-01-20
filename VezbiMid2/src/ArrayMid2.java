import java.util.*;
public class ArrayMid2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ht en umber of strings: " );
        int numOfStrings = sc.nextInt();
        String[] array = new String[numOfStrings];
        System.out.println("Enter a string of array: ");
        for (int i = 0; i < numOfStrings; i++) {
            array[i] = sc.nextLine();
        }
        for (int i = 0; i < numOfStrings; i++) {
            if (containsA(array[i])){
                System.out.println(array[i]);
            }
        }




    }
    public static void containsA(String word){
        for (int i = 0; i < word.length()-3; i++) {
            if(word.charAt(i) == 'a' && word.charAt(i) == 'a' && word.charAt(i) == 'a' ){
                System.out.println(""+word);
            }
        }
    }
}
