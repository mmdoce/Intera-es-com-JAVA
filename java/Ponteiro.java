

// A classe IntWrapper serve para guarda um valor int
class IntWrapper {
    public int valor;

    public IntWrapper(int valor) {
        this.valor = valor;
    }
}

public class Ponteiro {
    public static void main(String[] args) {
        
        int v = 5;

        System.out.println("v antes da modificacao: " + v);
        // A proxima linha e apenas para demonstrar o que acontece com a variavel 'v'

        v = v + 2;

        System.out.println("v depois da modificacao: " + v);
    
        IntWrapper p = new IntWrapper(5); 
        
       


        
        System.out.println("Valor do objeto: " + p.valor);
    }
    public static void modificarValor(IntWrapper wrapper) {
        wrapper.valor += 2; // Isso e equivalente a *p = *p + 2;
    }
}