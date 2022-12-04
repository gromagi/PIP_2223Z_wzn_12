package PIP_4;

import java.util.Scanner;

public class Zadanie05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz liczbę 'a':");
        String a = scan.nextLine();
        int a1 = Integer.parseInt(a);
        System.out.println("Wprowadz liczbę 'b':");
        String b = scan.nextLine();
        int b1 = Integer.parseInt(b);
        System.out.println("\n### INFO: DOSTEPNE OPERACJE: ADD (+), SUB (-), DIV (/), MUL (*) ### \nWprowadź kod operacji do wykonania: ");
        String typOperacji = scan.nextLine().toUpperCase();

        switch (typOperacji) {
            case "ADD" ->    // dodawanie
            {
                int suma = dodawanie(a1, b1);
                System.out.println("------------------------------------->");
                System.out.println("ADD: "+ absoluteValue(a1) + "+" + absoluteValue(b1) + "=" + suma);
                break;
            }
            case "SUB" ->    // odejmowanie
            {
                int roznica = odejmowanie(a1, b1);
                System.out.println("------------------------------------->");
                System.out.println("SUB: "+ absoluteValue(a1) + "-" + absoluteValue(b1) + "=" + roznica);
                break;
            }
            case "DIV" ->    // dzielenie
            {
                int iloraz = dzielenie(a1, b1);
                System.out.println("------------------------------------->");
                System.out.println("DIV: "+ absoluteValue(a1) + "/" + absoluteValue(b1) + "=" + iloraz);
                break;
            }
            case "MUL" ->    // mnożenie
            {
                int iloczyn = mnozenie(a1, b1);
                System.out.println("------------------------------------->");
                System.out.println("MUL: "+ absoluteValue(a1) + "*" + absoluteValue(b1) + "=" + iloczyn);
                break;
            }
            default ->
            {
                System.out.println("Operacja " + typOperacji + " nie istnieje!");
            }
        }


    }



    private static int absoluteValue(int a) {
        return Math.abs(a);
    }

    private static int dzielenie(int a1, int b1) {
        return absoluteValue(a1) / absoluteValue(b1);
    }

    private static int mnozenie(int a1, int b1) {
        return absoluteValue(a1) * absoluteValue(b1);
    }

    private static int odejmowanie(int a1, int b1) {
        return absoluteValue(a1) - absoluteValue(b1);
    }

    private static int dodawanie(int a1, int b1) {
        return absoluteValue(a1) + absoluteValue(b1);
    }
}

