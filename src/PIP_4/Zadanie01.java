package PIP_4;

import java.util.Random;

public class Zadanie01 {

    public static void main(String[] args) {

        boolean swieciSlonce, padaDeszcz;

        Random rand = new Random();
        swieciSlonce = rand.nextBoolean();
        padaDeszcz = rand.nextBoolean();
        if (swieciSlonce == false && padaDeszcz == true) {
            System.out.println("Jesli nie świeci słońce (słońce = " + swieciSlonce + ") a pada deszcz (deszcz = " + padaDeszcz +  ") to jest PLUCHA.");
        } else if (swieciSlonce == true && padaDeszcz == true) {
            System.out.println("Jesli świeci słońce = (słońce = " + swieciSlonce + ") i pada deszcz (deszcz = " + padaDeszcz +  ") to pojawi się TĘCZA.");
        } else if (swieciSlonce == true && padaDeszcz == false) {
            System.out.println("Jesli świeci słońce = (słonce = " + swieciSlonce + ") i nie pada deszcz (" + padaDeszcz +  ") to jest SŁONECZNIE.");
        } else if (swieciSlonce == false && padaDeszcz == true){
            System.out.println("Jesli nie świeci słońce = (słonce = " + swieciSlonce + ") a pada deszcz (deszcz = " + padaDeszcz + ") to jest POCHMURNO.");
        } else {
            System.out.println("Jesli nie świeci słońce = (słonce = " + swieciSlonce + ") i nie pada deszcz (deszcz = " + padaDeszcz + ") to SPÓJRZ W NIEBO. :)");
        }


    }
}
