package PIP_4;

import java.util.Scanner;

public class Zadanie08 {

    public static void main(String[] args) {

        float ypyKurs = (float) 30.27;
        float plnValue,ypyValue;

        Scanner scan = new Scanner(System.in);
        System.out.println("Witamy w kantorze!\n" + "Wybierz walutę:\n" + "1 - PLN\n" + "2 - JPY");
        float waluta = scan.nextInt();
        System.out.println("Wprowadź kwotę:");
        float kwota = scan.nextFloat();

        if (waluta == 1)
        {
            ypyValue = kwota * ypyKurs;
            System.out.println(kwota + " zł" + " => " + ypyValue + " ¥");

        } else if (waluta == 2) {
            plnValue = kwota / ypyKurs;
            System.out.println(kwota + " ¥" + " => " + plnValue + " zł");
        }else {
            System.out.println("Niepoprawny kod waluty!");
        }


    }
}
