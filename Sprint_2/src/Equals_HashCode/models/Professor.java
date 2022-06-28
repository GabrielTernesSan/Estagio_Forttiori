package Equals_HashCode.models;

import java.util.Objects;

public class Professor extends Pessoa {
    private int qtdTurmas;

    public Professor(String nome, String sobrenome, int idade, int qtdTurmas) {
        super(nome, sobrenome, idade);
        this.qtdTurmas = qtdTurmas;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;
        Professor professor = (Professor) o;
        return getQtdTurmas() == professor.getQtdTurmas();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQtdTurmas());
    }*/

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;
        Professor professor = (Professor) o;
        return (getQtdTurmas() == professor.getQtdTurmas() && super.getNome() == professor.getNome());
    }
*/
    @Override
    public int hashCode() {
        return Objects.hash(getQtdTurmas(), super.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;
        Professor professor = (Professor) o;
        return super.getNome() == professor.getNome();
    }

    /*@Override
    public int hashCode() {
        return Objects.hash(super.getNome());*/

}

