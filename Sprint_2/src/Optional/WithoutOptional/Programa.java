package Optional.WithoutOptional;

import Optional.WithoutOptional.models.Pessoa;

public class Programa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Gabriel", "04445736045", 21);
        Pessoa pessoa2 = new Pessoa();

        System.out.println(pessoa1.getNome().length());
        System.out.println(pessoa2.getNome().length());
    }
}