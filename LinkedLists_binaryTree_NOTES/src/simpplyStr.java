import java.util.Scanner;

public class simpplyStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = new String(sc.next());
        char[] stringChar = string.toCharArray();
        char[] output=new char[stringChar.length];
        output=simpStr(string,stringChar);
        //simpStr(string);
        for (char c : output) {
            System.out.print(c);
        }

    }
    public static char[] simpStr(String string,char[] stringChar) {
        char[] newString = new char[stringChar.length];
        int j = 0;
        for (int i = 0; i < string.length(); i++) {
            while (i < stringChar.length - 1 && stringChar[i] == stringChar[i + 1]) {
                i++;
            }
            newString[j] = stringChar[i];
            j++;
        }

        return newString;
    }
}