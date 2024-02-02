import java.util.Scanner;

public class LoopMario2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop =1;
        while (loop == 1) {
            int n = sc.nextInt();
            if(n<9 && n>0){
                for (int i = 1; i <= n; i++) {
                    for (int j = n; j >i ; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("#");
                    }
                    System.out.print(" ");

                    for (int j = 1; j <= i; j++) {
                        System.out.print("#");
                    }

                    System.out.println();
                }
                loop =0;
            }
            else{
                System.out.println("Invalid input");
            }
            
        }


    }
}
