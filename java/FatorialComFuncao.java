public class FatorialComFuncao {

    
    //Calcula o fatorial de um número inteiro não negativo.
     //@param n O número para o qual o fatorial será calculado.
     //@return O resultado do fatorial, usando o tipo 'long' para suportar valores grandes.
    //
    public static long fat(int n) {
        long f = 1;
    
        
        // Loop para calcular o fatorial
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        
        return f;
    }

    public static void main(String args[]) {
        // Declaração de variáveis
        int numeroParaCalcular = 5;

        // Chama o método fat() para calcular o fatorial do número
        long resultado = fat(numeroParaCalcular);

        // Exibe o resultado
        // Verificamos se houve erro antes de exibir o resultado
        if (resultado != -1) {
            System.out.println("Fatorial do " + numeroParaCalcular + " é:  " + resultado);
        }
    }
}