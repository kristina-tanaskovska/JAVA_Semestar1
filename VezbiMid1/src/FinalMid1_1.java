import java.util.Scanner;

public class FinalMid1_1 {
    public static void main(String[] args){
        System.out.println("Vnesi dva broja");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b){
            System.out.println("The bigger number is "+ a);
        }
        else{
            System.out.println("The bigger number is "+ b);
        }

    }
}
