package Paskaita_3_uzduotys;

import java.util.Scanner;

/**
 * Created by Arimantas on 2017.04.07.
 */
public class Uzdav_3_7 {

    public static void main(String[] args) {

        // 7. Paprašyti vartotojo nurodyti kiek skaičių jis ketina įvesti,
        // tuomet duoti jam įvesti tiek skaičių, kiek jis pasirinko.
        // Po įvedimo atvaizduoti tik tuos skaičius kurie buvo didesni nei 100.

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite kiek skaiciu ketinate ivesti: ");
        int masDydis = sc.nextInt();
        int[] masSk = new int[masDydis];
        int i = 0;

        do {
            int skaicius = sc.nextInt();
            masSk[i] = skaicius;
            i++;
        } while (i != masDydis);


        for (int j = 0; j < masSk.length; j++) {
            if (masSk[j] > 100) {
                System.out.println(masSk[j] + " > 100");  // prasao atvaizduot tik didesnius uz 100
            } else {
                System.out.println(masSk[j] + " < 100");  // sito uzduotis nepraso, tiesiog pridejau
            }
        }

    }
}
