package InterfaceFuncional.interfaces;

@FunctionalInterface
public interface ISenha {
    boolean Autentica(String senha1);

    default boolean validarCPF(String valor) {
            return valor.matches("(?!(\\d)\\1{10})\\d{11}");
    }
}
