import java.util.Scanner;

public class simplifyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = 0;
        String string = sc.next();
        char[] stringChar = string.toCharArray();
        char[] newString = new char[stringChar.length];

        for (int i = 0; i < string.length(); i++) {
            // Check if i is the last index
            if (i == stringChar.length - 1 || stringChar[i] != stringChar[i + 1]) {
                newString[j] = stringChar[i];
                j++;
            }
        }

        for (int i = 0; i < newString.length; i++) {
            System.out.print(newString[i]);
        }
    }
}
