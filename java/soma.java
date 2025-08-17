import java.util.Scanner;

public class soma {
    public static void main(String args[]){

        int n; 
        int s =0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o numero, (ex:23 que é igual a 2+3=5):     ");

        n =scanner.nextInt();

       

        while (n>0) { 
            s+=n%10;
            n/=10;
        }

        System.out.println("soma dos digitos:  "+s);

        scanner.close();
    }
}
