package PIP_3;//PIP_02_Zadanie5

import java.util.Scanner;

public class Zadanie05 {
    public static void main(String[] args) {

        int a,suma; //test komentarza github 2
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz 3 cyfrowa liczbe 'a' i nacisnij ENTER:");
        a = scan.nextInt();
        int cyfra1=a/100%10;
        int cyfra2=a/10%10;
        int cyfra3=a%10;
        suma = cyfra1 + cyfra2 +cyfra3;
        System.out.println("Suma cyfr liczby " + a + " wynosi: " + cyfra1 + " + " + cyfra2 + " + " + cyfra3  + " = " + suma);

        }


    }

