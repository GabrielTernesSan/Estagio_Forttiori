package Exemplo.enums;
// Enum
	
public enum TamanhoUniforme {
    P{
        @Override
        public double ValorUniforme(){
            return 159.99;
        }
    },
    PP{
        @Override
        public double ValorUniforme(){
            return 169.99;
        }
    },
    M{
        @Override
        public double ValorUniforme(){
            return 179.99;
        }
    },
    G{
        @Override
        public double ValorUniforme(){
            return 189.99;
        }
    },
    GG{
        @Override
        public double ValorUniforme(){
            return 199.99;
        }
    };

    public abstract double ValorUniforme();
}


