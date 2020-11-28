/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author Fluke
 */
public class map{
    public static final int w = 820, h = 849;

    private KeyListener m;
    public map() {
        JFrame fr = new JFrame("พันธุ์เสือ");
        fr.add(new game());
        fr.setSize(w,h);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
        
    } 

    
}
