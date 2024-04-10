package jogomatematico;

public class JogoMatematico {

        int tentativas = 5;
        int pontos = 0;
        int rodadas = 0; 
    
    
    public static void main(String[] args) {
        Caixa caixa = new Caixa(10, 10);
        Game game = new Game();
        caixa.desenhar();
        game.NewClass();
        
    }
}

