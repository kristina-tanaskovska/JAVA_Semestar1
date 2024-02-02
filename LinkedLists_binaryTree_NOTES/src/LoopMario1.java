import java.util.Scanner;

public class LoopMario1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loop = 1;
        while(loop ==1){
            int n = sc.nextInt();
            if(n>0) {
                for (int i = 0; i < n; i++) {
                    for (int k = n; k > i; k--) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print("#");
                    }
                    System.out.println();

                }
                loop++;
            }
            else{
                System.out.println("Invalid input");
            }


        }

    }
}
