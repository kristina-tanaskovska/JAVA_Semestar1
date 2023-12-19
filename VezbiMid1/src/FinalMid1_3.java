import java.util.*;
public class FinalMid1_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vnesi dolzina na array");
        int leng = sc.nextInt();
        int[] arrayName = new int[leng];
        //Vnesuvanje values na arrayot od userot
        for(int i=0; i<leng; i++){
            arrayName[i] = sc.nextInt();
        }
        //calculating the sum of each element halved
        float sum = 0;
        int secondLeng = leng/2;
        for(int i=leng-1; i>=secondLeng; i--){
            sum=sum+arrayName[i];
        }
        System.out.println("The sum is "+ sum);
        //Presmetuvanje razlika od prv i posleden clen
        int difference=arrayName[0]-arrayName[leng-1];
        System.out.println("The difference is "+difference);
        System.out.println("Numbers devisible by the difference are");
        for(int i=0; i<leng; i++){
            if(arrayName[i]%difference == 0) {
                System.out.println(arrayName[i]);
            }
        }

        int biggestNum=arrayName[0];
        int secondNum =arrayName[1];
        if(biggestNum<secondNum){
            biggestNum=arrayName[1];
            secondNum=arrayName[0];
        }
        for(int i=0; i<leng; i++ ){
            if(arrayName[i]>biggestNum){
                secondNum=biggestNum;
                biggestNum=arrayName[i];

            }
        }
        System.out.println("The second biggest number is "+secondNum);
    }
}
