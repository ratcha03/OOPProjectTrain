package train;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Level extends JPanel {
       
        ImageIcon pic = new ImageIcon(this.getClass().getResource("bg.jpg"));
        
        JLabel train = new JLabel(new ImageIcon(this.getClass().getResource("train.PNG")));
        JLabel name = new JLabel(new ImageIcon(this.getClass().getResource("name2.PNG")));
        ImageIcon start = new ImageIcon(this.getClass().getResource("Level1.GIF"));
        ImageIcon play = new ImageIcon(this.getClass().getResource("Level2.GIF"));
        ImageIcon exit = new ImageIcon(this.getClass().getResource("LevelExit.GIF"));
        JButton start1 = new JButton(start);
        JButton start2 = new JButton(play);
        JButton exit1 = new JButton(exit);
        
    public Level() {
        setLayout(null);
        add(train);
        train.setBounds(300, 145, 200 , 200);
        add(name);
        name.setBounds(145, 45, 550, 90);
        repaint();
        add(start1);
        add(start2);
        add(exit1);
        start1.setRolloverIcon(start);  
        start2.setRolloverIcon(play);
        exit1.setRolloverIcon(exit);
        start1.setBounds(110, 370, 200, 133);
        start2.setBounds(335, 370, 200, 133);
        exit1.setBounds(555, 370, 200, 133);
        
        
    }
   
    @Override
    public void paintComponent(Graphics g)
    {
        g.drawImage(pic.getImage(),0,0,830, 600, this);
    }
    
    
}