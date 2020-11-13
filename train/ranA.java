package train;
import javax.swing.*;

public class ranA extends JPanel{
    ImageIcon dice1 = new ImageIcon(this.getClass().getResource("scissors.png"));
    JLabel dice = new JLabel(dice1);
    public ranA() {
        setLayout(null);
        add(dice);
        dice.setBounds(510, 250, 200, 200);
    }
}
