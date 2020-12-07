/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

/**
 *
 * @author Fluke
 */
public class check extends Thread{
    public static int st = 0;
    @Override
    public void run() {
        if(st == 5){
            System.out.println(st);    
            GameMenu.se.setVisible(false);
            System.exit(0);
            
        }
    }
    
}
