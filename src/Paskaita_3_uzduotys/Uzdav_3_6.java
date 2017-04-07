package Paskaita_3_uzduotys;

import java.util.Scanner;

/**
 * Created by Arimantas on 2017.04.07.
 */
public class Uzdav_3_6 {

    public static void main(String[] args) {

        // 6. Parašyti programą kuri paprašytų vartotojo įvesti 5 žodžius.
        // Po to kai bus įvesti visi žodžiai, jie turi būti atvaizduojami.

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite 5 zodzius");

        int i = 0;
        String[] masyvas = new String[5];

        do {
            String zodis = sc.nextLine();
            masyvas[i] = zodis;
            i++;
        } while (i <= 4);

        System.out.println("Ivesti zodziai: ");
        for (int j = 0; j < masyvas.length; j++) {
            System.out.println(masyvas[j]);
        }


    }


}
