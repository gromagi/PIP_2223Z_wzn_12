package PIP_4;

import java.util.Scanner;

public class Zadanie03 {
    public static void main(String[] args) {

        String login = "mgrochowska";
        String password = "qwerty";

        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz login i naciśnij ENTER:");
        String loginIn = scan.nextLine();
        System.out.println("Wprowadz hasło i naciśnij ENTER:");
        String passwordIn = scan.nextLine();

        if (loginIn.equals(login) && passwordIn.equals(password)) {
            System.out.println("\nPOMYŚLNIE ZALOGOWANO!");
        } else {
            System.out.println("\nBŁĘDNE DANE!");
        }
    return;



    }




}
