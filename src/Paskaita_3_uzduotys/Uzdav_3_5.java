package Paskaita_3_uzduotys;

import java.util.Scanner;

/**
 * Created by Arimantas on 2017.04.07.
 */
public class Uzdav_3_5 {

    public static void main(String[] args) {

        // 5. Parašyti programą, kuri paprašytų įvesti 5 skaičius.
        // Baigus skaičių įvedimą, turi būti atvaizduojama įvestų skaičių suma ir visi įvesti skaičiai.

        Scanner sc = new Scanner(System.in);

        int i = 1;
        int[] mas = new int[5];
        int suma = 0;

        while (i <= 5) {
            System.out.println("Iveskite " + i + " skaiciu: ");
            int skaic = sc.nextInt();
            mas[i - 1] = skaic;
            suma = suma + skaic;
            i++;
        }

        System.out.printf("Jusu ivesti skaiciai yra :");

        for (int j = 0; j < mas.length; j++) {
           System.out.printf(" " + mas[j]);
        }

        System.out.println();
        System.out.println("Ju suma = " + suma);

    }
}
