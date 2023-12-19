import java.util.Scanner;
import static java.lang.Math.sqrt;

public class MidEx1_1 {
    public static void main(String[] args){
        System.out.println("Give me two integers");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        double sqrta= a*a;
        double squereb=b*b;
        float difference= (float) (sqrta-squereb);
        System.out.println("The difference of their squeres is "+ difference);

    }
}
