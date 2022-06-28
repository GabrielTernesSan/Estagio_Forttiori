package Equals_HashCode.models;

import java.util.Objects;

public class Aluno extends Pessoa{
    private String matricula;
    private int serie;

    public Aluno(String nome, String sobrenome, int idade, String matricula) {
        super(nome, sobrenome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(getMatricula(), aluno.getMatricula()) && Objects.equals(getNome(), aluno.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula(), getNome());
    }
}
