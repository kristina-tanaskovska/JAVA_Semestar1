import java.util.*;

import static java.util.Collections.replaceAll;

public class MidEx1_3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Give me a text");
        String text = sc.nextLine();
        System.out.println(text.replaceAll(" ", "-").toUpperCase());
        //String[] textArray = new String[text.length()];
        //String[] textArray = text.toUpperCase();
        //textArray = text.replaceAll(" ", "-");


    }
}
