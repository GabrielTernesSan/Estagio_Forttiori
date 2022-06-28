package Generic.service;

/*
O próprio Java vai nos prevenir de usar a multiplicação pro tipo genérico T; afinal,
podemos passar um String sem querer. Para corrigir isso e sinalizar que vamos utilizar
apenas números, é só fazer a seguinte alteração <T> -> <T extends Number>
 */
public class SquareGenerics<T extends Number> {

    T obj;

    public SquareGenerics(T obj){
       this.obj = obj;
    }

    public Double Square(){
        return obj.intValue() * obj.doubleValue();
    }


    /*
     “saoIguais”, checa se os dois valores absolutos são iguais.
     Se adicionarmos o T e não o ?, um erro será gerado, pois o
     Java esperará um inteiro, que é o valor do inteiro.saoIguais(),
     e se fizermos doubleTipo.saoIguais(), ele esperará um Double. Usando ?,
     deixamos claro pro Java que ele pode esperar tanto um inteiro quanto um
     double, ou seja: podemos misturar os tipos.
     */
    public boolean saoIguais(SquareGenerics<?> igual) {
        if(Math.abs(obj.doubleValue()) == Math
                .abs(igual.obj.doubleValue())) {
            return true;
        }
        return false;
    }

}
