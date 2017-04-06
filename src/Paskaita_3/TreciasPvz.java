package Paskaita_3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Arimantas on 2017.04.06.
 */
public class TreciasPvz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        try {
            int num = sc.nextInt();
            System.out.println("Jusu ivestas skaicius: " + num);
        } catch (InputMismatchException vardas) {
            System.out.println("Juk prasiaus ivesti skaiciu!");
        }

    }
}