package train;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class home extends JPanel  implements ActionListener{
        ImageIcon pic = new ImageIcon(this.getClass().getResource("bg.jpg"));
         oneplay one = new oneplay();
        start2 one2 = new start2();
        
        JLabel train = new JLabel(new ImageIcon(this.getClass().getResource("train.PNG")));
        JLabel name = new JLabel(new ImageIcon(this.getClass().getResource("name2.PNG")));
        ImageIcon start = new ImageIcon(this.getClass().getResource("1player.GIF"));
        ImageIcon play = new ImageIcon(this.getClass().getResource("2player.GIF"));
        ImageIcon exit = new ImageIcon(this.getClass().getResource("exit.GIF"));
        JButton start1 = new JButton(start);
        JButton start2 = new JButton(play);
        JButton exit1 = new JButton(exit);
        
    public home() {
        setLayout(null);
        add(train);
        train.setBounds(300, 145, 200 , 200);
        add(name);
        name.setBounds(145, 45, 550, 90);
        repaint();
        add(start1);
        add(start2);
        add(exit1);
        start1.addActionListener((ActionListener)this);
        start2.addActionListener((ActionListener)this);
        exit1.addActionListener((ActionListener)this);
        start1.setRolloverIcon(start);  
        start2.setRolloverIcon(play);
        exit1.setRolloverIcon(exit);
        start1.setBounds(110, 370, 150, 75);
        start2.setBounds(335, 370, 150, 75);
        exit1.setBounds(555, 370, 150, 75);
    }
     @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==start1){
            this.remove(train);
            this.remove(name);
            this.remove(start1);
            this.remove(start2);
            this.remove(exit1);
            this.setLayout(null);
            this.setSize(830,630);
            this.add(one);
            one.setBounds(0,0,830,630);
        }
        if(e.getSource()==start2){
            this.remove(train);
            this.remove(name);
            this.remove(start1);
            this.remove(start2);
            this.remove(exit1);
            this.setLayout(null);
            this.setSize(830,630);
            this.add(one2);
            one2.setBounds(0,0,830,630);
        }
        if(e.getSource()==exit1){
            System.exit(5);
        }
        
    }
    @Override
    public void paintComponent(Graphics g)
    {
        g.drawImage(pic.getImage(),0,0,830, 600, this);
    }
}