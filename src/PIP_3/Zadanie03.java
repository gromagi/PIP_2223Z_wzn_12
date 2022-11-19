package PIP_3;//PIP_02_Zadanie2

import java.util.Random;
import java.util.Scanner;

public class Zadanie02 {
    public static void main(String[] args) {

        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz liczbe 'a' z zakresu od 1 do 6 i nacisnij ENTER:");
        a = scan.nextInt();
        Random rand = new Random();
        int b = rand.nextInt (6);
        boolean czyLiczbySaRowne;
        czyLiczbySaRowne = a==b;
        System.out.println("Wartosc liczby 'a' wynosi: " + a + ", wartosc liczby 'b' wynosi: " + b + "");
        System.out.println("Czy liczby 'a' i 'b' sa rowne? --> " + czyLiczbySaRowne);


    }
}
