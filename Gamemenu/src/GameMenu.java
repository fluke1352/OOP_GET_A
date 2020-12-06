        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author _Takaii
 */
import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class GameMenu extends JFrame{
    JFrame  gameWindow;
    JPanel  titleNameGamePanel,titleNameGameB, btnP;
    JLabel  titleNameGameLabel, smallName, boxx;
    JButton btn;
    Container box;
    Font gameName = new Font("",Font.PLAIN,50);
    Font gameNameSmall = new Font("",Font.PLAIN,20);
  
    

    public GameMenu()
    {
        gameWindow = new JFrame();
        gameWindow.pack();
        gameWindow.setTitle("พันธุ์เสือ");
        gameWindow.setSize(800,800);
        gameWindow.setVisible(true);
        gameWindow.setResizable(false);
        gameWindow.setLayout(null);
        gameWindow.setDefaultCloseOperation(gameWindow.EXIT_ON_CLOSE);
        gameWindow.getContentPane().setBackground(Color.black);
        box = gameWindow.getContentPane();
        titleNameGameB = new JPanel();
        titleNameGameB.setBounds(100,90,570,40);
        titleNameGameB.setBackground(Color.black);

        titleNameGamePanel = new JPanel();
        titleNameGamePanel.setBounds(100,10,570,80);
        titleNameGamePanel.setBackground(Color.black);
        
        
        titleNameGameLabel = new JLabel("พันธุ์เสือที่ไม่เกี่ยวกับเสือ");
        smallName = new JLabel("\"THE BEST GAME OF THE YEAR\"");
        smallName.setForeground(Color.white);
        smallName.setFont(gameNameSmall);
        titleNameGameB.add(smallName);
        titleNameGameLabel.setForeground(Color.white);
        titleNameGameLabel.setFont(gameName);
        titleNameGamePanel.add(titleNameGameLabel);
        box.add(titleNameGameB);
        box.add(titleNameGamePanel);
        
        btnP = new JPanel();
        btn = new JButton("หาปุ่มเล่นให้เจอเพื่อพบพันธุ์เสือ");
        btn.setBackground(Color.black);
        btn.setForeground(Color.white);
        btn.setFont(gameNameSmall);
        btn.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        
        btnP.add(btn);
        btnP.setBounds(150,650,480,105);
        btnP.setBackground(Color.black);
        btnP.add(btn);
        box.add(btnP);
        
        Icon imgIcon = new ImageIcon(this.getClass().getResource("tiger_1.gif"));
        boxx = new JLabel(imgIcon);
        boxx.setBounds(150,150,480,480);
        box.add(boxx);
        
    }
    
        public static void main(String[] args) {
        new GameMenu();
    }
    
}

