package reversipratica.func;


public class Regras {
    private final String regras;
    
    public Regras(){
        regras  ="    Othello tambem conhecido como Reversi e um jogo para dois jogadores , jogado \n" +
                    "em um tabuleiro de 8x8 onde inicialmente sao colocadas 4 pecas ao centro , duas \n" +
                    "de cada cor em diagonais. A peca preta faz sempre o primeiro movimento e os \n" +
                    "jogadores jogam alternadamente , o jogo tem como meta capturar as pecas adversarias \n" +
                    "e transforma-las nas da sua cor , vence quem tiver mais pecas ao seu favor no final \n" +
                    "da partida. \n" +
                    "    O jogo acaba quando nao ha mais casas a se jogarem dentro do tabuleiro ou quando \n" +
                    "nao houver mais jogadas possiveis dentro das regras para ambos os jogadores. \n" +
                    "\n" +
                    "\n" +
                    "Fonte: 'http://othelloclassic.blogspot.com.br/2010/06/regras-do-jogo.html'\n";
    };
    
    public String getRegras(){
        return regras;
    }
}
