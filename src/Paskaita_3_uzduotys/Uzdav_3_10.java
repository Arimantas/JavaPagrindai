package Paskaita_3_uzduotys;

import java.util.Scanner;

/**
 * Created by Arimantas on 2017.04.07.
 */
public class Uzdav_3_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Boolean geras = true;
        int sk = 0;

        do {
            System.out.println("Iveskite skaiciu: ");
            sk = sc.nextInt();
            if (sk < 1) {
                System.out.println("Skaicius netinkamas, turi buti didesnis uz 0");
                geras = false;
            } else {
                geras = true;
            }
        } while (!geras);

/*      // tas pats kaip for
        int i = 1;
        while (i <= sk) {
            suma += i;
            i++;
        }
*/
        int suma = 0;
        for (int i = 1; i <= sk; i++) {
            suma += i;
            System.out.print(i + " "); // parodo skaicius
        }

       System.out.println();
       System.out.println("Skaiciu nuo 1 iki jusu ivesto skaiciaus suma yra lygi: " + suma);

    }

}