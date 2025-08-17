import java.util.Scanner;

public class medias {

    public static float media (float[] v) {
        float soma = 0;
        
        // Loop para somar todos os elementos 
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }

        // Retorna a soma dividida pelo número de elementos
        return soma / v.length;
    }

    public static void main(String[] args) {
       
        int n;
        
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Quantidade de numeros? ");
        n = scanner.nextInt();

        float[] v = new float[n];
        
        for (int i = 0; i < n; i++) {
            System.out.printf("%d do numero? ", i + 1);
            v[i] = scanner.nextFloat();
        }

     
        System.out.printf("Media = %.2f%n", media(v));
      
        scanner.close();
    }
}