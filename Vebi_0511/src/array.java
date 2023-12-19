import java.util.Scanner;
public class array{
    public static void main(String[] args){
        /*Write a program that creates an array of integers.
    Write a method that searches for all even values and prints them.*/
        System.out.println("Give me the size off the array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] newArray=new int[size];
        System.out.println("Put in the values");
        for(int i=0; i<size; i++){
            newArray[i]=sc.nextInt();
        }
        System.out.print("Parni broevi se: ");
        for (int n : newArray){
            if(n%2==0){
                System.out.print(n);

            }
        }


    }

}
