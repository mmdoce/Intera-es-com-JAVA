
class IntHolder {
    public int value;

    public IntHolder(int value) {
        this.value = value;
    }
}

public class PassagemPorReferenciaSimulada {

   
    public static void troca(IntHolder a, IntHolder b) {
        int c = a.value;
        a.value = b.value;
        b.value = c;
        System.out.println("Dentro do metodo troca: a = " + a.value + ", b = " + b.value);
    }

    public static void main(String[] args) {
        
        IntHolder x = new IntHolder(5);
        IntHolder y = new IntHolder(3);

        System.out.println("Antes da chamada: x = " + x.value + ", y = " + y.value);
        troca(x, y);
        System.out.println("Depois da chamada: x = " + x.value + ", y = " + y.value);
    }
}