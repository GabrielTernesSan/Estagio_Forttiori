package EstruturaDeDados.List.Ordenacao.classes;

import java.util.Objects;

public class Contato implements Comparable<Contato>{
    private String nome;
    private String sobrenome;
    private String numeroCel;

    public Contato(String nome, String sobrenome, String numeroCel) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroCel = numeroCel;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNumeroCel() {
        return numeroCel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato)) return false;
        Contato contato = (Contato) o;
        return Objects.equals(getNome(), contato.getNome()) && Objects.equals(getSobrenome(), contato.getSobrenome()) && Objects.equals(getNumeroCel(), contato.getNumeroCel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getSobrenome(), getNumeroCel());
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", numeroCel=" + numeroCel +
                '}' + "\n";
    }

    @Override
    public int compareTo(Contato outro) {
        return this.getNome().compareTo(outro.getNome());
    }
}
