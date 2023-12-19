import java.util.*;
import java.lang.*;
public class FinalMid1_4 {
    /*dali se devisible by 5
    replace string and replace a so - b so *
    array vnesi dve nii
    najdi suma od nizite , najdi najmal element*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of string A i b");
        int lengA= sc.nextInt();
        int lengB= sc.nextInt();
        int[] arrayA = new int[lengA];
        int[] arrayB = new int[lengB];

        for(int i=0; i<lengA; i++){
            arrayA[i] = sc.nextInt();
        }
        for(int i=0; i<lengB; i++){
            arrayB[i] = sc.nextInt();
        }
        int langMax=Math.max(lengA,lengB);
        int[] arraySum = new int[langMax];

        for(int i=0; i<langMax;i++){
            if(i>lengB){
                arraySum[i] = arrayA[i];
            }
            else if (i>lengA) {
                arraySum[i]= arrayB[i];
                }
            else{
                arraySum[i]= arrayB[i]+arrayA[i];

                }

            }





        /*String[] arrayA= new String[]{a.replaceAll("a", "*").replaceAll("b","-")};
        for(int i=0; i< arrayA.length; i++){
            System.out.println(arrayA[i]);
        }
       /*for(int i =0; i<arrayA.length; i++){
           if(arrayA[i] == "b"){
               arrayA[i]= '-';
           }
       }
        String[] arrayA= new String[]{a.replaceAll("b", "-")};*/
    }

}
