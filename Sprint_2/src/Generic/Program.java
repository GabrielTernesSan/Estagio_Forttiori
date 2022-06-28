package Generic;

import Generic.service.SquareGenerics;
import Generic.service.SquareService;

public class Program {
    public static void main(String[] args) {

        SquareService inteiro = new SquareService(2);
        SquareService flutuante = new SquareService(5.0);

        System.out.println(inteiro.SquareInt());

        //System.out.println(SquareInt((int) 2.0));
        //System.out.println(SquareInt( (int)2L));

        System.out.println(flutuante.SquareDouble());

        System.out.println("Com Generics: ");
        SquareGenerics<Integer> inteiro1 = new SquareGenerics<>(2);
        SquareGenerics<Float> flutuante1 = new SquareGenerics<>(5.0f);

        System.out.println(inteiro1.Square());
        System.out.println(flutuante1.Square());

        //System.out.println(SquareInt(2L));

        SquareGenerics<Integer> inteiro2 = new SquareGenerics<>(2);
        SquareGenerics<Double> flutuante2 = new SquareGenerics<>(2.0);

        System.out.println(inteiro1.saoIguais(flutuante1));
        System.out.println(flutuante2.saoIguais(inteiro2));

    }
}
