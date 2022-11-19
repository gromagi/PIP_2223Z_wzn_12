//PIP_02_Zadanie3

import java.util.Scanner;

public class Zadanie03 {
    public static void main(String[] args) {

        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz swoje imię i naciśnij ENTER:");
        String imie = scan.nextLine();
        System.out.println("Podaj swoje nazwisko i naciśnij ENTER:");
        String nazwisko = scan.nextLine();
        System.out.println("Wprowadź swój numer studenta (bez „s”) i naciśnij ENTER");
        num = scan.nextInt();
        System.out.println("Hello, "+ imie + " " + nazwisko + " s" + num + "!");





    }
}
