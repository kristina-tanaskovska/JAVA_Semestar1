import java.util.*;
public class MidEx3_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How long do you want the array to be ");
        int leng= sc.nextInt();
        int[] a = imputArrayInt(leng, sc);
        int sum=0;
        int biggestNum=0;
        for(int i=0; i<leng; i++){
            if(a[i] > biggestNum ) {
                biggestNum = a[i];
            }
        }
        for(int i=leng-1; i>leng/2;i--){
            sum=sum+a[i];
        }
        for(int i=0; i<leng; i++){
            if(a[i]%7==0){
                System.out.println("A number devisible by 7 is "+ a[i]+" ");
            }
        }
        System.out.println("The sum is "+sum);
        System.out.println("The biggest num is "+biggestNum);
    }
    public static int[] imputArrayInt(int leng,Scanner sc){
        int[] intArray = new int[leng];
        for (int i=0; i<leng; i++){
            intArray[i]= sc.nextInt();
        }
        return intArray;
    }
}
