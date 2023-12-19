import java.util.*;
public class hw4 {
    public static void main(String[] arg){
      //importing scanner and takinguser input
      Scanner sc=new Scanner(System.in);
      String name=sc.nextLine();
      String lastname=sc.nextLine();
      //user output to uppercase
        System.out.println("First name: "+name.toUpperCase());
        System.out.println("Last name: "+lastname.toUpperCase());
      //putting the string input into a character array
        char[] ch_name= name.toUpperCase().toCharArray();
        char[] ch_lastname = lastname.toUpperCase().toCharArray();
      //outputing the array in a pattern and uppercase
        for(int i=0; i<name.length(); i++){
          for(int j=0; j<i; j++) {
              System.out.print(" ");
          }
          System.out.println(ch_name[i]);
      }
      for(int i=0; i<name.length(); i++){
          for(int j=0; j<i; j++) {
                System.out.print(" ");
          }
          System.out.println(ch_lastname[i]);
        }
    }
}
