package project3;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import javax.swing.JFrame;
import javax.swing.JPanel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Flukebattle extends JPanel{
    public static final int w = 1000, h = 700;
    Flukebattleplayer py;
    public static JFrame fr;
    
    public Flukebattle(){
     fr = new JFrame("Battle");
        fr.add(new Flukebattlemap());
        fr.setSize(w,h);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Flukebattle m = new Flukebattle();

    }


    
}
