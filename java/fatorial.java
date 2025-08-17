import java.util.Scanner;

public class fatorial {
    public static void main(String args[]){
        int n;
        long f = 1; // Variável para armazenar o resultado do fatorial. Usamos 'long' para evitar overflow com números grandes.
        Scanner scanner = new Scanner(System.in); //declarando que a entrada do dado vem do teclado

        System.out.print("Digite o numero: ");

        n = scanner.nextInt(); //padrão pra guardar a variavel, se fosse um double so mudaria o final (scanner.nextDouble)

        f = 1;
        for (int i=2;i<=n;i++){ //mesma sintaxe do laço for em C 
            f*= i; } //fica assim pois é abreviação de f = f *i;

            System.out.printf("faotiral desse numero é:  "+ f); //diferente de C voce pode só colocar o + pra imprimir o resultado 
        
scanner.close();
    }
    
}
