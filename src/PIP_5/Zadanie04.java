package PIP_5;

import java.util.Scanner;

public class Zadanie04 {


    public static void main(String[] args) {

        System.out.println("Wprowadz wartości dla x, y, z:");
        Scanner scan = new Scanner(System.in);
        int liczbaGwiazdekX = scan.nextInt();
        int liczbaGwiazdekY = scan.nextInt();
        int liczbaGwiazdekZ = scan.nextInt();

        while (liczbaGwiazdekX > 0 | liczbaGwiazdekY > 0 | liczbaGwiazdekZ > 0 ) {
            System.out.print("*");
            liczbaGwiazdekX--;
            System.out.print("*");
            liczbaGwiazdekY--;
            System.out.print("*");
            liczbaGwiazdekZ--;
        }

    }
}


