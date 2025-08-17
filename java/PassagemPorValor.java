public class PassagemPorValor {

    public static void troca(int a, int b) {
        int c = a;
        a = b;
        b = c;
       
        System.out.println("Dentro do metodo troca: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 3;

        System.out.println("Antes da chamada: x = " + x + ", y = " + y);
        troca(x, y);
        System.out.println("Depois da chamada: x = " + x + ", y = " + y);
    }
}