import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <=i ; j++) {
                if((i+j)%2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }

            }
            for (int k = i; k <=x ; k++) {
                System.out.print("0");
            }

            System.out.println();
        }
    }
}
