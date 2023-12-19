import java.util.*;
public class mid3 {
    public static void main(String[] args){
        System.out.println("Vnesi dolzina na arrayot");
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int[] array= new int[a];
        int counter=0;
        int product=1;
        for(int i=0; i<array.length; i++){
            array[i]= sc.nextInt();
        }
        System.out.println("All even numbers are: ");
        for(int i=0; i<array.length; i++){
           if(array[i]%2==0){
               System.out.println(array[i]);
           }
           if(array[i]<0){
               counter++;
           }
           if(i%2 != 0){
               product=product*array[i];
           }

        }
        System.out.println("The number of negative num is: "+counter);
        System.out.println("The product of all numbers on od indexes is: "+product);
    }
}
