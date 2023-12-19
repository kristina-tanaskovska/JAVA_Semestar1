import java.util.Scanner;

public class FinalMid1_2 {
    public static void  main(String[] args){
        System.out.println("Vnesi string");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] arrayA= a.split(" ");
        int wordCount= arrayA.length;
        System.out.println("The number of words is "+ wordCount);


        for(int i=0; i<arrayA.length; i++){
            System.out.print(arrayA[i].charAt(0));
        }
        System.out.println();
        for(int i=0; i<arrayA.length; i++){
            System.out.println("Word number "+(i+1) +" is "+ arrayA[i]);
        }
    }
}
