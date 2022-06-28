package Exemplo.models;

import Exemplo.enums.TamanhoUniforme;

// Herança
public final class Aluno extends Pessoa {
    // Final
    private TamanhoUniforme tamanhoDoUniforme;

    private Integer idade;

    public Aluno() {
    }

    public Aluno(String name, String cpf, String matricula, TamanhoUniforme tamanhoDoUniforme) {
        super(name, cpf, matricula);
        this.tamanhoDoUniforme = tamanhoDoUniforme;
    }

    public Aluno(String name, String cpf, String matricula, TamanhoUniforme tamanhoDoUniforme, Integer idade) {
        this(name, cpf, matricula, tamanhoDoUniforme);
        this.idade = idade;
    }
    // Encapsulamento


    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public TamanhoUniforme getTamanhoDoUniforme() {
        return tamanhoDoUniforme;
    }

    public void setTamanhoDoUniforme(TamanhoUniforme tamanhoDoUniforme) {this.tamanhoDoUniforme = tamanhoDoUniforme;}

    @Override
    public String toString() {
        if (this.getIdade() != null) {
            return "Nome: " + getName() + "\n" + "CPF: " + getCpf() + "\n" + "Matricula: " + getMatricula() + "\n"
                    + "Tamanho do Uniforme: " + getTamanhoDoUniforme() + "\n" + "Valor do uniforme: "
                    + getTamanhoDoUniforme().ValorUniforme() + "\n" + "Idade = " + getIdade();
        }
        return "Nome: " + getName() + "\n" + "CPF: " + getCpf() + "\n" + "Matricula: " + getMatricula() + "\n"
                + "Tamanho do Uniforme: " + getTamanhoDoUniforme() + "\n" + "Valor do uniforme: "
                + getTamanhoDoUniforme().ValorUniforme() + "\n" + "Quantidade de olhos: " + getQtdOlhos();
    }

    // Sobreposição

    @Override
    public void estudar() {
        System.out.println("Ler");
    }

    @Override
    public void ler() {
        System.out.println("Eu leio");
    }

    //Sobrecarga
    public void estudar(int horas) {
        for (int i = 0; i < horas; i++) {
            System.out.println("Ler");
        }
    }

//    public void ler(int horas) {
//        System.out.println("Ver video aula por" + horas + " horas!");
//    }
//
//    public void ler() {
//        System.out.println("Ver video aula");
//    }
}
