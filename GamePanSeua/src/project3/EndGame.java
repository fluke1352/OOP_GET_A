package project3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class EndGame extends JFrame implements ActionListener {
    public static final int w = 814, h = 500;
    private ImageIcon imageEnd;
    private JLabel img;
    private JButton newGame, exitGame;
    private JLayeredPane layerEnd;

    public EndGame(){
        super("End");
        setSize(w, h);
        imageEnd = new ImageIcon(getClass().getResource("image/EndGame.png"));
        img = new JLabel(imageEnd);
        newGame = new JButton("New Game");
        exitGame = new JButton("Exit");
        JLayeredPane pane = getLayeredPane();

        newGame.setBounds(200, 400, 100, 50);
        newGame.setBackground(Color.LIGHT_GRAY);
        exitGame.setBounds(500, 400, 100, 50);
        exitGame.setBackground(Color.LIGHT_GRAY);
        img.setBounds(0, 0, w, h);
        setLocationRelativeTo(null);

        pane.add(img, 1);
        pane.add(newGame, 2);
        pane.add(exitGame, 3);

        newGame.setVisible(true);
        exitGame.setVisible(true);

        newGame.addActionListener(this);
        exitGame.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(newGame)){
            new GameMenu();
            SelectBoss.jLabel1.setVisible(true);
            SelectBoss.jLabel2.setVisible(true);
            SelectBoss.jLabel4.setVisible(true);
            SelectBoss.jLabel5.setVisible(true);
            SelectBoss.jLabel8.setVisible(true);
            SelectBoss.st = 0;
            Flukebattleboss.hp = 10;
            Macbattleboss.hp = 10;
            Takaibattleboss.hp = 10;
            Tubattleboss.hp = 10;
            Punbattleboss.hp = 10;
            
            dispose();
        }
        else if (e.getSource().equals(exitGame)){
            System.exit(0);
        }
    }
}
