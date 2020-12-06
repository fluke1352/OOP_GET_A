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
public class FlukeMap {
    public static final int w = 820, h = 849;
    
    public FlukeMap() {
        JFrame fr = new JFrame("พันถุ์เสือ");
//        fr = new JFrame();
        fr.add(new FlukeGame());
        fr.setSize(w,h);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(fr.DISPOSE_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
        
    }
}
