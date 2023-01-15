package PIP_6;

import java.util.Random;

import static java.util.Collections.reverse;
import static java.util.Collections.sort;

public class Zadanie_1_2_3_4 {

    public static void main(String[] args) {

        int[] genArr = genArr(100);
        printArray(genArr);
        int[] sortedArr = sort(genArr);
        printArray(sortedArr);
        int[] revArr = reverse(sortedArr);
        printArray(revArr);


        System.out.println(equalsReverse(sortedArr,revArr));// should display true


    }

    private static boolean equalsReverse(int[] sortedArr, int[] revArr) {
    }

}


    public static int[] genArr(int[] n)
    {
        int[] genArr = new int[n];
        int min = 0;
        int max = 100;
        Random random = new Random();
        int n = random.nextInt(max - min + 1) + min;
        return genArr;
    }


    public static void printArray(int[] tabl)
    {
        System.out.println(int);
    }




}
