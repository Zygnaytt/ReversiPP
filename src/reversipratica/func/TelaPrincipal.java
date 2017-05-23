/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversipratica.func;

import javax.swing.*;
import reversipratica.visual.*;
/**
 *
 * @author u15185
 */
public class TelaPrincipal {
    private final Tabuleiro board = new Tabuleiro();
    private final Menu menu = new Menu();    
    private final int largura = 500;
    private final int altura = 500;
    private JFrame tela;
    
    
    public void initComponents(){
        initTela();
        tela.setJMenuBar(menu.getMenuBar());
        tela.add(board.getPainel());
        //FINALIZACAO DA INICIALIZACAO
        tela.setVisible(true);
    }
    
    public void initTela(){
        //INICIALIZACAO DA TELA
        tela = new JFrame("Reversi_PP");
        tela.setSize(largura, altura);
        tela.setLocationRelativeTo(null);
        tela.setResizable(false);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public int getAltura(){
        return this.altura;
    }
    public int getLargura(){
        return this.largura;
    }
    public JFrame getTela(){
        return this.tela;
    }
}
