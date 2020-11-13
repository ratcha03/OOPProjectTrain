package train;
import javax.swing.*;

public class rolldice extends JPanel{
    ImageIcon dice1 = new ImageIcon(this.getClass().getResource("dd.png"));
    JLabel dice = new JLabel(dice1);
    public rolldice() {
        setLayout(null);
        add(dice);
        dice.setBounds(400, 250, 200, 200);
    }
}
