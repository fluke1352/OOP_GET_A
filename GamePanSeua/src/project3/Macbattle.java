package project3;
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
public class Macbattle extends JPanel{
    public static final int w = 1000, h = 700;
    Macbattleplayer py;
    public static JFrame fr;
    public static loopsound lp;

    public Macbattle(){
     fr = new JFrame("Battle");
        fr.add(new Macbattlemap());
        fr.setSize(w,h);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
        lp = new loopsound("sound/BG2.wav");
    }

    public static void stop(){
        lp.clip.close();
    }
}
