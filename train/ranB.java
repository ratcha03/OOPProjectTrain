package train;
import javax.swing.*;

public class ranB extends JPanel{
    ImageIcon dice1 = new ImageIcon(this.getClass().getResource("hammer.png"));
    JLabel dice = new JLabel(dice1);
    public ranB() {
        setLayout(null);
        add(dice);
        dice.setBounds(430, 120, 200, 200);
    }
}
