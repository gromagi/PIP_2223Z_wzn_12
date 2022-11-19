package PIP_3;//PIP_02_Zadanie3

import java.util.Scanner;

public class Zadanie03 {
    public static void main(String[] args) {

        int x,y,z;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz liczbe 'x' i nacisnij ENTER:");
        x = scan.nextInt();
        System.out.println("Wprowadz liczbe 'y' i nacisnij ENTER:");
        y = scan.nextInt();
        System.out.println("Pierwotna wartosc liczby 'x' wynosi: " + x + ", wartosc liczby 'y' wynosi: " + y);
        z = x;
        x = y;
        y = z;
        System.out.println("Ostateczna wartosc liczby 'x' wynosi: " + x + ", wartosc liczby 'y' wynosi: " + y);



    }
}
