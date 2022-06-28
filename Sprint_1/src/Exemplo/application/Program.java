package Exemplo.application;

import Exemplo.enums.TamanhoUniforme;
import Exemplo.models.Aluno;
import Exemplo.models.Pessoa;
import Exemplo.models.Professor;

public class Program {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Gabriel", "599.976.500-50", "202112296", TamanhoUniforme.M);

        Aluno aluno2 = new Aluno();
        aluno2.setName("Matheus");
        aluno2.setCpf("993.759.480-48");
        aluno2.setMatricula("202112294");
        aluno2.setTamanhoDoUniforme(TamanhoUniforme.PP);
        aluno.estudar();

        Pessoa.QTD_OLHOS = 3;

        Aluno aluno3 = new Aluno("Julia", "599.976.500-50", "202112296", TamanhoUniforme.GG, 25);

        print(aluno);
        print("");
        print(aluno2);
        print("");
        print(aluno3);
        print("");

        Professor professor = new Professor();
        professor.setName("Mauro");
        professor.setCpf("200.639.690-09");
        professor.setMatricula("19005166");
        professor.setSenha(1234);
        professor.estuda(10);

        //professor.setSalario();
        //professor.getSalario();

        professor.SetarSalario();

        aluno.ler();

//        Aluno.ler();

        Program.print(professor);
        print(" ");
        professor.Autenticando();
        print(professor.Autentica(6465));
    }
    // Static
    public static void print(Object obj){
        System.out.println(obj);
    }
}
