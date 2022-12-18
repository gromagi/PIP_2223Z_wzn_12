package PIP_5;

import java.util.Scanner;

public class Zadanie02 {


    public static void main(String[] args) {
        System.out.println("Wprowadz wartość 'n':");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n+"-ny wyraz ciągu Fibonacciego wynosi: "+ciagFibonacciego(n));
        return;
    }

    public static int ciagFibonacciego(int n){
        if ((n==1)||(n==2))
            return 1;
        else
            return ciagFibonacciego(n-1)+ciagFibonacciego(n-2);
    }
}