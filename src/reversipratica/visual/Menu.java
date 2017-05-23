
package reversipratica.visual;

import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import reversipratica.func.Regras;


public final class Menu {
    private JMenuBar menu;
    private final Regras rgr = new Regras();
    
    public Menu(){
        initMenu();
    }

    public void initMenu(){
        //INICIALIZACAO DO MENU
        menu = new JMenuBar();
        menu.setSize(500, 25);
        
        //  itens do menu
        JMenu jogo = new JMenu("Jogo");
        menu.add(jogo);
        
        //      subitens do menu "jogo"
        JMenuItem novo = new JMenuItem("Novo");
        jogo.add(novo);
        JMenuItem carregar = new JMenuItem("Carregar");
        jogo.add(carregar);
        JMenuItem salvar = new JMenuItem("Salvar");
        jogo.add(salvar);
        JSeparator separador = new JSeparator(SwingConstants.HORIZONTAL);
        jogo.add(separador);
        JMenuItem sair = new JMenuItem("Sair");
        jogo.add(sair);
        
        JMenuItem sobre = new JMenuItem("Sobre");
        
        
        sobre.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, rgr.getRegras());
        });
        menu.add(sobre);
        
        menu.setVisible(true);
    }
    
    public JMenuBar getMenuBar(){
        return this.menu;
    }
}