package Stream;

import Stream.models.Pessoa;

import java.util.*;
import java.util.stream.Collectors;

public class Programa {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Gabriel");
        nomes.add("Jonas");
        nomes.add("Gustavo");
        nomes.add("Guilherme");
        nomes.add("Gefersone");
        nomes.add("Matheus");

        nomes.forEach(System.out::println);

        System.out.println();

        System.out.println("filter");
        String nomesFiltrados = nomes.stream().filter(nome -> nome.startsWith("G"))
                .filter(nome -> nome.endsWith("e")).collect(Collectors.joining(", "));
        System.out.println(nomesFiltrados);

        System.out.println();

        System.out.println("count");
        System.out.println(nomes.stream().count());

        System.out.println();

        System.out.println("limit");
        System.out.println(nomes.stream().limit(3).collect(Collectors.toList()));

        System.out.println();

        System.out.println("skip");
        System.out.println(nomes.stream().skip(3).collect(Collectors.toList()));

        System.out.println();

        System.out.println("sorted");
        System.out.println(nomes.stream().sorted(String::compareTo).collect(Collectors.toList()));

        System.out.println();

        System.out.println("sorted reverse");
        System.out.println(nomes.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        System.out.println();

        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Gabriel", 21, 162.5);
        Pessoa pessoa2 = new Pessoa("Melissa", 21, 181.2);
        Pessoa pessoa3 = new Pessoa("Leticia", 20, 158.5);

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        System.out.println("map");
        pessoas.stream().map(Pessoa::getNome).forEach(System.out::println);

        System.out.println();

        System.out.println("reduce");
        System.out.println(pessoas.stream().map(Pessoa::getIdade).reduce((a, b) -> a + b));

        System.out.println();

        System.out.println("allMatch");
        System.out.println(pessoas.stream().allMatch(pessoa -> pessoa.getNome().startsWith("G")));

        System.out.println();

        System.out.println("anyMatch");
        System.out.println(pessoas.stream().anyMatch(pessoa -> pessoa.getNome().endsWith("l")));

        System.out.println();

        System.out.println("noneMatch");
        System.out.println(pessoas.stream().noneMatch(pessoa -> pessoa.getIdade() > 22));

        System.out.println();

        System.out.println("avarage");
        System.out.println(pessoas.stream().mapToDouble(Pessoa::getAltura).average().getAsDouble());

        System.out.println();

        System.out.println("Collect");
        List<Integer> idadesPessoas = pessoas.stream().map(Pessoa::getIdade).collect(Collectors.toList());
        idadesPessoas.forEach(System.out::println);

        System.out.println();

        System.out.println("GroupingBy");
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        Map<Boolean, List<Integer>> filtrados = numeros.stream().collect(Collectors.groupingBy(num -> num % 2 == 0));
        Map<Integer, List<Integer>> mapa = numeros.stream().collect(Collectors.groupingBy(num -> num % 3));
        System.out.println(filtrados);
        System.out.println(mapa);

        System.out.println();

        System.out.println("Join");

        String collect = numeros.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("; "));
        System.out.println(collect);
    }
}
