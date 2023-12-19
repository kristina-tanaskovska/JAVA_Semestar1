import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner yearScanner = new Scanner(System.in);
        System.out.println("Tell me a year: ");
        int inYear = yearScanner.nextInt();

        if ((inYear%4==0 && inYear%100!=0)|| (inYear%400==0)){
            System.out.println("The year "+ inYear+" is a leap year");
        }
        else {
            System.out.println("Not leap year");
        }
    }
}
