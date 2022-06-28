package Wildcards;

import Wildcards.models.Aluno;
import Wildcards.models.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Gabriel");
        nomes.add("Julia");
        nomes.add("Dienefer");
        nomes.add("Brenda");
        nomes.add("Carolina");

        imprimeLista(nomes);

        System.out.println();

        List<Integer> dias = new ArrayList<>();
        dias.add(1);
        dias.add(2);
        dias.add(14);
        dias.add(13);
        dias.add(18);
        dias.add(22);

        imprimeLista(dias);

        System.out.println();

        List<Aluno> alunos = new ArrayList<>();
        Aluno aluno1 = new Aluno("Gabriel", "04445996503", 21, "202112294");
        Aluno aluno2 = new Aluno("Fernando", "04445996503", 21, "202112293");

        alunos.add(aluno1);
        alunos.add(aluno2);

        System.out.println("Imprime aluno");
        imprimeAlunos(alunos);

        System.out.println("Imprime lista");
        imprimeLista(alunos);

        System.out.println("Imprime pessoa");
        imprimePessoa(alunos);

        System.out.println();

        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Gabriel", "5454654654", 51);
        Pessoa pessoa2 = new Pessoa("Brenda", "545464554654", 11);

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);

        System.out.println("Imprime pessoa");
        imprimePessoa(pessoas);
        System.out.println("Imprime lista");
        imprimeLista(pessoas);

    }

    public static void imprimeLista(List<?> elementos){
        elementos.forEach(System.out::println);
    }

//    public static void imprimeAlunos(List<Aluno> alunos){
//        alunos.forEach(System.out::println);
//    }

    // Extends Wildcards
    // Qualquer subtipo de Pessoa
    public static void imprimeAlunos(List<? extends Pessoa> alunos){
        alunos.forEach(System.out::println);
    }

//    private static void imprimePessoa(List<Pessoa> pessoas) {
//        pessoas.forEach(System.out::println);
//    }

    // Super Wildcards
    // Aluno ou qualquer super tipo de Aluno (Pessoa)
    private static void imprimePessoa(List<? super Aluno> pessoas) {
        pessoas.forEach(System.out::println);
    }
}
