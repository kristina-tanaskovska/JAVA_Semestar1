import java.util.*;
public class MidEx1 {
public static void main(String[] args){
    System.out.println("Please enter two integer numbers");
    Scanner sc= new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    if (a>b){
        System.out.println("THe bigger number is "+a);
    }
    else {
        System.out.println("The bigger number is "+b);
    }


}
}
