package project3;
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class GameMenu extends JFrame implements ActionListener{
    JFrame  gameWindow;
    JPanel  titleNameGamePanel,titleNameGameB, btnP;
    JLabel  titleNameGameLabel, smallName, boxx;
    JButton btn;
    Container box;
    Font gameName = new Font("",Font.PLAIN,50);
    Font gameNameSmall = new Font("",Font.PLAIN,20);
    public static SelectBoss se;

    // สร้างloop เพลง
    public loopsound lp;
    
  
    

    public GameMenu()
    {
        lp = new loopsound("sound/BG1.wav");
        gameWindow = new JFrame();
        gameWindow.pack();
        gameWindow.setTitle("พันธุ์เสือ");
        gameWindow.setSize(800,800);
        gameWindow.setVisible(true);
        gameWindow.setResizable(true);
        gameWindow.setLayout(null);
        gameWindow.setLocationRelativeTo(null);
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
        
        Icon imgIcon = new ImageIcon(this.getClass().getResource("image/tiger_1.gif"));
        boxx = new JLabel(imgIcon);
        boxx.setBounds(150,150,480,480);
        box.add(boxx);
        btn.addActionListener(this);
        gameWindow.setDefaultCloseOperation(gameWindow.EXIT_ON_CLOSE);
    }
    
        public static void main(String[] args) {
        new GameMenu();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        lp.clip.close();
        se = new SelectBoss();
        se.setSize(1000,700);
        se.setVisible(true);
        gameWindow.dispose();
    }



}

