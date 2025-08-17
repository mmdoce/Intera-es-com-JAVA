import java.util.Scanner;

public class VerificadorSenha {
    public static void main(String[] args) {
        // definimos a senha 
        String senhaCorreta = "abracadabra";
        // Variável para armazenar a senha digitada pelo usuário
        String senhaDigitada;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Senha? ");
        senhaDigitada = scanner.nextLine();

        // Compara a senha digitada com a senha correta usando .equals()
        // A comparação de strings em Java é feita por valor, não por referência
        if (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Ok!");
        } else {
            System.out.println("Senha invalida!");
        }
        scanner.close();
    }
}