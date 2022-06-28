package Exemplo.models;

// Classe abstrata

// Private

public abstract class Pessoa {
    private String name;
    private String cpf;
    private String matricula;

    public static int QTD_OLHOS = 2;

    public Pessoa(){}

    public Pessoa(String name, String cpf, String matricula) {
        this.name = name;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    // Public

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() < 14){
            throw new IllegalArgumentException();
        }
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public static int getQtdOlhos() {
        return QTD_OLHOS;
    }

//    public final void estudar() {
    public void estudar() {
        final int intervalo = 0;
        //intervalo++;
    }

    public abstract void ler();
}
