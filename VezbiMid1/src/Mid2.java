import java.util.*;
public class Mid2 {
    public static void main(String[] args){
        System.out.println("Vnesi eden broj");
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int sum=0;
        for (int i=0; i<=a; i++){
            if (i%5==0){
                sum=sum+i;
                System.out.print(i+"+");
            }
        }
        System.out.println();
        System.out.println("ZBIROT  E "+sum);
    }
}
