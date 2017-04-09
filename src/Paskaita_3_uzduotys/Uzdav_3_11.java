package Paskaita_3_uzduotys;

import java.util.Scanner;

/**
 * Created by Arimantas on 2017.04.08.
 */
public class Uzdav_3_11 {

    // 11.  Parašyti programą kuri paprašo vartotojo įvesti skaičių n, tuomet leidžia pasirinkti ką suskaičiuoti,
    // skaičių nuo 1 iki n sumą arba sandaugą (1 - suma, 2 - sandauga).
    // Jeigu įvestas skaičius mažesnis nei vienas, programa turi informuoti apie blogą įvestį.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Boolean wrongNm = false;
        int sk = 1;

        while (!wrongNm) {
            System.out.println("Iveskite skiaciu: ");
            sk = sc.nextInt();

            if (sk < 1) {
                System.out.println("Ivestas skaicius turi buti didesni uz 0");
                wrongNm = false;
            } else {
                wrongNm = true;
            }
        }

        Boolean wrongAc = false;

        while (!wrongAc) {
            System.out.println("Noredami gauti nuo 1 iki jusu ivesto skaiciaus");
            System.out.println("Suma: 1, Sandauga: 2");
            int sk1 = sc.nextInt();

            if (sk1 == 1) {

                int suma = 0;
                for (int i = 1; i <= sk; i++) {
                    suma += i;
                    System.out.print(i + " "); // parodo skaicius
                }
                System.out.println();
                System.out.println("Skaiciu nuo 1 iki jusu ivesto skaiciaus suma yra lygi: " + suma);
                wrongAc = true;

            } else if (sk1 == 2) {

                int sand = 1;
                for (int i = 1; i <= sk; i++) {
                    sand *= i;
                    System.out.print(i + " "); // parodo skaicius
                }
                System.out.println();
                System.out.println(sk + "! = " + sand);
                wrongAc = true;

            } else {

                System.out.println("Pasirinktas netinkamas veiksmas");
                wrongAc = false;

            }
        }


    }
}
