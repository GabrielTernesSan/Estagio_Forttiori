package EstruturaDeDados.Map;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class Programa {
    public static void main(String[] args) {
        System.out.println("HashMap:");
        HashMapa();
        System.out.println();
        System.out.println("LinkedHashMap:");
        LinkedHashMapa();
        System.out.println();
        System.out.println("TreeMap:");
        TreeMapa();
    }

    public static void HashMapa() {
        HashMap<Integer, String> teste6 = new HashMap<Integer, String>();

        // ADD
        Instant inicio = Instant.now();
        for (int i = 0; i < 1000000; i++) {
            teste6.put(i, Integer.toString(i));
        }
        Instant fim = Instant.now();
        System.out.println("add: " + Duration.between(inicio, fim));

        // GET
        inicio = Instant.now();

        teste6.get(50);

        fim = Instant.now();
        System.out.println("get: " + Duration.between(inicio, fim));

        // SET
        inicio = Instant.now();

        teste6.replace(null, null);

        fim = Instant.now();
        System.out.println("set: " + Duration.between(inicio, fim));

        // REMOVE
        inicio = Instant.now();
        for (int i = 1000000; i < 0; i--) {
            teste6.remove(i);
        }
        fim = Instant.now();
        System.out.println("remove: " + Duration.between(inicio, fim));
    }

    public static void LinkedHashMapa() {
        LinkedHashMap<Integer, String> teste7 = new LinkedHashMap<>();

        // ADD
        Instant inicio = Instant.now();
        for (int i = 0; i < 1000000; i++) {
            teste7.put(i, Integer.toString(i));
        }
        Instant fim = Instant.now();
        System.out.println("add: " + Duration.between(inicio, fim));

        // GET
        inicio = Instant.now();

        teste7.get(6);

        fim = Instant.now();
        System.out.println("get: " + Duration.between(inicio, fim));

        // SET
        inicio = Instant.now();

        teste7.put(2, "3");

        fim = Instant.now();
        System.out.println("set: " + Duration.between(inicio, fim));

        // REMOVE
        inicio = Instant.now();

        for (int i = 1000000; i < 0; i--) {
            teste7.remove(i);
        }

        fim = Instant.now();
        System.out.println("remove: " + Duration.between(inicio, fim));
    }

    public static void TreeMapa() {
        TreeMap<Integer, String> teste8 = new TreeMap<>(new CustomComparator());
        //TreeMap<Integer, String> teste8 = new TreeMap<>();

        // ADD
        Instant inicio = Instant.now();
        for (int i = 0; i < 1000000; i++) {
            teste8.put(i, Integer.toString(i));
        }
        Instant fim = Instant.now();
        System.out.println("add: " + Duration.between(inicio, fim));

        // GET
        inicio = Instant.now();

        teste8.get(65165);

        fim = Instant.now();
        System.out.println("get: " + Duration.between(inicio, fim));

        // SET
        inicio = Instant.now();

        teste8.replace(4, "4");

        fim = Instant.now();
        System.out.println("set: " + Duration.between(inicio, fim));

        // REMOVE FIRST
        inicio = Instant.now();

        teste8.pollFirstEntry();

        fim = Instant.now();
        System.out.println("REMOVE FIRST: " + Duration.between(inicio, fim));

        // REMOVE LAST
        inicio = Instant.now();

        teste8.pollLastEntry();

        fim = Instant.now();
        System.out.println("REMOVE LAST: " + Duration.between(inicio, fim));

        // REMOVE
        inicio = Instant.now();
        for (int i = 1000000; i < 0; i--) {
            teste8.remove(i);
        }
        fim = Instant.now();
        System.out.println("remove: " + Duration.between(inicio, fim));
    }

    public static class CustomComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer number1, Integer number2) {
            int value = number1.compareTo(number2);

            if (value > 0) {
                return -1;
            } else if (value < 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
