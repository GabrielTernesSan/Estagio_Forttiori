package Generic.service;

public class SquareService {

    public int inteiro;

    public double flutuante;

    public SquareService(int inteiro) {
        this.inteiro = inteiro;
    }

    public SquareService(double flutuante) {
        this.flutuante = flutuante;
    }

    public int SquareInt() {
        return inteiro * inteiro;
    }
    public double SquareDouble() {
        return flutuante * flutuante;
    }
}
