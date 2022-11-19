//PIP_02_ZAD5

import java.util.Scanner;

public class Zadanie05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz wartosc dla 'a' nacisnij ENTER:");
        Double a = scan.nextDouble();
        System.out.println("Wprowadz wartosc dla 'b' nacisnij ENTER:");
        Double b = scan.nextDouble();
        Double suma = a+b;
        Double roznica = a-b;
        Double sumaOdwrotnosci = (1/a+1/b);
        System.out.println("Suma: "+ suma);
        System.out.println("Różnica: "+ roznica);
        System.out.println("Suma odwrotności:" + sumaOdwrotnosci);




    }
}
