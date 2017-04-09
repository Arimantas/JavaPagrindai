package Paskaita_3_uzduotys;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Arimantas on 2017.04.07.
 */
public class Uzdav_3_3_4 {

    public static void main(String[] args) {

        // 3. Parašyti programą, kuri paprašytų vesti skaičius tol, kol bus įvestas skaičius 0.
        // Pabaigoje turi būti atvaizduojama įvestų skaičių suma.

        // 4. Papildykite programą kuri neleistu įvesti ne skaičius,
        // jei vartotojas įveda ne skaičių programa prašo pakartoti tol kol bus įvestas skaičius.

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite betkokius skaicius ir gaukite ju suma");
        System.out.println("Kad gautumete pries tai ivestu skaiciu suma irasykite 0");

        int suma = 0;
        int i = 1;

        while (i != 0) {
            try {
                i = sc.nextInt();
                suma = suma + i;
            } catch (InputMismatchException e) {        // kodel e?
                System.out.println("Raidziu as neskaiciuoju, ivesk skaiciu!");
                sc.nextLine();
            }
        }

        System.out.println("Ivestu skaiciu suma: " + suma);

    }
}
