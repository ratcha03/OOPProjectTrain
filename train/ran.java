package train;
import javax.swing.*;
public class ran extends JPanel{
    ImageIcon dice1 = new ImageIcon(this.getClass().getResource("paper.png"));
    JLabel dice = new JLabel(dice1);
    public ran() {
        setLayout(null);
        add(dice);
        dice.setBounds(345, 250, 200, 200);
    }
}
