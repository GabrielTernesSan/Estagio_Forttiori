package Casting;

import Casting.models.Animal;
import Casting.models.Cat;
import Casting.models.Dog;

public class Programa {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = new Animal();
        Animal animal2 = new Animal();
        Cat cat = new Cat();

        animal.fazBarulho();
        dog.fazBarulho();
        dog.baba();
        cat.fazBarulho();


        System.out.println("--Castings--");
        animal = new Dog(); // Upcasting
        animal.fazBarulho();
//        animal.baba();

        animal2 = new Cat();
        animal2.fazBarulho();

        dog = (Dog) animal;//DownCasting
        dog.fazBarulho();
        dog.corre();

        cat = (Cat) animal2;
        cat.fazBarulho();

        // Upcasting

        int idade = 9; // 32 bits

        double idade2 = idade; // 32 bits → 64 bits : Implícito

        // Downcasting

        double salario = 1323.354; // 64 bits

        int salario2 = (int) salario; // 64 bits → 32 bits : Explpicito | há perda de dados
    }
}

