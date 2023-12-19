import java.util.Scanner;
public class hw3 {
    public static void main(String[] args){
    Scanner myObject= new Scanner(System.in);
        System.out.println("Write your name, lastname and enrollment number!");

    String name= myObject.nextLine();
    String surname= myObject.nextLine();
    int num= myObject.nextInt();
    /* If we want to check if input
        System.out.println("Name: "+name);
        System.out.println("Surname: "+surname);
        System.out.println("Enrollment number: "+num); */
    }
}
