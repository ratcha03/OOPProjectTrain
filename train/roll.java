package train;
import java.awt.*;
import javax.swing.*;
public class roll extends JPanel{
    int tam;
    JLabel score = new JLabel(new ImageIcon());
    String[] e = {"","dice1.png","dice2.png","dice3.png","dice4.png","dice5.png","dice6.png"};
    roll(){
        add(score);
        score.setBounds(0,0,150,150);
        
        tam(tam);
    }
    roll(int tam){
        this.tam = tam;
    }
    public void roll(){
        setLayout(null);
        tam = (int)(Math.random()*6+1);
        setBounds(250, 250, 150, 150);
        score.setIcon(new ImageIcon(this.getClass().getResource(e[tam])));
        score.setBounds(0,0,150,150);
    } 
    public void tam(int tam){
        this.tam = tam;
    }
}
