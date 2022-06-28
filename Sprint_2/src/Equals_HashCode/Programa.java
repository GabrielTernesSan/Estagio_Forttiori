package Equals_HashCode;

import Equals_HashCode.models.Aluno;
import Equals_HashCode.models.Pessoa;
import Equals_HashCode.models.Professor;

public class Programa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Gabriel", "Santos", 21);
        Pessoa pessoa2 = new Pessoa("Gabriel", "Santos", 21);

        // Sem equals e HashCode
        System.out.println("Sem equals e hashcode");
        if (pessoa1.equals(pessoa2))
            System.out.println("Iguais");
        else System.out.println("Diferentes");
        System.out.println(pessoa1.hashCode() + " | " + pessoa2.hashCode());

        System.out.println();

        Aluno aluno1 = new Aluno("Gabriel", "Ternes", 21, "202112296");
        Aluno aluno2 = new Aluno("Gabriel", "Ternes", 21, "202112296");
        Aluno aluno3 = new Aluno("Gabriel", "Ternes", 21, "202112295");

        System.out.println("Com equals e hashCode");
        if (aluno1.equals(aluno2))
            System.out.println("Iguais");
        else System.out.println("Diferentes");
        System.out.println(aluno1.hashCode() + " | " + aluno2.hashCode() + " | " + aluno3.hashCode());

        System.out.println();

        Professor professor1 = new Professor("João", "Dávila", 35, 4);
        Professor professor2 = new Professor("João", "Dávila", 35, 2);
        Professor professor3 = new Professor("Gabriel", "Ternes", 22, 4);

        System.out.println("Teste01 Professores");
        if (professor1.equals(professor2))
            System.out.println("Iguais");
        else System.out.println("Diferentes");
        System.out.println(professor1.hashCode() + " | " + professor2.hashCode() + " | " + professor3.hashCode());

        System.out.println("Teste02 Professores");
        if (professor1.equals(professor3))
            System.out.println("Iguais");
        else System.out.println("Diferentes");
        System.out.println(professor1.hashCode() + " | " + professor2.hashCode() + " | " + professor3.hashCode());

        System.out.println();


        int numero1 = 9;

//        Integer numero1 = new Integer("9");
        Integer numero2 = Integer.parseInt("9");
        Integer numero3 = numero1;

        System.out.println("Classe Wrapper Integer");
        if(numero2.equals(numero3))
            System.out.println("Iguais");
        else System.out.println("Diferentes");
    }
}
