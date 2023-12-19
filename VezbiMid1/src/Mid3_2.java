import java.util.*;
public class Mid3_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How long do you want the arrray");
        int leng= sc.nextInt();
        System.out.println("Give me num for array");
        int[] intArray= new int[leng];
        for(int i=0; i<leng; i++){
            intArray[i] = sc.nextInt();
        }
        for(int i=4; i<=9; i++){
            System.out.println(intArray[i]);
        }


    }
}
