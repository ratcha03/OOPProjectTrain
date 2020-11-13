package train;
import java.awt.event.*;
import javax.swing.*;
class Win1 extends JFrame implements ActionListener{
    home1 home1 = new home1();
    oneplay s1 = new oneplay();
    start2 s2 = new start2();
    public Win1() {
        setTitle("Train Game");
        setSize(830,630);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        add(home1);
        home1.start1.addActionListener((ActionListener)this);
        home1.start2.addActionListener((ActionListener)this);
        home1.exit1.addActionListener((ActionListener)this);


    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==home1.start1){
            this.remove(home1);
            setSize(830,630);
            add(s1);
            setLocationRelativeTo(null);
            setResizable(false);
            setVisible(true);
        }
        if(e.getSource()==home1.start2){
            this.remove(home1);
            setSize(830,630);
            add(s2);
            setLocationRelativeTo(null);
            setResizable(false);
            setVisible(true);
        }
        if(e.getSource()==home1.exit1){
            System.exit(5);
        }
        
    }
    
}
