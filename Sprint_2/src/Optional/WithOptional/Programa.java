package Optional.WithOptional;

import Optional.WithOptional.models.Pessoa;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Programa {
    public static void main(String[] args) {

        // Empty
        System.out.println("Empty");
        Optional<Integer> numero = Optional.empty();

        System.out.println(numero);

        Pessoa pessoa1 = new Pessoa("Gabriel", "04445736045", 21);
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa("Leticia", "04445736045", 20);
        Pessoa pessoa4 = new Pessoa("Melissa", "04445736045", 19);

        // Of
        System.out.println("Of");
        Optional<String> retorno1 = Optional.of(pessoa1.getNome());
        System.out.println(retorno1);

        // OfNullable
        System.out.println("OfNullable");
        Optional<String> retorno2 = Optional.ofNullable(pessoa2.getNome());
        System.out.println(retorno2);

        // filter
        System.out.println("Filter");
        Optional<Integer> num2 = Optional.of((int) (Math.random() * 1000));
        Optional<Integer> retorno3 = num2.filter(num -> num % 2 == 0);

        System.out.println(retorno3);

        // isPresent
        System.out.println("isPresent");
        if(retorno3.isPresent()){
            //get
            System.out.println("get");
            int valor = retorno3.get();
            System.out.println(valor);
        } else {
            System.out.println("Numero não encontrado");
        }

        // ifPresent
        System.out.println("ifPresent");
        Optional<Integer> retorno4 = Optional.of(pessoa2.getIdade());
        retorno4.ifPresent(idade -> System.out.println(Math.pow(idade, 2)));

        System.out.println("map");
        List<Pessoa> grupo = new ArrayList<>();
        grupo.add(pessoa1);
        grupo.add(pessoa2);
        grupo.add(pessoa3);
        grupo.add(pessoa4);

        System.out.println(Optional.ofNullable(pessoa1).map(Pessoa::getNome));

    }
}
