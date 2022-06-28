package Final.models;

public class Carro {
    private String cor;
    private String modelo;
    private Integer numeroChassi;

    public final Comprador COMPRADOR = new Comprador("Marcio", 150000.00);

    public Carro(String cor, String modelo, Integer numeroChassi) {
        this.cor = cor;
        this.modelo = modelo;
        this.numeroChassi = numeroChassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(Integer numeroChassi) {
        this.numeroChassi = numeroChassi;
    }
}
