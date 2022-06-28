package Exemplo.models;

public class Funcionario extends Pessoa{
    protected Double salario;

    public Funcionario() {}

    @Override
    public void ler() {

    }

//    public abstract trabalhar();

    public Funcionario(String name, String cpf, String matricula, Double salario) {
        super(name, cpf, matricula);
        this.salario = salario;
    }

   // Protect

    protected double getSalario() {
        return salario;
    }

    protected void setSalario(Double salario) {
        this.salario = salario;
    }
}
