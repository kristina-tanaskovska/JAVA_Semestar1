import java.util.*;
public class MidEx2_3 {
 public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     String a = sc.nextLine();
     char[] arrayA = a.toCharArray();
     for(int i=0; i<arrayA.length; i++){
         if(i%2 != 0){
             arrayA[i]= '*';
             System.out.print(arrayA[i]);
         }else{
             System.out.print(arrayA[i]);
         }

     }


 }
}
