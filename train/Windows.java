package train;
import java.awt.event.*;
import javax.swing.*;
class Windows extends JFrame implements ActionListener{
    Level Level = new Level();
    home s1 = new home();
    Level2 s2 = new Level2();
    public Windows() {
        setTitle("Train Game");
        setSize(830,630);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        add(Level);
        Level.start1.addActionListener((ActionListener)this);
        Level.start2.addActionListener((ActionListener)this);
        Level.exit1.addActionListener((ActionListener)this);


    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==Level.start1){
            this.remove(Level);
            this.setSize(830,630);
            this.add(s1);
            s1.requestFocusInWindow();
            setLocationRelativeTo(null);
            setResizable(false);
            setVisible(true);
        }
        if(e.getSource()==Level.start2){
            this.remove(Level);
            setSize(830,630);
            add(s2);
            setLocationRelativeTo(null);
            setResizable(false);
            setVisible(true);
        }
        if(e.getSource()==Level.exit1){
            System.exit(5);
        }
        
    }
    
}
