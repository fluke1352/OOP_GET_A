/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Takaiproject;

import javax.swing.JFrame;


public class map {
    public static final int w = 820, h = 849;
    
    public map() {
        JFrame fr = new JFrame("พันถุ์เสือ");
//        fr = new JFrame();
        fr.add(new Takaigame());
        fr.setSize(w,h);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
        
    }
}
