package Paskaita_3_uzduotys;

import java.util.Scanner;

/**
 * Created by Arimantas on 2017.04.07.
 */
public class Uzdav_3_7_8 {

    private static int[] masSk;

    public static void main(String[] args) {

        // 7. Paprašyti vartotojo nurodyti kiek skaičių jis ketina įvesti,
        // tuomet duoti jam įvesti tiek skaičių, kiek jis pasirinko.
        // Po įvedimo atvaizduoti tik tuos skaičius kurie buvo didesni nei 100.
        // 8. Realizuoti 1.7. užduotį panaudojant metodą kurio parametras būtų vartotojo įvestų
        // skaičių masyvas ir skaičių didesnių nei 100 atvaizdavimas vyktų pačiame metode.

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite kiek skaiciu ketinate ivesti: ");
        int masDydis = sc.nextInt();
        masSk = new int[masDydis];
        int i = 0;

        do {
            int skaicius = sc.nextInt();
            masSk[i] = skaicius;
            i++;
        } while (i != masDydis);

        spauzdinimas();
    }


    private static void spauzdinimas() {
        for (int j = 0; j < masSk.length; j++) {
            if (masSk[j] > 100) {
                System.out.println(masSk[j] + " > 100");  // prasao atvaizduot tik didesnius uz 100
            } else {
                System.out.println(masSk[j] + " < 100");  // sito uzduotis nepraso, tiesiog pridejau
            }
        }
    }


}
