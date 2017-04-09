package Paskaita_3_uzduotys;

import java.util.Scanner;

/**
 * Created by Arimantas on 2017.04.08.
 */
public class Uzdav_3_12_13 {

    // 12.  Parašyti metodą kurio parametras būtų sveikų skaičių masyvas. Metodas turi grąžinti didžiausią masyvo skaičių.
    // 13.  Parašyti metodą kurio parametras būtų sveikų skaičių masyvas. Metodas turi grąžinti mažiausią masyvo skaičių.

   /* public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite skaiciu masyvo ilgi: ");
        int masIlg = sc.nextInt();
        int[] mas = new int[masIlg];

        int i = 0;

        while (i < masIlg) {
            System.out.println("Iveskite " + (i + 1) + " masyvo skaiciu: ");
            mas[i] = sc.nextInt();
            i++;
        }

        int maxMasSk = maxMasValue(mas);
        System.out.println("Didziausia masyvo reiksme: " + maxMasSk);

        int minMasSk = minMasValue(mas);
        System.out.println("Maziausia masyvo reiksme: " + minMasSk);
    }

    // max reiksmes paieska
    private static int maxMasValue(int[] mas) {

        int maxMas = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > maxMas) {
                maxMas = mas[i];
            }
        }
        return maxMas;
    }

    // min reiksmes paieska
    private static int minMasValue(int[] mas) {

        int minMas = mas[0]; // mas[0] - pirma masyvo reiksme; arba galima: 2147483647 - max integer

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < minMas) {
                minMas = mas[i];
            }
        }
        return minMas;
    }*/
}
