package Exemplo.interfaces;

// Interface
@FunctionalInterface
public interface ISenha {
    public String Autentica(Integer senha);
    //public int TentativasDelogin();
    default void Autenticando(){
        System.out.println("Fazendo autenticação...");
    }
}
