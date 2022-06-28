package Final;

import Final.models.Carro;
import Final.models.Comprador;

public class Program {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Vermelho", "SUV", 1351351);

        System.out.println(carro1.COMPRADOR);

        Carro carro2 = new Carro("Azul", "Esportivo", 6546546);

        Comprador compradorCarro2 = new Comprador("Juliana", 5614.15);

        // carro2.COMPRADOR = compradorCarro2;

        carro2.COMPRADOR.setNome("Juliana");
        carro2.COMPRADOR.setSalario(1524.51);

        System.out.println(carro2.COMPRADOR);
    }

}
