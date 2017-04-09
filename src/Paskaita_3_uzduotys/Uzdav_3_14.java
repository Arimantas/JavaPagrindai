package Paskaita_3_uzduotys;

import java.util.Scanner;

/**
 * Created by Arimantas on 2017.04.09.
 */

public class Uzdav_3_14 {

    // Parašyti metodą kuris per parametrus pasiimtų masyvą, o grąžintų apsuktą masyvą ([1, 2, 3, 4, 5] -> [5, 4, 3, 2, 1]).
    // Užuomina: sukurti antrą tokio paties dydžio masyvą ir jam priskirti skaičius nuo galo.
    // KADANGI JAU TURIU MASYVO PAEMIMO METODA IS 12 IR 13 UZDUOCIU, TAI MASYVA IR JO ILGI IVEDU PATS.

    public static void main(String[] args) {
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

        System.out.println("Paduotas masyvas:");
        int j = 0;
        while (j < masIlg) {
            System.out.print("[" + mas[j] + "]" + " ");
            j++;
        }
        System.out.println();
        System.out.println("Apsuktas masyvas: ");

        int[] mas2 = masApsukimas(mas);
        int k = 0;
        while (k < masIlg) {
            System.out.print("[" + mas2[k] + "]" + " ");
            k++;
        }
    }

    // masyvo apsukimas
    private static int[] masApsukimas(int[] mas) {
        int[] mas2 = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            mas2[i] = mas[mas.length - 1 - i];
        }
        return mas2;
    }
}
