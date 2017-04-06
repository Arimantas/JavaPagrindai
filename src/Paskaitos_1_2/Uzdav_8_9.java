package Paskaitos_1_2;

import java.util.Scanner;

/**
 * Created by Arimantas on 2017.04.06.
 */
public class Uzdav_8_9 {

    public static void main(String[] args) {

        System.out.println("Vidutines kuro sanaudos 100km yra: " + nuskaitymas() + " litrai(-u).");

    }

    private static double nuskaitymas() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Iveskite nuvaziuota atsuma (km): ");
        double atsumas = scan.nextDouble();
        System.out.println("Iveskite sunaudoto kuro kieki (litrais): ");
        double sanaudos = scan.nextDouble();
        return vidurkis(atsumas, sanaudos);


    }

    private static double vidurkis(double atstumas, double sanaudos) {
        return sanaudos * 100 / atstumas;
    }

}
