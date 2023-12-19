import java.util.*;
import java.lang.*;
public class MidEx2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("How long do you want the array to be ");
        int n = sc.nextInt();
        System.out.println("Enter values for array");
        int[] nameArray= new int[n];
        for (int i=0; i<n; i++){
            nameArray[i]= sc.nextInt();
        }
        int sum=0;

        for (int i=0; i<= n; i++){
            sum=sum+nameArray[i]*nameArray[i];
        }
        double squere= (float) Math.sqrt(sum);
        int counter=0;
        for( int j=n; j>=0; j--){
            if (nameArray[j]%2 == 0){
                System.out.println("The array with only even numbers in reverse order is "
                        +nameArray[j]);
            }
            if (nameArray[j]>100){
                counter=counter+1;
            }

        }
        System.out.println("The root of the sum of all squeres is: "+squere);
    }
}

