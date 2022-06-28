package EstruturaDeDados.Set.Ordenacao;

import EstruturaDeDados.List.Ordenacao.classes.Contato;

import java.util.*;

public class Programa {
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();

        System.out.println("HashSet");

        String n1 = "Gabriel";
        String n2 = "João";
        String n3 = "Julia";
        String n4 = "Abner";

        nomes.add(n1);
        nomes.add(n2);
        nomes.add(n3);
        nomes.add(n4);
        nomes.add(n4);

        System.out.println(nomes);

        TreeSet<String> nomesOrd = new TreeSet<>();

        nomesOrd.add(n1);
        nomesOrd.add(n2);
        nomesOrd.add(n3);
        nomesOrd.add(n4);
        nomesOrd.add(n1);

        System.out.println(nomesOrd);

        TreeSet<Contato> contatos = new TreeSet<>((cont1, cont2) -> cont1.getSobrenome().compareTo(cont2.getSobrenome()));

        // Se o parâmetro de ordenação for igual o TreeSet não aceita
        /*
        *  Por exemplo, se o parâmetro de ordenação for o nome e tiverem dois nomes iguais ele ignora o segundo
        * , agora se o parâmetro de ordenação for o sobrenome e tiverem dois iguais ele ignora o segundo
        * */

        Contato c1 = new Contato("Gabriel", "Santos", "55519914865");
        Contato c2 = new Contato("Zelia", "Silva", "55519914865");
        Contato c3 = new Contato("Paola", "Oliveira", "55519914865");
        Contato c4 = new Contato("Gabriel", "Zarigui", "55519914865");
        Contato c5 = new Contato("Matheus", "Barbosa", "55519914865");

        contatos.add(c1);
        contatos.add(c2);
        contatos.add(c3);
        contatos.add(c4);
        contatos.add(c5);

        System.out.println(contatos);


        LinkedHashSet<Contato> contats = new LinkedHashSet<>();

        contats.add(c4);
        contats.add(c2);
        contats.add(c3);
        contats.add(c1);
        contats.add(c5);

        System.out.println(contats);

    }
}
