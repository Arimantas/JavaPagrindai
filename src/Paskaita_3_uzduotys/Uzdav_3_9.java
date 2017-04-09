package Paskaita_3_uzduotys;

import java.util.Scanner;

/**
 * Created by Arimantas on 2017.04.07.
 */
public class Uzdav_3_9 {

    public static void main(String[] args) {

        // 9. Sukurti supaprastintą skaičiuoklės programą kuri paprašytų įvesti du skaičius
        // ir operacijos tarp jų skaičių (1 – suma, 2 – skirtumas, 3 – sandauga).
        // Gautą rezultatą programa pavaizduotų ekrane ir paklaustų ar norėsime kartoti.
        // Įvedus skaičių 5, programa turėtų kartoti darbą iš naujo, priešingu atveju programa baigtų darbą.

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Iveskite norima atlikti veiksma: ");
                String[] veik = sc.nextLine().split("\\s");
                double sk1 = Double.parseDouble(veik[0]);
                double sk2 = Double.parseDouble(veik[2]);

                switch (veik[1]) {
                    case "+":
                        System.out.println("Rezultatas: " + (sk1 + sk2));
                        break;

                    case "-":
                        System.out.println("Rezultatas: " + (sk1 - sk2));
                        break;

                    case "*":
                        System.out.println("Rezultatas: " + (sk1 * sk2));
                        break;

                    default:
                        System.out.println("Nenumatytas veiksmas (+, -, *)");

                }
                break;
            } catch (Exception e) {
                System.out.println("Neteisinga veiksmu struktura");
            }

        }

    }

}

