package PIP_5;

import java.util.Scanner;

public class Zadanie01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz liczbę 'n':");
        int n = scan.nextInt();

        if (n > 0) {
            int i = 0;
            while (i <= n) {
                System.out.println(i);
                i++;
            }
        }else {
            int i = n;
            while (i <= 0 ){
                System.out.println(i);
                i++;
            }
        }
    }
}

