package PIP_5;

import java.util.Scanner;

public class Zadanie03 {


    public static void main(String[] args) {

        System.out.println("Wprowadz wartość 'n':");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n % 2 == 0) { // czy liczba jest parzysta?
            int wynik = n - 1;
            System.out.println("Wynik to: "+ wynik);

            }  if (n - 1 == 5) {
                System.out.println("  *");
                System.out.println(" ***");
                System.out.println("*****");
            }
        else
        {
            System.out.println("Podana liczba jest nieparzysta!");
        }
    }

}