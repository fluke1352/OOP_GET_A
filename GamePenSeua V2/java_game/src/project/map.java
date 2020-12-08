/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JFrame;

/**
 *
 * @author Fluke
 */
public class map {
    public static final int w = 820, h = 849;
    
    public map() {
        JFrame fr = new JFrame("พันถุ์เสือ");
//        fr = new JFrame();
        
        fr.setSize(w,h);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);
        fr.add(new game());

    }

    public int wall(Player p){
        int x = p.getX();
        int y = p.getY();
        System.out.println("X : " + x + "Y : " + y );
        return 10;
    }

}
