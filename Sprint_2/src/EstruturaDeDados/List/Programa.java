package EstruturaDeDados.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Programa {
    public static void main(String[] args) {
        System.out.println("ArrayList");
        ArrayLista();
        System.out.println();
        System.out.println("LinkedList");
        LinkedLista();
    }

    public static void ArrayLista(){
        ArrayList<Integer> teste = new ArrayList<>();

        // ADD
        long inicio = System.nanoTime();

        for (int i = 0; i < 1000000; i++){
            teste.add(i);
        }

        long fim = System.nanoTime();
        System.out.println("add: " + (fim - inicio));

        System.out.println("Order");
        inicio = System.nanoTime();

        Collections.reverse(teste);

        fim = System.nanoTime();
        System.out.println("Order reverse: " + (fim - inicio));

        inicio = System.nanoTime();

        Collections.sort(teste);

        fim = System.nanoTime();
        System.out.println("Order: " + (fim - inicio));

        // GET
        inicio = System.nanoTime();

        teste.get(teste.size()-1);

        fim = System.nanoTime();
        System.out.println("get: " + (fim - inicio));

        // SET
        inicio = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            for (int j = 1000000; j < 0; j--) {
                teste.set(i, j);
            }
        }

        fim = System.nanoTime();
        System.out.println("set: " + (fim - inicio));

        // ADD meio
        inicio = System.nanoTime();

        teste.add(500000, 85);

        fim = System.nanoTime();
        System.out.println("add no meio: " + (fim - inicio));

        // ADD inicio
        inicio = System.nanoTime();

        teste.add(0, 85);

        fim = System.nanoTime();
        System.out.println("add no inicio: " + (fim - inicio));

        // ADD fim
        inicio = System.nanoTime();

        teste.add(teste.size() - 1, 85);

        fim = System.nanoTime();
        System.out.println("add no fim: " + (fim - inicio));

        // REMOVE do meio
        inicio = System.nanoTime();

        teste.remove(500000);

        fim = System.nanoTime();
        System.out.println("remove do meio: " + (fim - inicio));

        // REMOVE
        inicio = System.nanoTime();
        for (int i = 1000000; i < 0; i--){
            teste.remove(i);
        }
        fim = System.nanoTime();
        System.out.println("remove: " + (fim - inicio));
    }
    public static void LinkedLista(){

        LinkedList<Integer> teste2 = new LinkedList<>();

        // ADD
        long inicio = System.nanoTime();
        for (int i = 0; i < 1000000; i++){
            teste2.add(i);
        }
        long fim = System.nanoTime();
        System.out.println("add: " + (fim - inicio));

        // GET
        inicio = System.nanoTime();

        teste2.get(46545);

        fim = System.nanoTime();
        System.out.println("get: " + (fim - inicio));

        //SET
        inicio = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            for (int j = 1000000; j < 0; j--) {
                teste2.set(i, j);
            }
        }
        fim = System.nanoTime();
        System.out.println("set: " + (fim - inicio));

        // ADD meio
        inicio = System.nanoTime();

        teste2.add(500000, 46);

        fim = System.nanoTime();
        System.out.println("add no meio: " + (fim - inicio));

        // ADD inicio
        inicio = System.nanoTime();

        teste2.addFirst(45);

        fim = System.nanoTime();
        System.out.println("add no inicio: " + (fim - inicio));

        // ADD fim
        inicio = System.nanoTime();

        teste2.addLast(85);

        fim = System.nanoTime();
        System.out.println("add no fim: " + (fim - inicio));

        // REMOVE do meio
        inicio = System.nanoTime();

        teste2.remove(500000);

        fim = System.nanoTime();
        System.out.println("remove do meio: " + (fim - inicio));

        // REMOVE do fim
        inicio = System.nanoTime();

        teste2.removeLast();

        fim = System.nanoTime();
        System.out.println("remove do fim: " + (fim - inicio));

        // REMOVE do inicio
        inicio = System.nanoTime();

        teste2.removeFirst();

        fim = System.nanoTime();
        System.out.println("remove do inicio: " + (fim - inicio));

        // REMOVE
        inicio = System.nanoTime();
        for (int i = 1000000; i < 0; i--){
            teste2.remove(i);
        }
        fim = System.nanoTime();
        System.out.println("remove: " + (fim - inicio));
    }
}
