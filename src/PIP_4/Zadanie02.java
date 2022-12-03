package PIP_4;

import java.util.Random;
import java.util.Scanner;

public class Zadanie02 {
    public static void main(String[] args) {

        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz liczbę 'a' z zakresu od 1 do 6 i naciśnij ENTER:");
        a = scan.nextInt();
        Random rand = new Random();
        int b = rand.nextInt (6);
        boolean czyLiczbySaRowne;

        if (czyLiczbySaRowne = a==b) {
            System.out.println("YOU DIED!!!\n(a=" + a + ", b=" + b + ")");
        }else if (a > 0 && a < 7) {
        System.out.println("LUCKY YOU!!!\n(a=" + a + ", b=" + b + ")");
        }else {
            System.out.println("Wartość 'a' poza zakresem!");
        }

    }
}