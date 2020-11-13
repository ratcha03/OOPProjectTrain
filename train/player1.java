package train;
import javax.swing.*;
public class player1 extends JPanel{
    int x=70,
        y=500,
        limit=1;
    ImageIcon  player1 = new ImageIcon(this.getClass().getResource("ply1.PNG"));
    ImageIcon  player2 = new ImageIcon(this.getClass().getResource("ply2.PNG"));
    public player1() {
    }
    player1(int x ,int y,int limit) {
        setxy(x,y);
    }
    public void setxy(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void setlimit(int limit){
    this.limit = limit;
    }
}