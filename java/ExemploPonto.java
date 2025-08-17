// A classe Ponto é o equivalente à struct Ponto em C.
// Ela guarda os dados (coordenadas x e y).
class Ponto {
    float x;
    float y;
    
    // Para inicializar as coordenadas do ponto
    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }
}

public class ExemploPonto {
    public static void main(String[] args) {
        // Cria uma classe Ponto
        // passa as cordenadas com x e y para o programa 
        Ponto p = new Ponto(1.5f, 2.5f);

        // Acessa os campos do objeto 'p' para imprimir os valores.
        System.out.printf("(%.1f, %.1f)%n", p.x, p.y);
    }
}
