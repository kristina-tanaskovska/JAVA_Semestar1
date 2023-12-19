//INDEX 89231012
import java.util.*;
import java.lang.*;
public class hwBig {
    public static void main(String[] args){
        //callin a scanner for user input
        Scanner sc= new Scanner(System.in);
        System.out.print("How many numbers do you want to enter ");
        int numElements= sc.nextInt();
        //Getting elements from user and defining the array
        System.out.println("The elements are ");
        int[] arrayNumbers = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            arrayNumbers[i]= sc.nextInt();
        }

        //Calling number of duplicates method
        int NumOfDifferent=DifferentEl(arrayNumbers,numElements);
        //Calling even numbers method
        int EvenCount= EvenNumbers(arrayNumbers,numElements);
        //Calling Odd numbers method
        int OddCount= OddNumbers(arrayNumbers,numElements);
        //Calling the frequency method
        int[] frequencyArray = FrequencyOfRepeats(arrayNumbers,numElements);
        //Calling the max occurence calculator method
        int MaxOccuance = MaxOccurances(arrayNumbers);
        //Calling largest number method
        int largestNumber=LargestNumber(arrayNumbers,numElements);
        //Calling method to calculate second smallest number
        int SecondSmallest= SecondSmallestNum( arrayNumbers, numElements);
        //Calling avarage of num(mean) and Standard deviation metthod
        double[] StandardDevision= StandardDevision(arrayNumbers,numElements);
        double Standarddevision = StandardDevision[1];
        double mean = StandardDevision[0];
        //Calling the median method
        double medean=medean(arrayNumbers);
        //Calling sum of numbers method
        int sumOfNum=SumOfAllNum(arrayNumbers,numElements);
        //Calling the palindrome counter method
        int[] PalindromMethod= PalindromicNumbers(arrayNumbers, numElements);
        int counterPalindrome = PalindromMethod[numElements+1];
        //Calling the second palindrom exercise method
        int palindromSecondMethod= PalindromSecondMethod(arrayNumbers, numElements);




        //Outputing results
        System.out.println("The number of elements is "+ numElements);
        System.out.println("The number of different elements is "+NumOfDifferent);
        System.out.println("The number of even numbers is "+EvenCount);
        System.out.println("The number of odd numbers is "+OddCount);
        for (int i = 0; i < numElements; i++) {
            System.out.println("Frequency of repetition for " + arrayNumbers[i] + " : "
            + (float) (((float) frequencyArray[numElements+i] / (float) numElements) * (float) 100) + "%. ");
        }
        System.out.println("The number with the maximum occurence is "+ MaxOccuance);
        System.out.println("The largest number is "+largestNumber);
        System.out.println("The second smallest number is "+SecondSmallest);
        System.out.println("The average of all numbers is "+mean);
        System.out.println("The Standard Division is "+Standarddevision+"%");
        System.out.println("The medean is "+medean);
        System.out.println("The sum of all numbers is "+sumOfNum);
        System.out.println("The number of palindromes is "+counterPalindrome);
        System.out.println("The largest palindrom, second smallest from list is "+palindromSecondMethod);

        //Output for the reverse order of the results
        double[] resultsMain1= {arrayNumbers.length ,NumOfDifferent, EvenCount, OddCount,};
        double[] resultsMain2 = {MaxOccuance, largestNumber, SecondSmallest, mean, Standarddevision,medean,sumOfNum,counterPalindrome, palindromSecondMethod};
        System.out.println("The reversed order od the results is: ");
        for (int i = resultsMain2.length-1; i >=0 ; i--) {
            System.out.print(resultsMain2[i]+ " , ");
        }
        for (int i = numElements-1; i >= 0; i--) {
            System.out.print((((float) frequencyArray[numElements+i] / (float) numElements) * (float) 100) + "%." + " , ");
        }
        for (int i = resultsMain1.length-1; i >=0 ; i--) {
            System.out.print(resultsMain1[i]+ " , ");
        }
    }
    public static int OddNumbers (int[] arrayNumbers, int numElements){
        int counter=0;
        for (int i = 0; i <numElements ; i++) {
            //check if deviding by 2 the remainder is zero, if not its odd
            if(arrayNumbers[i]%2 != 0){
                counter++;
            }
        }
        return counter;
    }
    public static int EvenNumbers (int[] arrayNumbers, int numElements){
        int counter=0;
        for (int i = 0; i <numElements ; i++) {
            //checking if deviding by 2 gives the remainder is 0 if yes its even
            if(arrayNumbers[i]%2 == 0){
                counter++;
            }
        }
        return counter;
    }
    public static int[] FrequencyOfRepeats(int[] arrayNumbers, int numElements) {
        //this function can only work with positive integer lists
        //+if we want to work with negatives we make the values null after working with them
        //+this wasn't done here because i didnt want to loose the original values.
        int[] frequencyArray = new int[numElements*2];
        int frequency;
        for (int i = 0; i < numElements; i++) {
            //in order to not re count repeating numbers i make them negative
            if (arrayNumbers[i] > 0) {
                //frequency is 1 because every element appears at least once
                frequency = 1;

                for (int j = i + 1; j < numElements; j++) {
                    if (arrayNumbers[i] == arrayNumbers[j]) {
                        frequency++;
                        arrayNumbers[j] = arrayNumbers[j] * -1;
                    }

                }
                //to store the values i bring them back to the positive
               frequencyArray[i] = arrayNumbers[i]*(-1);
                //the frequency is stored in a bigger array and can be found based on the i parameter
               frequencyArray[numElements+i] = frequency;
            }
        }
        return frequencyArray;
    }

    public static int MaxOccurances(int[] arrayNumbers){
        int max = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            int count = 0;
            //if two elements are the same it counts them
            for (int j = 0; j < arrayNumbers.length; j++) {
                if (arrayNumbers[i]==arrayNumbers[j])
                    count++;
            }
            //if the count for certain elemennt is bigger then the previous max then thats the new max
            if (count >= max)
                max = count;
        }
        return max;

    }
    public static int LargestNumber (int[] arrayNumbers, int numElements){
        //assume the largest num is the first element
        int largestNum= arrayNumbers[0];
        //compare each element and if bigger call it the largest number
        for (int n = 0; n <numElements ; n++) {
            if(arrayNumbers[n]>largestNum){
                largestNum=arrayNumbers[n];
            }

        }
        return largestNum;
    }
    public static int SumOfAllNum(int[] arrayNumbers, int numElements){
        int sum=0;
        //goes through array and sums all elements
        for (int i = 0; i < numElements; i++) {
            sum += arrayNumbers[i];
        }

        return sum;
    }
    public static int DifferentEl(int[] arrayNumbers, int numElements){
        //sorting the array with method
        Arrays.sort(arrayNumbers);
        int NumOfDifferentEl=0;
        for (int i = 0; i < numElements; i++) {
            //checking if two consequtive elements are the same
            while (i < numElements - 1 && arrayNumbers[i] == arrayNumbers[i + 1]) {
                i++;
            }
            //if they're not the same we count them as different
            NumOfDifferentEl++;
        }
        return NumOfDifferentEl;
    }
    public static double[] StandardDevision(int[] arrayNumbers, int numElements){
        //calculating standard devision in multiple steps
        //Step 1 find mean
        float mean = SumOfAllNum(arrayNumbers,numElements)/numElements;
        float[] Step2Array = new float[numElements];
        float sum= 0;
        for (int i = 0; i <numElements ; i++) {
            //Step 2 the distance of each point to the mean squered
            Step2Array[i]=(Math.abs(arrayNumbers[i]-mean))*(Math.abs(arrayNumbers[i]-mean));
            //Step 3: the sum of Step 2
            sum += Step2Array[i];
        }
        //Step 4 squere root of the sum devided by the number of elements
        double StandardDev =  Math.sqrt(sum/numElements);
        //defining an array in order to pull the result for Avarage exercise here defined as mean
        double[] resultsMeanStandard = new double[2];
        resultsMeanStandard[0]=mean;
        resultsMeanStandard[1]=StandardDev;
        return resultsMeanStandard;
    }
    public static int SecondSmallestNum(int[] arrayNumbers, int numElements){
        //choosing elements of the array as smallest and second smallest
        int smallestNum = arrayNumbers[0];
        int secondSmallest= arrayNumbers[1];
        //if theyre reversed i interchange the values
        if(secondSmallest<smallestNum){
            smallestNum=arrayNumbers[1];
            secondSmallest=arrayNumbers[0];
        }
        //going throuhg all elements of the array
        for (int i = 0; i <numElements ; i++) {
            //shifting the values if a smaller number is found
            if(smallestNum>arrayNumbers[i]){
                secondSmallest=smallestNum;
                smallestNum=arrayNumbers[i];
            }
        }
        return secondSmallest;
    }
    public static int[] PalindromicNumbers(int[] arrayNumber, int numElements){
            int counter = 0;
            int[] newArray = new int[numElements+2];
            for (int i = 0; i < numElements; i++) {
                int original = arrayNumber[i];
                int reverse = 0;
                int digit;
                //single digit numbers are all palindromes
                if (original < 10) {
                    counter++;
                    //taking the value of the palindrome for later use
                    for (int j = numElements; j >=0 ; j--) {
                        newArray[j]= original;
                    }

                } else {
                    // Reversing the number
                    int temp = original; // storing the original value for comparison
                    while (original != 0) {
                        digit = original % 10;
                        original = original / 10;
                        reverse = reverse * 10 + digit;
                    }

                    // comparison
                    if (temp == reverse) {
                        counter++;
                        //storing palindrome for later use
                        newArray[i]=reverse;
                    }
                }
            }
            //outputing array in order to get a list of all palindromes and the counter
            newArray[numElements+1]=counter;
        return newArray;
    }
    public static double medean(int[] arrayNumber){
        //medean formula is done on sorted lists/arrays
        Arrays.sort(arrayNumber);
        double median;
        //medean formula varies based on od or even length of list
        if (arrayNumber.length % 2 == 0) {
            median = ((double) arrayNumber[arrayNumber.length / 2] + (double) arrayNumber[arrayNumber.length / 2 - 1]) / 2;
        }
        else {
            median = (double) arrayNumber[arrayNumber.length / 2];
        }
        return median;
    }
    public static int PalindromSecondMethod (int[] arrayNumbers, int numElements){
        int[] PalindromMethod= PalindromicNumbers(arrayNumbers, numElements);
        int[] newArray= new int[numElements];
        int result;
        //getting the palindrome numbers from previous function
        for (int i = 0; i < numElements; i++) {
            newArray[i]=PalindromMethod[i];
        }
        //sorting to find biggest
        Arrays.sort(newArray);
        //if its the biggest palindrome and the biggest in the list then we have
        //+to take the second biggest palindrome for the condition to hold
        if (newArray[numElements-1] == LargestNumber(arrayNumbers, numElements)){
            result=newArray[numElements-2];
        }
        else {
            result=newArray[numElements-1];
        }
        return result;
    }

}
