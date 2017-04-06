package Paskaitos_1_2;

import java.util.Scanner;

/**
 * Created by Arimantas on 2017.04.06.
 */
public class Uzdav_13_16 {

    public static void main(String[] args) {

        Skaiciavimai skaic = new Skaiciavimai();
        Scanner scan = new Scanner(System.in);
        System.out.println("Iveskite kvadrato krastines ilgi: ");
        float a = scan.nextFloat();
        System.out.println("Kvadrato plotas: " + skaic.kvadratas(a));
        System.out.println(""); // tuscia eilute

        System.out.println("Iveskite pirmos staciakampio krastines ilgi: ");
        float b = scan.nextFloat();
        System.out.println("Iveskite antros staciakampio krastines ilgi: ");
        float c = scan.nextFloat();
        System.out.println("Staciakampio plotas: " + skaic.staciakampis(b, c));
        System.out.println(""); // tuscia eilute

        System.out.println("Iveskite pirmos staciojo trikampio krastines ilgi: ");
        float d = scan.nextFloat();
        System.out.println("Iveskite antros staciojo trikampio krastines ilgi: ");
        float e = scan.nextFloat();
        System.out.println("Staciojo trikampio plotas: " + skaic.trikampis(d, e));
        System.out.println(""); // tuscia eilute

        System.out.println("Iveskite apskritimo spinduli: ");
        float f = scan.nextFloat();
        System.out.println("Apskritimo plotas: " + skaic.apskritimas(f));

    }
}

class Skaiciavimai {

    public float kvadratas(float a) {
        return a * a;  // nebutinai lyginis skaicius, su float nesigauna a^2 padaryt, a^2f taip pat neina
    }

    public float staciakampis(float b, float c) {
        return b * c;
    }

    public float trikampis(float d, float e) {
        return ((d * e) / 2f);
    }

    public float apskritimas(float f) {
        float pi = 3.1415f;
        return pi * f * f;
    }
}