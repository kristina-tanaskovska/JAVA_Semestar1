import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class generalButton_METHODS {
    static int n = Window.n;
    public static int[] value = new int[n * n + 1];
    public static String fileIn;


    public static int[] valueOfButton(int i) {
        int sum = Window.sum;
        int nmoves = Window.numberOfMoves;
        int currSum = 0;
        float move;

        move = sum / nmoves;
        int min = -8;
        int max = 8;
        if(i==1){

            int n = main.n;
            if (i < n * n) {
                while (i < (n * n)) {
                    value[i] = ThreadLocalRandom.current().nextInt(1, 9 + 1);
                    i++;
                }
            }

        }
        else{
            value = (int[])Menu.games.get(Menu.chosenList);
        }


        return value;


    }

    static String delimiterSniffer1 = "}}}";//conceptual block delimiter; n, movecount_intitial, movecount_left, *values*
    static int counter1 = 0;
    static String delimiterSniffer2 = "|||";
    static int counter2 = 0;
    static String delimiterSniffer3 = "]]]";
    static int counter3 = 0;
    String delimiterSniffer4 = ")))";
    static int counter4 = 0;
    static String del = "***";
    static char[] delimiterListen;

    static int i = 0;
    static int j = 0;
    static int step = 4;


    // public static int[][] fileValue(String str){//called with str=main.firstLineConfirm}
    static int[] nAdd = new int[2];
    static int[] movesAdd = new int[2];
    static int valuesAdd = 0;

    public static void fileValueLoadGame(String str, int i, int j){
        while (i<step){
            str.getChars(j,j+2, delimiterListen, 0);
            if(delimiterListen==delimiterSniffer1.toCharArray()){
                counter1++;
                switch(counter1){
                    case 1:
                        nAdd[0]=j+3;
                        j+=3;//n
                        break;
                    case 2:
                        nAdd[1]=j;
                        movesAdd[0]=j+3;
                        //main.allotedMoves
                        break;
                    case 3:
                        movesAdd[1]=j;
                        valuesAdd = j+3;
                        //list
                        break;
                }
            } else{j++;}
        }}
    public static void checkWin(){
        if(main.sumCurrent == main.sum){
            Window.youWin();
        } else if (main.sumCurrent > main.sum) {
            Window.youLose();
        } else if (main.allottedMoves<=0) {
            Window.youLose();
        }
    }
    public static String readFileToString(String filePath) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        }

        return stringBuilder.toString();
    }






}






