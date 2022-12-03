package PIP_4;

import java.util.Scanner;

public class Zadanie04 {

    public static void main(String[] args) {

        int suma, roznica, iloczyn, iloraz;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz liczbę 'a':");
        String a = scan.nextLine();
        int a1 = Integer.parseInt(a);
        System.out.println("Wprowadz liczbę 'b':");
        String b = scan.nextLine();
        int b1 = Integer.parseInt(b);
        System.out.println("\nDOSTEPNE OPERACJE:\nADD - dodawanie\nSUB - odejmowanie\nDIV - dzielenie\nMUL - mnożenie\n\nWprowadź kod operacji do wykonania: ");
        String typOperacji = scan.nextLine();

        switch(typOperacji)
        {
            case 'ADD':    // dodawanie
            {
                int suma = dodawanie(a1,b1);
                System.out.println(suma);
                break;
            }
            case '-':    // odejmowanie dwóch zmiennych
            {
                System.out.println(pierwsza_l - druga_l);
                break;
            }
            case '*':    // mnożenie dwóch zmiennych
            {
                System.out.println(pierwsza_l * druga_l);
                break;
            }
            case '/':   // sprawdzenie, czy druga zmienna nie jest zerem oraz
            {           // dzielenie dwóch zmiennych
                if(druga_l !=0)
                {
                    System.out.println(pierwsza_l / druga_l + "oraz reszty: " +
                            pierwsza_l % druga_l);
                }
                else
                {
                    System.out.println("Nie dzielimy przez zero!!!");
                }
                break;
            }

    }

    int dodawanie(a1, b1) {
        return a1 + b1;
    }

    int odejmowanie(a1, b1) {
        return a1 - b1;
    }

    int mnożenie(a1, b1) {
        return a1 * b1;
    }

    int dzielenie(a1, b1) {
        return a1 / b1;
    }
}