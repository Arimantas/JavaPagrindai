package Paskaita_3_uzduotys;

import java.util.Scanner;

/**
 * Created by Arimantas on 2017.04.06.
 */
public class Uzdav_3_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Irasykite skaiciu: ");
        int sk = sc.nextInt();
        if (sk % 2 == 0) {
            System.out.println(sk + " yra lyginis");
        } else {
            System.out.println(sk + " yes nelyginis");
        }

    }


}
