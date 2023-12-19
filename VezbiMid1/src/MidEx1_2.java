import java.util.Scanner;

public class MidEx1_2 {
    public static void main(String[] args){
        System.out.println("Insert a sentence");
        Scanner sc = new Scanner(System.in);
        String a= sc.nextLine();
        int leng= a.length();
        String[] newA = new String[leng];
        newA = new String[]{a.replace(" ", "-")};
        for(int i=0; i< newA.length; i++) {
            System.out.println(newA[i]);
        }
    }
}
