import java.util.Random; // Para gerar números aleatórios
import java.util.Scanner; 

public class adivinha {
    public static void main(String args[]){
        int numero;
        int chute; 

        Random gerador = new Random(); //chamamos a função de gerar numeros peseudoaleatorios
        // Gera um número aleatório entre 1 e 7.
        // A lógica é a mesma do C: gerador.nextInt(7) gera de 0 a 6,
        // e somando 1, obtemos o intervalo de 1 a 7.
        numero = gerador.nextInt(7) + 1; 
        Scanner scanner = new Scanner(System.in);


        do{
            System.out.print("Chute um numero entre 1 e 7:  ");
            chute = scanner.nextInt();

            if(chute < numero){
                System.out.println("Baixo");
            } else if (chute > numero){
                System.out.println("Alto");
            }
        } while(chute != numero);
        System.out.println("acertou");

        scanner.close();
    }
}
