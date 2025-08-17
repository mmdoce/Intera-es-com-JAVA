class No { // A classe No é o equivalente da 'struct no' em C.
    int item;
    No prox; // Em Java, uma variável de referência para um objeto No, o equivalente ao 'Ptr prox'

    // O construtor é usado para inicializar o item e o próximo no.
    public No(int item, No prox) {
        this.item = item;
        this.prox = prox;
    }
}

public class ListaEncadeada {


    public static void main(String[] args) {
       
       
        No p = new No(3, new No(1, new No(5, null)));
        
        // O loop 'while' para percorrer a lista é traduzido diretamente.
        while (p != null) {
            
            System.out.println(p.item); 
            
            
            p = p.prox;
        }
    }
}