package train;
import java.awt.*;
import javax.swing.*;
public class ran1 extends JPanel{
    int tam;
    JLabel score = new JLabel(new ImageIcon());
    String[] e = {"","paper.png","scissors.png","hammer.png"};
    ran1(){
        add(score);
        score.setBounds(0,0,150,150);
        
        tam(tam);
    }
    ran1(int tam){
        this.tam = tam;
    }
    public void ran(){
        setLayout(null);
        tam = (int)(Math.random()*3+1);
        setBounds(170, 250, 150, 150);
        score.setIcon(new ImageIcon(this.getClass().getResource(e[tam])));
        score.setBounds(0,0,150,150);
    } 
    public void tam(int tam){
        this.tam = tam;
    }
}
