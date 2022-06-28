package program;

import entities.Client;
import entities.Pessoa;

public class Programa {
    public static void main(String[] args) {
        Pessoa pessoa = Pessoa.builder()
                .name("Gabriel")
                .surname("Ternes")
                .idade(21)
                .build();

        Pessoa pessoa1 = new Pessoa("Julia", "Fernandes", 22);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setName("Gustavo");
        pessoa2.setSurname("Shultz");
        pessoa2.setIdade(32);

        System.out.println(pessoa);
        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa.equals(pessoa1));

        System.out.println();

        Client client = Client.builder()
                .name("Julio")
                .surname("Santos")
                .idade(45)
                .saldo(45.60)
                .id(4)
                .build();

        System.out.println(client);
    }
}
