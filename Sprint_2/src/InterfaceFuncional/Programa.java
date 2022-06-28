package InterfaceFuncional;

import java.util.*;
import java.util.function.*;

public class Programa {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("Consumer");
        List<String> lista = new ArrayList<>();

        lista.add("Gabriel");
        lista.add("Luiz");
        lista.add("Gustavo");
        lista.add("Julia");
        lista.add("Fernanda");

        // Recebe uma String e imprimi o tamanho da mesma
        lista.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.length());
            }
        });
//        lista.forEach(s -> System.out.println(s.length()));


        System.out.println("BiConsumer");
        // O BiConsumer segue as mesmas regras, mas recebe dois argumentos.
        Map<Integer, String> lista2 = new HashMap<>();

        lista2.put(1, "um");
        lista2.put(2, "dois");
        lista2.put(3, "tres");
        lista2.put(4, "quatro");

        // Recebe a chave e o valor do Map e imprimi valor e chave
        lista2.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer num, String s) {
                System.out.println(s + " " + num);
            }
        });
//        lista2.forEach((s, num) -> System.out.println(s + " " + num));


        System.out.println("Consumer andThen");
        // Consumer andThen retorna um Consumer composto que executa,
        // em sequência, a operação atual seguida pela operação posterior.
        Consumer<Integer> d = (Integer num) -> System.out.println(num * num);
        Consumer<Integer> e = (Integer num) -> System.out.println(num / 2);
        d.andThen(e).accept(6);

        System.out.println();

        System.out.println("Function");
        /*Map<String, Integer> lista3 = new HashMap<>();

        lista3.put("Gabriel", null);
        lista3.put("Helen", 22);
        lista3.put("Mauro", 54);
        lista3.put("Rafael", 14);

        // Um dos usos do tipo Function na biblioteca padrão é o método Map.computeIfAbsent.
        // Esse método retorna um valor de um mapa por chave, mas calcula um valor se uma chave
        // ainda não estiver presente em um mapa. Para calcular um valor, ele usa a implementação
        // Function passada.
        Integer valor = lista3.computeIfAbsent("Gabriel", new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        });
        Integer valor2 = lista3.computeIfAbsent("Rafael", new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        });
        System.out.println(valor);
        System.out.println(valor2);*/

        numeros.stream().map(num -> num.doubleValue()).forEach(System.out::println);

        System.out.println("Compose Function");
        Function<Integer, Integer> multiplicacao = (num) -> num * 3;
        Function<Integer, Integer> adicao = (value) -> value + 3;

        Function<Integer, Integer> adicaoEMultiplicacao = multiplicacao.compose(adicao);

        Integer result1 = adicaoEMultiplicacao.apply(6);
        System.out.println(result1);

        System.out.println("AndThen Function");
        Function<Integer, Integer> adicaoDepoisMultiplicacao = multiplicacao.andThen(adicao);

        Integer result2 = adicaoDepoisMultiplicacao.apply(3);
        System.out.println(result2);

        System.out.println();

        System.out.println("Predicate");
        numeros.stream().filter( num -> num % 2 == 0).forEach(System.out::println);
        Predicate<Integer> menorQue = i -> (i < 18);
        System.out.println(menorQue.test(10));

        System.out.println("Predicate Or");
        Predicate<String> string1 = (texto) -> texto.startsWith("A");
        Predicate<String> string2 = (texto) -> texto.endsWith("o");

        Predicate<String> composto1 = string1.or(string2);

        String frase1= "A Dona aranho subiu pela parece";
        boolean resultado1 = composto1.test(frase1);
        System.out.println(resultado1);

        System.out.println("Predicate And");
        Predicate<String> composto2 = string1.and(string2);

        String frase2 = "A gata subiu no telhado";
        boolean resultado2 = composto2.test(frase2);
        System.out.println(resultado2);

        System.out.println();

        System.out.println("Supplier");
        // Retorna uma nova instância de Integer entre 0 e 1000
        Supplier<Integer> supplier = () -> (int)(Math.random() * 1000);
        System.out.println(supplier.get());

    }
}
