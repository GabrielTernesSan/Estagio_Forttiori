package Exemplo.models;

// public class Professor extends Aluno{}

import Exemplo.interfaces.IEstudar;
import Exemplo.interfaces.ISenha;

public class Professor extends Funcionario implements ISenha, IEstudar {

    private Integer senha;

    public Professor() {
    }

    public Professor(String name, String cpf, String matricula, Double salario, Integer senha) {
        super(name, cpf, matricula, salario);
        this.senha = senha;
    }

    public Professor(String name, String cpf, String matricula, Double salario) {
        super(name, cpf, matricula, salario);
        this.senha = senha;
    }

    public void SetarSalario() {
        setSalario(3000.0);
    }

    public void MostrarSalario() {
        getSalario();
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public Integer getSenha() {
        return senha;
    }

    @Override
    public String Autentica(Integer senha) {
        if (this.senha == senha) {
            return "Autenticado";
        }
        return "Não autenticado";
    }

    @Override
    public void estuda(int horas) {
        System.out.println("Eu estudo " + horas + " horas por dia");
    }

    @Override
    public String toString() {
        return "Nome: " + getName() + "\n" + "CPF: " + getCpf() + "\n" + "Matricula: " + getMatricula() + "\n" + "Salario: " + getSalario() + "\n" + "Autenticação: " + Autentica(getSenha()) + "\n" + "Quantidade de olhos: " + getQtdOlhos();
    }
}

