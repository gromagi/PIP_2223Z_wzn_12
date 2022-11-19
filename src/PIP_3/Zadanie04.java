package PIP_3;//PIP_02_Zadanie4

import java.util.Scanner;

public class Zadanie04 {
    public static void main(String[] args) {

        int x,y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz liczbe 'x' i nacisnij ENTER:");
        x = scan.nextInt();
        System.out.println("Wprowadz liczbe 'y' i nacisnij ENTER:");
        y = scan.nextInt();
        System.out.println("Pierwotna wartosc liczby 'x' wynosi: " + x + ", wartosc liczby 'y' wynosi: " + y);
        x = x - y;
        y = y + x;
        x = y - x;
        System.out.println("Ostateczna wartosc liczby 'x' wynosi: " + x + ", wartosc liczby 'y' wynosi: " + y);



    }
}
