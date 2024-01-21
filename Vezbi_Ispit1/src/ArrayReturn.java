/*
How to return multiple values of a function
 */
import java.util.*;
public class ArrayReturn {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        int[] a1 = CallingArray(a, b);
        int arr = a1[0];
        int brr = a1[1];
        System.out.println(arr+" "+ brr);

    }
    public static int[] CallingArray(int a, int b){
        int[] ar = new int[2];
        ar[0] = a+2;
        ar[1]= b+3;

        return ar;
    }
}
