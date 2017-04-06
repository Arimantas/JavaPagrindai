package Paskaita_3;

/**
 * Created by Arimantas on 2017.04.06.
 */
public class ConstructorExample {

    //tuscias konstruktorius, visos klases turi pagal nutylejima tuscia konstruktoriu
    public ConstructorExample() {
        System.out.println("Nebetuscias konstruktorius");
    }

    public ConstructorExample(int id){
        System.out.println("2 konstruktorius su reiksme " + id);
    }
}

class MyMainApp {

    public static void main(String[] args) {
        ConstructorExample vardas = new ConstructorExample();
        ConstructorExample vardas1 = new ConstructorExample(123);
    }
}
