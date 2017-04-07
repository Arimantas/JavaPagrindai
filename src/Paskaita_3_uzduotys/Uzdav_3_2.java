package Paskaita_3_uzduotys;

import java.util.Scanner;

/**
 * Created by Arimantas on 2017.04.06.
 */
public class Uzdav_3_2 {

    public static void main(String[] args) {

        // Parašyti programą kuri paprašytų vartotojo įvesti žodį ir jį iš karto atvaizduotų,
        // tada vėl paprašytų įvesti kitą žodį, jį atvaizduotų, ir procesą kartotų tol,
        // kol nebus įvestas žodis „pabaiga“.

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Iveskite zodi. Noredami baigti iveskite zodi: pabaiga");
            String zodis = sc.nextLine();
            if (zodis.equals("pabaiga")) {
                System.out.println("Programos pabaiga!");
                break;
            } else {
                System.out.println("Ivestas zodis: " + zodis);
            }

        }

    }

}
