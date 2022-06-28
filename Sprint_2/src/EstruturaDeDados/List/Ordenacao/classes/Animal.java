package EstruturaDeDados.List.Ordenacao.classes;

import java.util.Objects;

public class Animal {
    private String nome;

    private String especie;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(getNome(), animal.getNome()) && Objects.equals(getEspecie(), animal.getEspecie());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getEspecie());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                '}' + "\n";
    }
}
