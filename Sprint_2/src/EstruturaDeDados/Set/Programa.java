package EstruturaDeDados.Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Programa {

    public static void main(String[] args) {
        System.out.println("LinkedHashSet");
        LinkedHashSeta();
        System.out.println();
        System.out.println("HashSet");
        HashSeta();
        System.out.println();
        System.out.println("TreeSet");
        TreeSeta();
        System.out.println();
    }

    public static void LinkedHashSeta(){
        LinkedHashSet<Integer> teste3 = new LinkedHashSet<>();

        // ADD
        long inicio = System.nanoTime();
        for (int i = 0; i < 1000000; i++){
            teste3.add(i);
        }
        long fim = System.nanoTime();
        System.out.println("add: " + (fim - inicio));

        // REMOVE
        inicio = System.nanoTime();

        teste3.removeAll(teste3);

        fim = System.nanoTime();
        System.out.println("remove: " + (fim - inicio));
    }
    public static void HashSeta(){
        HashSet<Integer> teste4 = new HashSet();

        // ADD
        long inicio = System.nanoTime();
        for (int i = 0; i < 1000000; i++){
            teste4.add(i);
        }
        long fim = System.nanoTime();
        System.out.println("add: " + (fim - inicio));

        // REMOVE
        inicio = System.nanoTime();

        teste4.removeAll(teste4);

        fim = System.nanoTime();
        System.out.println("remove: " + (fim - inicio));
    }
    public static void TreeSeta(){
        TreeSet<Integer> teste5 = new TreeSet<>(new CustomComparator());

        // ADD
        long inicio = System.nanoTime();
        for (int i = 0; i < 1000000; i++){
            teste5.add(i);
        }
        long fim = System.nanoTime();
        System.out.println("add: " + (fim - inicio));

        // REMOVE no inicio
        inicio = System.nanoTime();

        teste5.pollFirst();

        fim = System.nanoTime();
        System.out.println("remove no inicio: " + (fim - inicio));

        // REMOVE no fim
        inicio = System.nanoTime();

        teste5.pollLast();

        fim = System.nanoTime();
        System.out.println("remove no fim: " + (fim - inicio));

//        teste5.forEach(System.out::println);

        // REMOVE
        inicio = System.nanoTime();

        teste5.removeAll(teste5);

        fim = System.nanoTime();
        System.out.println("remove: " + (fim - inicio));
    }

    public static class CustomComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer num1, Integer num2) {
            int value =  num1.compareTo(num2);

            if (value > 0) {
                return -1;
            }
            else if (value < 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}
