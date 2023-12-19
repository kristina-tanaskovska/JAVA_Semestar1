import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.max;

public class AreaTriangle {
    public static void main(String[]args){
        /*int[] newArray;
        newArray = new int[10];
        newArray[0] = 2;
        newArray[1]=3;
        System.out.println(newArray[0]+" "+ newArray[1]);

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int i : numbers) {
            System.out.println(" Current number is: " + i);
        }*/
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Insert 3 sides of a triangle");
        double side1= numScanner.nextInt();
        double side2= numScanner.nextInt();
        double side3= numScanner.nextInt();
        double s = (side1+side2+side3)/2;
        double max = Math.max(side1,max(side2, side3));
        double sum2sides = (side1+side2+side3)-max;
        if (sum2sides>max){
            double area = sqrt(s*(s-side1) * (s - side2) * (s - side3));
            System.out.println("The area of the triangle is: "+area);
        }
        else {
            System.out.println("This  isn't a triangle");
        }

    }

}
