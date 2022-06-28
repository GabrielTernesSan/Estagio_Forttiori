package Casting.models;

public class Dog extends Animal {
    @Override
    public void fazBarulho() {
        System.out.println("au au");
    }
    public void baba() {
        System.out.println("O cahchorro baba o sofá");
    }
}