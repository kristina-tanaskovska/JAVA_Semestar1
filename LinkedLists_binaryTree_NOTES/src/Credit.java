import java.util.Scanner;

public class Credit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cardNumber = new int[16];
        int sumProduct = 0;
        int sumProductDigits = 0;
        for (int i = 0; i < 16; i++) {
           cardNumber[i] = sc.nextInt();
        }
        for (int i = 15; i >= 0; i--) {
            if(i%2 == 0){
                cardNumber[i]= cardNumber[i]*2;
                sumProductDigits +=(cardNumber[i]%10)+ (cardNumber[i]/10);
            }
            else{
                sumProduct += cardNumber[i];
            }

        }
        if((sumProductDigits + sumProduct) %10 == 0){
            System.out.println("VALID");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
