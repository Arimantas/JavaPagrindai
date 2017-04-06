package Paskaita_3;

/**
 * Created by Ineta on 2017.04.06.
 */
public class KetvirtasPvz {

    public static void main(String[] args) {
        masExample();

    }

    private static void masExample() {
        int[] mas = new int[3];
        mas[0] = 12;
        mas[1] = 10;
        mas[2] = 8;

        // reiksmes paemimas is masyvo:
        System.out.println("1 masyvo reiksme: " + mas[1]);
        printMas(mas);
    }

    private static void printMas(int[] masyvas){
        for (int i = 0; i < masyvas.length; i++){
            System.out.println("mas["+i+"] - " + masyvas[i]);
        }

        // private static boolean isStringEquals(String first, String second){
        //                        return first.equals(second);
        // }

    }
}
