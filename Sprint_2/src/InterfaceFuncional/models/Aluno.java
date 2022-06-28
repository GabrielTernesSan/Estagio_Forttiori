package InterfaceFuncional.models;

import InterfaceFuncional.interfaces.ISenha;

public class Aluno implements ISenha {
    private String nome;
    private int idade;
    private String senha;

    public Aluno(String nome, int idade, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public boolean Autentica(String senha1) {
        return getSenha().equals(senha1);
    }
}
