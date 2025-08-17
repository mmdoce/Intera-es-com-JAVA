import java.util.Scanner;

public class escolhas {
    public static void main(String args[]){
        int p;
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite a numeração da placa: ");

        p = scanner.nextInt();

        int numero = p %10; //aqui estamos determinando que a variavel p tem que ser queremos o ultimo digito da variavel int (inteiro)
        System.out.print("Seu rodizio é : ");

        switch (numero) { //switch case mantém a mesma sixtase de C
            case 1:
            case 2:
            System.out.println("segunda");
                break;
            case 3:
            case 4:
            System.out.println("terça");
                break;                      
            case 5:
            case 6:
            System.out.println("quarta ");
                break;    
            case 7:
            case 8:
            System.out.println("quinta");
                break;        
            default:
            System.out.println("sexta");
                break; //opcional, é boa pratica de programação 
        }

        scanner.close();
    }
}
