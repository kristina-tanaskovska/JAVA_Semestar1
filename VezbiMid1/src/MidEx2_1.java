import java.util.*;
public class MidEx2_1 {
    public static void main(String[] args){
        System.out.println("Give me text");
        Scanner sc = new Scanner(System.in);
        String text= sc.nextLine();

        String[] textArray =text.split(" ");
        int counter= textArray.length;
        System.out.println("The num of words is "+counter);
    }
}
