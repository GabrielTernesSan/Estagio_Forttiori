package Enum;

import Enum.enums.OpcoesMenu;

public class Programa {
    public static void escolheOpcao(OpcoesMenu opcao){
        if(opcao == OpcoesMenu.SALVAR){
            System.out.println("Salvando o arquivo!");
        }
        else if(opcao == OpcoesMenu.ABRIR){
            System.out.println("Abrindo o arquivo!");
        }
    }

    public static void main(String[] args) {
        escolheOpcao(OpcoesMenu.SALVAR);
        escolheOpcao(OpcoesMenu.ABRIR);
        System.out.println(OpcoesMenu.SALVAR.getValor());
        System.out.println(OpcoesMenu.IMPRMIR.getValor());
        System.out.println(OpcoesMenu.ABRIR.getValor());
        System.out.println(OpcoesMenu.VISUALIZAR.getValor());
        System.out.println(OpcoesMenu.FECHAR.getValor());
    }
}
