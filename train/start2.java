package train;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class start2 extends JPanel implements MouseListener, ActionListener {

    rolldice dice = new rolldice();
    ImageIcon bg = new ImageIcon(this.getClass().getResource("table.png"));
    roll roll = new roll();
    player1 play11 = new player1();
    player1 play12 = new player1();
    player1 play13 = new player1();
    player1 play14 = new player1();
    player1 play15 = new player1();
    player1 play16 = new player1();
    player1 play17 = new player1();
    player1 play18 = new player1();
    player1 play21 = new player1();
    player1 play22 = new player1();
    player1 play23 = new player1();
    player1 play24 = new player1();
    player1 play25 = new player1();
    player1 play26 = new player1();
    player1 play27 = new player1();
    player1 play28 = new player1();

    int count = 1;

    public start2() {

        setLayout(null);
        add(dice.dice);
        add(roll);
        add(play11);
        add(play12);
        add(play13);
        add(play14);
        add(play15);
        add(play16);
        add(play17);
        add(play18);

        add(play21);
        add(play22);
        add(play23);
        add(play24);
        add(play25);
        add(play26);
        add(play27);
        add(play28);
        repaint();
        play11.limit = 1;
        play12.limit = 2;
        play13.limit = 3;
        play14.limit = 4;
        play15.limit = 5;
        play16.limit = 6;
        play17.limit = 7;
        play18.limit = 8;
        play21.limit = 15;
        play22.limit = 16;
        play23.limit = 17;
        play24.limit = 18;
        play25.limit = 19;
        play26.limit = 20;
        play27.limit = 21;
        play28.limit = 22;
        dice.dice.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                if (count % 2 == 0) {

                    roll.roll();
                    count += 1;

                    for (int i = 1; i <= roll.tam; i++) {

                        if (play21.limit >= 1 && play21.limit < 8) {
                            play21.limit++;
                            play21.x += 92;
                        } else if (play21.limit >= 8 && play21.limit < 15) {
                            play21.limit++;
                            play21.y -= 65;
                        } else if (play21.limit >= 15 && play21.limit < 22) {
                            play21.limit++;
                            play21.x -= 92;
                        } else if (play21.limit >= 22 && play21.limit < 29) {
                            play21.limit++;
                            play21.y += 65;
                        } else if (play21.limit == 29) {
                            play21.limit = 2;
                            play21.x += 92;
                        }

                        if (play22.limit >= 1 && play22.limit < 8) {
                            play22.limit++;
                            play22.x += 92;
                        } else if (play22.limit >= 8 && play22.limit < 15) {
                            play22.limit++;
                            play22.y -= 65;
                        } else if (play22.limit >= 15 && play22.limit < 22) {
                            play22.limit++;
                            play22.x -= 92;
                        } else if (play22.limit >= 22 && play22.limit < 29) {
                            play22.limit++;
                            play22.y += 65;
                        } else if (play22.limit == 29) {
                            play22.limit = 2;
                            play22.x += 92;
                        }

                        if (play23.limit >= 1 && play23.limit < 8) {
                            play23.limit++;
                            play23.x += 92;
                        } else if (play23.limit >= 8 && play23.limit < 15) {
                            play23.limit++;
                            play23.y -= 65;
                        } else if (play23.limit >= 15 && play23.limit < 22) {
                            play23.limit++;
                            play23.x -= 92;
                        } else if (play23.limit >= 22 && play23.limit < 29) {
                            play23.limit++;
                            play23.y += 65;
                        } else if (play23.limit == 29) {
                            play23.limit = 2;
                            play23.x += 92;
                        }

                        if (play24.limit >= 1 && play24.limit < 8) {
                            play24.limit++;
                            play24.x += 92;
                        } else if (play24.limit >= 8 && play24.limit < 15) {
                            play24.limit++;
                            play24.y -= 65;
                        } else if (play24.limit >= 15 && play24.limit < 22) {
                            play24.limit++;
                            play24.x -= 92;
                        } else if (play24.limit >= 22 && play24.limit < 29) {
                            play24.limit++;
                            play24.y += 65;
                        } else if (play24.limit == 29) {
                            play24.limit = 2;
                            play24.x += 92;
                        }

                        if (play25.limit >= 1 && play25.limit < 8) {
                            play25.limit++;
                            play25.x += 92;
                        } else if (play25.limit >= 8 && play25.limit < 15) {
                            play25.limit++;
                            play25.y -= 65;
                        } else if (play25.limit >= 15 && play25.limit < 22) {
                            play25.limit++;
                            play25.x -= 92;
                        } else if (play25.limit >= 22 && play25.limit < 29) {
                            play25.limit++;
                            play25.y += 65;
                        } else if (play25.limit == 29) {
                            play25.limit = 2;
                            play25.x += 92;
                        }

                        if (play26.limit >= 1 && play26.limit < 8) {
                            play26.limit++;
                            play26.x += 92;
                        } else if (play26.limit >= 8 && play26.limit < 15) {
                            play26.limit++;
                            play26.y -= 65;
                        } else if (play26.limit >= 15 && play26.limit < 22) {
                            play26.limit++;
                            play26.x -= 92;
                        } else if (play26.limit >= 22 && play26.limit < 29) {
                            play26.limit++;
                            play26.y += 65;
                        } else if (play26.limit == 29) {
                            play26.limit = 2;
                            play26.x += 92;
                        }

                        if (play27.limit >= 1 && play27.limit < 8) {
                            play27.limit++;
                            play27.x += 92;
                        } else if (play27.limit >= 8 && play27.limit < 15) {
                            play27.limit++;
                            play27.y -= 65;
                        } else if (play27.limit >= 15 && play27.limit < 22) {
                            play27.limit++;
                            play27.x -= 92;
                        } else if (play27.limit >= 22 && play27.limit < 29) {
                            play27.limit++;
                            play27.y += 65;
                        } else if (play27.limit == 29) {
                            play27.limit = 2;
                            play27.x += 92;
                        }

                        if (play28.limit >= 1 && play28.limit < 8) {
                            play28.limit++;
                            play28.x += 92;
                        } else if (play28.limit >= 8 && play28.limit < 15) {
                            play28.limit++;
                            play28.y -= 65;
                        } else if (play28.limit >= 15 && play28.limit < 22) {
                            play28.limit++;
                            play28.x -= 92;
                        } else if (play28.limit >= 22 && play28.limit < 29) {
                            play28.limit++;
                            play28.y += 65;
                        } else if (play28.limit == 29) {
                            play28.limit = 2;
                            play28.x += 92;
                        }
                        System.out.println(".mouseClicked()" + play18.limit + "   " + play11.limit);
                        if (play28.limit == play18.limit) {
                            play18.y = 600;
                            play18.x = 2000;
                            new Win2();
                        }
                        if (play28.limit == play17.limit) {
                            play17.y = 600;
                            play17.x = 2000;
                        }
                        if (play28.limit == play16.limit) {
                            play16.y = 600;
                            play16.x = 2000;
                        }
                        if (play28.limit == play15.limit) {
                            play15.y = 600;
                            play15.x = 2000;
                        }
                        if (play28.limit == play14.limit) {
                            play14.y = 600;
                            play14.x = 2000;
                        }
                        if (play28.limit == play13.limit) {
                            play13.y = 600;
                            play13.x = 2000;
                        }
                        if (play28.limit == play12.limit) {
                            play12.y = 600;
                            play12.x = 2000;
                        }
                        if (play28.limit == play11.limit) {
                            play11.y = 600;
                            play11.x = 2000;
                        }
                        repaint();

                    }

                } else if (count % 2 == 1) {

                    roll.roll();
                    count += 1;

                    for (int i = 1; i <= roll.tam; i++) {

                        if (play11.limit >= 1 && play11.limit < 8) {
                            play11.limit++;
                            play11.x += 92;
                        } else if (play11.limit >= 8 && play11.limit < 15) {
                            play11.limit++;
                            play11.y -= 65;
                        } else if (play11.limit >= 15 && play11.limit < 22) {
                            play11.limit++;
                            play11.x -= 92;
                        } else if (play11.limit >= 22 && play11.limit < 29) {
                            play11.limit++;
                            play11.y += 65;
                        } else if (play11.limit == 29) {
                            play11.limit = 2;
                            play11.x += 92;
                        }

                        if (play12.limit >= 1 && play12.limit < 8) {
                            play12.limit++;
                            play12.x += 92;
                        } else if (play12.limit >= 8 && play12.limit < 15) {
                            play12.limit++;
                            play12.y -= 65;
                        } else if (play12.limit >= 15 && play12.limit < 22) {
                            play12.limit++;
                            play12.x -= 92;
                        } else if (play12.limit >= 22 && play12.limit < 29) {
                            play12.limit++;
                            play12.y += 65;
                        } else if (play12.limit == 29) {
                            play12.limit = 2;
                            play12.x += 92;
                        }

                        if (play13.limit >= 1 && play13.limit < 8) {
                            play13.limit++;
                            play13.x += 92;
                        } else if (play13.limit >= 8 && play13.limit < 15) {
                            play13.limit++;
                            play13.y -= 65;
                        } else if (play13.limit >= 15 && play13.limit < 22) {
                            play13.limit++;
                            play13.x -= 92;
                        } else if (play13.limit >= 22 && play13.limit < 29) {
                            play13.limit++;
                            play13.y += 65;
                        } else if (play13.limit == 29) {
                            play13.limit = 2;
                            play13.x += 92;
                        }

                        if (play14.limit >= 1 && play14.limit < 8) {
                            play14.limit++;
                            play14.x += 92;
                        } else if (play14.limit >= 8 && play14.limit < 15) {
                            play14.limit++;
                            play14.y -= 65;
                        } else if (play14.limit >= 15 && play14.limit < 22) {
                            play14.limit++;
                            play14.x -= 92;
                        } else if (play14.limit >= 22 && play14.limit < 29) {
                            play14.limit++;
                            play14.y += 65;
                        } else if (play14.limit == 29) {
                            play14.limit = 2;
                            play14.x += 92;
                        }

                        if (play15.limit >= 1 && play15.limit < 8) {
                            play15.limit++;
                            play15.x += 92;
                        } else if (play15.limit >= 8 && play15.limit < 15) {
                            play15.limit++;
                            play15.y -= 65;
                        } else if (play15.limit >= 15 && play15.limit < 22) {
                            play15.limit++;
                            play15.x -= 92;
                        } else if (play15.limit >= 22 && play15.limit < 29) {
                            play15.limit++;
                            play15.y += 65;
                        } else if (play15.limit == 29) {
                            play15.limit = 2;
                            play15.x += 92;
                        }

                        if (play16.limit >= 1 && play16.limit < 8) {
                            play16.limit++;
                            play16.x += 92;
                        } else if (play16.limit >= 8 && play16.limit < 15) {
                            play16.limit++;
                            play16.y -= 65;
                        } else if (play16.limit >= 15 && play16.limit < 22) {
                            play16.limit++;
                            play16.x -= 92;
                        } else if (play16.limit >= 22 && play16.limit < 29) {
                            play16.limit++;
                            play16.y += 65;
                        } else if (play16.limit == 29) {
                            play16.limit = 2;
                            play16.x += 92;
                        }

                        if (play17.limit >= 1 && play17.limit < 8) {
                            play17.limit++;
                            play17.x += 92;
                        } else if (play17.limit >= 8 && play17.limit < 15) {
                            play17.limit++;
                            play17.y -= 65;
                        } else if (play17.limit >= 15 && play17.limit < 22) {
                            play17.limit++;
                            play17.x -= 92;
                        } else if (play17.limit >= 22 && play17.limit < 29) {
                            play17.limit++;
                            play17.y += 65;
                        } else if (play17.limit == 29) {
                            play17.limit = 2;
                            play17.x += 92;
                        }

                        if (play18.limit >= 1 && play18.limit < 8) {
                            play18.limit++;
                            play18.x += 92;
                        } else if (play18.limit >= 8 && play18.limit < 15) {
                            play18.limit++;
                            play18.y -= 65;
                        } else if (play18.limit >= 15 && play18.limit < 22) {
                            play18.limit++;
                            play18.x -= 92;
                        } else if (play18.limit >= 22 && play18.limit < 29) {
                            play18.limit++;
                            play18.y += 65;
                        } else if (play18.limit == 29) {
                            play18.limit = 2;
                            play18.x += 92;
                        }

                        if (play18.limit == play28.limit) {
                            play28.y = 500;
                            play28.x = 2000;
                            new Win1();
                        }
                        if (play18.limit == play27.limit) {
                            play27.y = 500;
                            play27.x = 2000;
                        }
                        if (play18.limit == play26.limit) {
                            play26.y = 500;
                            play26.x = 2000;
                        }
                        if (play18.limit == play25.limit) {
                            play25.y = 500;
                            play25.x = 2000;
                        }
                        if (play18.limit == play24.limit) {
                            play24.y = 500;
                            play24.x = 2000;
                        }
                        if (play18.limit == play23.limit) {
                            play23.y = 500;
                            play23.x = 2000;
                        }
                        if (play18.limit == play22.limit) {
                            play22.y = 500;
                            play22.x = 2000;
                        }
                        if (play18.limit == play21.limit) {
                            play21.y = 500;
                            play21.x = 2000;
                        }
                        repaint();

                    }

                }

                repaint();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public void paintComponent(Graphics g) {
        g.drawImage(bg.getImage(), 0, 0, 825, 600, this);
        g.drawImage(play11.player1.getImage(), play11.x, play11.y, 50, 50, this);
        g.drawImage(play12.player1.getImage(), play12.x + 92, play12.y, 50, 50, this);
        g.drawImage(play13.player1.getImage(), play13.x + (92 * 2), play13.y, 50, 50, this);
        g.drawImage(play14.player1.getImage(), play14.x + (92 * 3), play14.y, 50, 50, this);
        g.drawImage(play15.player1.getImage(), play15.x + (92 * 4), play15.y, 50, 50, this);
        g.drawImage(play16.player1.getImage(), play16.x + (92 * 5), play16.y, 50, 50, this);
        g.drawImage(play17.player1.getImage(), play17.x + (92 * 6), play17.y, 50, 50, this);
        g.drawImage(play18.player1.getImage(), play18.x + (92 * 7), play18.y, 50, 50, this);

        g.drawImage(play21.player2.getImage(), play21.x + 645, play21.y - 455, 50, 50, this);
        g.drawImage(play22.player2.getImage(), play22.x + 645 - (92), play22.y - 455, 50, 50, this);
        g.drawImage(play23.player2.getImage(), play23.x + 645 - (92 * 2), play23.y - 455, 50, 50, this);
        g.drawImage(play24.player2.getImage(), play24.x + 645 - (92 * 3), play24.y - 455, 50, 50, this);
        g.drawImage(play25.player2.getImage(), play25.x + 645 - (92 * 4), play25.y - 455, 50, 50, this);
        g.drawImage(play26.player2.getImage(), play26.x + 645 - (92 * 5), play26.y - 455, 50, 50, this);
        g.drawImage(play27.player2.getImage(), play27.x + 645 - (92 * 6), play27.y - 455, 50, 50, this);
        g.drawImage(play28.player2.getImage(), play28.x + 645 - (92 * 7), play28.y - 455, 50, 50, this);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
