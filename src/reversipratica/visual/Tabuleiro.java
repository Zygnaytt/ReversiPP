package reversipratica.visual;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Tabuleiro {
    private final JPanel painel = new JPanel();
    private final JButton[][] reversiQuadradinhos = new JButton[8][8];
    private JPanel reversiTabuleiro;
    private static final String COLS = "12345678";
    
    public Tabuleiro(){
        initTabuleiro();
    }
    
    private void initTabuleiro(){
        //INICIALIZACAO DO TABULEIRO
        //gui.setBorder(new EmptyBorder(5, 5, 5, 5));
	reversiTabuleiro = new JPanel(new GridLayout(0, 9));
        reversiTabuleiro.setBorder(new LineBorder(Color.BLACK));
       	painel.add(reversiTabuleiro);

       	Insets buttonMargin = new Insets(0,0,0,0);
        for(int ii = 0; ii < reversiQuadradinhos.length; ii++){
            for(int jj = 0; jj < reversiQuadradinhos[ii].length; jj++){
                JButton btn = new JButton();
                btn.setMargin(buttonMargin);
                ImageIcon icone = new ImageIcon(new BufferedImage(40, 40, BufferedImage.TYPE_INT_ARGB));
                btn.setIcon(icone);
                btn.setBackground(Color.GREEN.darker());
                
                reversiQuadradinhos[jj][ii] = btn;
                
            }
       	}
        
        reversiTabuleiro.add(new JLabel(""));
        for(int ii = 0; ii < 8; ii++){
            reversiTabuleiro.add(new JLabel(COLS.substring(ii, ii + 1),SwingConstants.CENTER));
        }
        
        for(int ii = 0; ii < 8; ii++){
            for(int jj = 0; jj < 8; jj++){
                switch(jj){
                    case 0:{
                        reversiTabuleiro.add(new JLabel("" + (ii + 1),SwingConstants.CENTER));
                    }
                    default:{
                        reversiTabuleiro.add(reversiQuadradinhos[jj][ii]);
                    }
                }   
            }
        }
    }
    
    public JComponent getPainel(){
        return painel;
    }
}
