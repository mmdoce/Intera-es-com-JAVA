import java.util.Scanner; //biblioteca necessaria para a função Scanner 
import java.util.Locale; // Nao se esqueca de importar para o programa entender o . em vez da virgula 

public class CalculadoraIMC {//mesmo nome do arquivo pra não dar confusão 
    public static void main(String[] args) { //ponto de partida assim como em c é o int main(void){....}
        double peso, altura, imc;//declaração de variaveis, em C seria  Float 

        Scanner scanner = new Scanner(System.in);  //é como o Scanf em C, Nessa linha estamos criando um objeto da classe Scanner
        //new Scanner  -> indica que a entrada do dado vai vir do teclado 
        scanner.useLocale(Locale.US); // Forca o Scanner a usar o ponto como separador decimal

        System.out.print("Peso e altura? ");//imprime na tela o texto, como o Printf em C 

        peso = scanner.nextDouble();
        altura = scanner.nextDouble();
        //scanner vai pegar esses valores 
        //nextDouble() -> fala pro programa ler o numero depois do ponto e em seguida aperte enter e digite o proximo valor no caso aqui a altura 
        // ou digite o segundo valor separado por um espaço 

        imc = peso / (altura * altura); //aqui estamos fazendo a equação matematica, em C usamos o pow em JAVA podemos usar o * para elevar o numero 


        System.out.printf("IMC = %.2f%n", imc); //imprime o resultado na tela, em C \n quebra linha em JAVA usa o %n para quebrar linha 

        scanner.close(); //equivale a return 0; em C, em java usamos para liberar a mémoria e recursos que o programa estava ultilizando 
    }
}