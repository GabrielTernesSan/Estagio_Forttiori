package EstruturaDeDados.Queue_Stack;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Programa {
    public static void main(String[] args) {
        System.out.println("Queue");
        Queue();
        System.out.println();
        System.out.println("Stack");
        Stack();
    }

    public static void Queue(){ // FIFO
        Queue<Integer> queue = new LinkedList<>();

        // ADD
        long inicio = System.nanoTime();

        for (int i = 0; i < 1000000; i++){
            queue.add(i);
        }

        long fim = System.nanoTime();
        System.out.println("add: " + (fim - inicio));

        // REMOVE
        inicio = System.nanoTime();

        queue.poll();

        fim = System.nanoTime();
        System.out.println("remove: " + (fim - inicio));

        // REMOVE all
        inicio = System.nanoTime();

        for (int i = 1000000; i < 0; i--){
            queue.poll();
        }

        fim = System.nanoTime();
        System.out.println("remove all: " + (fim - inicio));
    }

    public static void Stack(){ // LIFO
        Stack<Integer> teste9 = new Stack<>();

        // ADD
        long inicio = System.nanoTime();

        for (int i = 0; i < 1000000; i++){
            teste9.push(i);
        }

        long fim = System.nanoTime();
        double segundo = ((fim - inicio) * 0.000000001);
        System.out.println("add: " + (fim - inicio));

        // REMOVE
        inicio = System.nanoTime();

        teste9.pop();

        fim = System.nanoTime();
        System.out.println("remove: " + (fim - inicio));

        // REMOVE all
        inicio = System.nanoTime();

        teste9.clear();

        fim = System.nanoTime();
        segundo = ((fim - inicio) * 0.000000001);
        System.out.println("remove all: " + (fim - inicio));
    }

}
