package jogomatematico;

public class Caixa {

    private final int largura;
    private final int altura;
    
    public Caixa(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    
    public void desenhar() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
