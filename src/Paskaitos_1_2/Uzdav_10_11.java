package Paskaitos_1_2;

import java.util.Scanner;

/**
 * Created by Arimantas on 2017.04.06.
 */
public class Uzdav_10_11 {
    public static void main(String[] args) {

        Skaiciuotuvas skaic = new Skaiciuotuvas();
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu: ");
        float firstNm = sc.nextFloat();
        System.out.println("Iveskite antra skaiciu: ");
        float secontNm = sc.nextFloat();
        //System.out.println("Iveskite norima atlikti veiksma +, - arba *");    //    su String kazko neveikia
        //String veiksmas = sc.next();
        System.out.println("Iveskite norimo atlikti veiksmo numeri. Suma: 1, Skirtumas: 2, Sandauga: 3");
        int veiksmas = sc.nextInt();

/*
        //  Kodel neveikia su string?
        if (veiksmas == "+") {
            System.out.println(firstNm + " + " + secontNm + " = " + skaic.suma(firstNm, secontNm));
        }
        else if (veiksmas == "-") {
            float skirtumas = skaic.skirt(firstNm, secontNm);                        // del ivairoves
            System.out.println(firstNm + " - " + secontNm + " = " + skirtumas);
        }
        else if (veiksmas == "*") {
            System.out.println(firstNm + " x " + secontNm + " = " + skaic.sand(firstNm, secontNm));
        }
        else {
            System.out.println("Negalimas veiksmas.");
        }
*/

        if (veiksmas == 1) {
            System.out.println(firstNm + " + " + secontNm + " = " + skaic.suma(firstNm, secontNm));

        } else if (veiksmas == 2) {
            float skirtumas = skaic.skirt(firstNm, secontNm);                        // del ivairoves
            System.out.println(firstNm + " - " + secontNm + " = " + skirtumas);

        } else if (veiksmas == 3) {
            System.out.println(firstNm + " x " + secontNm + " = " + skaic.sand(firstNm, secontNm));

        } else {
            System.out.println("Negalimas veiksmas.");
        }

    }
}

class Skaiciuotuvas {

    public int suma(int firstNm, int secondNm) {
        return firstNm + secondNm;
    }

    public int skirt(int firstNm, int secondNm) {
        return firstNm - secondNm;
    }

    public int sand(int firstNm, int secondNm) {
        return firstNm * secondNm;
    }

    public float suma(float firstNm, float secondNm) {
        return firstNm + secondNm;
    }

    public float skirt(float firstNm, float secondNm) {
        return firstNm - secondNm;
    }

    public float sand(float firstNm, float secondNm) {
        return firstNm * secondNm;
    }

}