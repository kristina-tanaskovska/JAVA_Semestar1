import java.util.Scanner;

public class Cash1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much change do I need to give back? ");
        int change = sc.nextInt();
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        while (change >= 25) {
            quarters++;
            change -= 25;
        }

        while (change >= 10) {
            dimes++;
            change -= 10;
        }

        while (change >= 5) {
            nickels++;
            change -= 5;
        }

        while (change >= 1) {
            pennies++;
            change -= 1;
        }

        System.out.println("I will give you " + quarters + " quarters, " + dimes + " dimes, " +
                nickels + " nickels, and " + pennies + " pennies.");
    }
}
