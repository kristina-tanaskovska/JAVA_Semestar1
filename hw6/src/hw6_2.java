import java.util.*;

public class hw6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The following condition has to hold n >= k >= 0");
        System.out.print("Insert n: ");
        int n = sc.nextInt();
        System.out.print("Insert k: ");
        int k = sc.nextInt();
        int differenceNK = n - k;

        //binomialCoefficiant method called into this function
        long[] FacArray = binomialCoefficiant(n, k, differenceNK);


        //individual results taken out
        long diffFactorial = FacArray[0];
        long nFactorial = FacArray[1];
        long kFactorial = FacArray[2];

        // calculating the result
        double result = (double) nFactorial / (kFactorial * diffFactorial);

        //outputing result
        System.out.println("Binomial Coefficient: " + result);

        //to call the function
        pascal(n);

        //k+1 because we count from 0
        int[] coefficientArray= new int[k+1];
        //first term is always 1
        coefficientArray[0]=1;
        for(int i=1; i<=k; i++){
            //to get the last row and till the value of k term
            coefficientArray[i] = coefficientArray[i-1]*(n-i+1)/i;
        }
        //to print
        System.out.println("Coefficient array is: ");
        for(int i=0; i<=k; i++){
            System.out.print(coefficientArray[i]+" ");
        }

    }

    public static long[] binomialCoefficiant(int n, int k, int differenceNK) {
        // to handle big numbers
        long nFactorial = 1;
        long kFactorial = 1;
        long diffFactorial = 1;

        // in order to return multiple values
        long[] FacArray = new long[3];

        for (int i = 1; i <= differenceNK; i++) {
            diffFactorial *= i;
        }
        FacArray[0] = diffFactorial;

        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }
        FacArray[1] = nFactorial;

        for (int i = 1; i <= k; i++) {
            kFactorial *= i;
        }
        FacArray[2] = kFactorial;

        return FacArray;
    }
    //function to print the triangle
    static void pascal(int n) {

        for (int i = 0; i <= n; i++) {
            int number=1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number+ " ");
                number=number*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}

