/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Rectangle;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Fluke
 */
public class PunMap {
    public static LinkedList<Rectangle> hitbox = new LinkedList<>();
    public static final int w = 800, h = 800;
    
    public PunMap() {
        JFrame fr = new JFrame("พันธุ์เสือ");
        JPanel p = new JPanel();
        fr.setSize(w,h);
        fr.setResizable(false);
       fr.setDefaultCloseOperation(fr.DISPOSE_ON_CLOSE);
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);
        fr.addKeyListener(new PunPlayer());
        fr.add(new PunPlayer());
    }
    
}
