package PIP_4;

import java.util.Random;
import java.util.Scanner;

public class Zadanie06 {

    public static void main(String[] args) {
        float c,d1,d2,d3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź 2 liczby rzeczywiste i naciśnij ENTER po każdej z nich:");
        float a = scan.nextFloat();
        float b = scan.nextFloat();;

        if (a > b) {
            c = a;
            a = b;
            b = c;
        }

        Random random = new Random();
        float d = random.nextFloat(b-a+1)+a;
        float e = random.nextFloat(b-a+1)+a;
        float f = random.nextFloat(b-a+1)+a;
        System.out.println("Wybrany przedział: [" + a + ", " + b + "]");
        System.out.println("Wartości generowane losowo:" + "\n" + d + "\n" + e + "\n" + f);


            if (d > e && e > f)
            {
                d3=d;
                d2=e;
                d1=f;
            } else if (f > e && e > d) {
                d1=d;
                d2=e;
                d3=f;
            } else if (e > f && f > d) {
                d1=d;
                d3=e;
                d2=f;
            } else if (d > f && f > e) {
                d3=d;
                d1=e;
                d2=f;
            } else if (e > d && d > f) {
                d2=d;
                d3=e;
                d1=f;
            } else {
                d2=d;
                d1=e;
                d3=f;
            }
                System.out.println("Gdzie:" + d1 + "<" + d2 + "<" + d3);



    }


}
