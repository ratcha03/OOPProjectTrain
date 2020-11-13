package train;
import java.awt.event.*;
import javax.swing.*;
class Win2 extends JFrame implements ActionListener{
    home2 home = new home2();
    oneplay s1 = new oneplay();
    start2 s2 = new start2();
    public Win2() {
        setTitle("Train Game");
        setSize(830,630);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        add(home);
        home.start1.addActionListener((ActionListener)this);
        home.start2.addActionListener((ActionListener)this);
        home.exit1.addActionListener((ActionListener)this);


    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==home.start1){
            this.remove(home);
            setSize(830,630);
            add(s1);
            setLocationRelativeTo(null);
            setResizable(false);
            setVisible(true);
        }
        if(e.getSource()==home.start2){
            this.remove(home);
            setSize(830,630);
            add(s2);
            setLocationRelativeTo(null);
            setResizable(false);
            setVisible(true);
        }
        if(e.getSource()==home.exit1){
            System.exit(5);
        }
        
    }
    
}
