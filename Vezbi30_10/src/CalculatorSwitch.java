import java.util.Scanner;
public class CalculatorSwitch {
    public static void main(String[] args){
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Insert two numbers that you'd do two operations with");
        double a = numScanner.nextDouble();
        double b = numScanner.nextDouble();
        System.out.println("Choose an operation: sum, multi, divide, odzema");

        String operation = numScanner.next();
        switch (operation){
            case "sum":
                System.out.println(a+b);
                break;
            case "multi":
                System.out.println(a*b);
                break;
            case "devide":
                System.out.println(a/b);
                break;
            case "odzema":
                System.out.println("The result is: "+(a-b));
                break;

            default:
                System.out.println("There is an error, write operations with lower cases");
        }
    }
}
