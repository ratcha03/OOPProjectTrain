package train;
import javax.swing.*;
import java.awt.*;
public class homeCom extends JPanel  {
        ImageIcon pic = new ImageIcon(this.getClass().getResource("bgCom.jpg"));
        ImageIcon start = new ImageIcon(this.getClass().getResource("1player.GIF"));
        ImageIcon play = new ImageIcon(this.getClass().getResource("2player.GIF"));
        ImageIcon exit = new ImageIcon(this.getClass().getResource("exit.GIF"));
        JButton start1 = new JButton(start);
        JButton start2 = new JButton(play);
        JButton exit1 = new JButton(exit);
    public homeCom() {
        setLayout(null);
        repaint();
        add(start1);
        add(start2);
        add(exit1);
        start1.setRolloverIcon(start);  
        start2.setRolloverIcon(play);
        exit1.setRolloverIcon(exit);
        start1.setBounds(110, 370, 150, 75);
        start2.setBounds(335, 370, 150, 75);
        exit1.setBounds(555, 370, 150, 75);
    }
    @Override
    public void paintComponent(Graphics g)
    {
        g.drawImage(pic.getImage(),0,0,830, 600, this);
    }
}