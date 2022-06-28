package EstruturaDeDados.List.Ordenacao;

import EstruturaDeDados.List.Ordenacao.classes.Animal;
import EstruturaDeDados.List.Ordenacao.classes.Contato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ListaLincada {
    public static void main(String[] args) {

        Contato c1 = new Contato("Gabriel", "Santos", "55519914865");
        Contato c2 = new Contato("Zelia", "Silva", "55519914865");
        Contato c3 = new Contato("Paola", "Santos", "55519914865");
        Contato c4 = new Contato("Gabriel", "Zarigui", "55519914865");
        Contato c5 = new Contato("Matheus", "Barbosa", "55519914865");
        Contato c6 = new Contato("Matheus", "Abner", "55519914865");

        LinkedList<Contato> agenda = new LinkedList<>();

        agenda.add(c1);
        agenda.add(c2);
        agenda.add(c3);
        agenda.add(c4);
        agenda.add(c5);
        agenda.add(c6);

        System.out.println(agenda);

        Collections.sort(agenda);

        System.out.println(agenda);

        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println();

        ArrayList<Animal> zoo = new ArrayList<>();

        Animal a1 = new Animal("Tigre", "Tigre siberiano");
        Animal a2 = new Animal("Tigre", "Tigre de Bengala");
        Animal a3 = new Animal("Elefante", "Elefante indiano");
        Animal a4 = new Animal("Elefante", "Elefante pigmeu");

        zoo.add(a1);
        zoo.add(a2);
        zoo.add(a3);
        zoo.add(a4);

        zoo.sort(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        System.out.println(zoo);

        zoo.sort((o1, o2) -> o1.getEspecie().compareTo(o2.getEspecie()));

        System.out.println(zoo);

    }
}
