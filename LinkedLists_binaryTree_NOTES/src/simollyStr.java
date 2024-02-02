public class simollyStr {
    public static void main(String[] args) {
        String input = "aaabbbbcccddeee";
        char[] result = newStr(input);
        System.out.println(result);
    }

    public static char[] newStr(String input) {
        char[] fixed_word = new char[input.length()];
        int j = 0;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) != input.charAt(i + 1)) {
                fixed_word[j] = input.charAt(i);
                j++;
            }
        }

        return fixed_word;
    }
}
