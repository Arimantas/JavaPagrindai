package Paskaita_3_uzduotys;

import java.util.Scanner;

/**
 * Created by Arimantas on 2017.04.06.
 */
public class Uzdav_3_2_dowhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String zodis = "";

        do {
            System.out.println("Iveskite zodi. Noredami baigti iveskite zodi: pabaiga");
            zodis = sc.nextLine();
            System.out.println("Ivestas zodis: " + zodis);
        } while (!zodis.equals("pabaiga"));
    }

}
