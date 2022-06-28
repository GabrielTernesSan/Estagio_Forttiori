package entities;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Client extends Pessoa{
    private double saldo;
    private int id;

    @Override
    public String toString() {
        return "Client{" +
                "name=" + getName() +
                ", surname=" + getSurname() +
                ", idade=" + getIdade() +
                ", saldo=" + saldo +
                ", id=" + id +
                '}';
    }
}
