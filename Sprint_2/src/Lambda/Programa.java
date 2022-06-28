package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Programa {
    public static void main(String[] args) {
        System.out.println("Imprime todos os elementos da lista!");

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Executa a ação fornecida para cada elemento do Iterable até que todos os elementos
        // tenham sido processados ou a ação lance uma exceção.
        // Foreach é uma método da interface Iterator que recebe como parâmetro um Consumer
        for (Integer numeros : list) {
            System.out.println(numeros);
        }

        System.out.println();

        System.out.println("Com Lambda");
        list.forEach(num -> System.out.println(num * num));

        System.out.println("Lambda com Method Reference");
        list.forEach(System.out::println);
    }
}
