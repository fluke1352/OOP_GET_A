/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Fluke
 */

public class PunPlayer extends JPanel implements KeyListener {
    image img;
    BufferedImage turn = img.ghostright;
    public int px = 5, py = 720;
    
    public PunPlayer(){
    this.addKeyListener(this);
    this.setFocusable(true);
 
 
}
        
    public void paint(Graphics g) {
       super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2 = (Graphics2D) g;
        image img = new image();
        g.drawImage(img.punmap, 0, 0, 800, 800, this);
        g.drawImage(img.ghostright, this.px, this.py, 40, 40, this);
        if (px < 0) {
            px = 0;
        }
        if(py > 730) {
            py = 730;
        }
        if (py < 60 ){
            py = 60;
        }
        if (px > 725) {
            px = 725;
        }
        if ((px >= 215 && px <= 250) && (py >= 550 & py <=730 )){
            px = 215;
        }
        if ( (  px >= 50&&px <= 225 ) && (py >= 440 & py <= 460 )){
            py = 460;
        }
        if ((py >= 440 && py <= 660) && px <= 60){
            px = 60;
        }
        if ((py >= 460 && py <= 480) && (px >= 230 && px <= 250)){
            px = 230;
        }
        if ((px >= 240 && px <= 300) && (py<=485& py >=455)){
            py = 485;
        }
        if ((px >= 240 && px <= 300) && (py>=545& py <=575)){
            py = 545;
        }
        if ((px >= 305 && px <= 325) && (py>=575& py <=585)){
            py = 565;
        }
        if ((px >= 315 && px <= 345) && (py>=595& py <=645)){
            py = 645;
        }
        if ((px >= 305 && px <= 335) && (py>=640& py <=645)){
            py = 645;
        }
        if ((px >= 285 && px <= 315) && (py>=645& py <=735)){
            px = 315;
        }
        if ((px >= 285 && px <= 315) && (py>=455& py <=475)){
            px = 315;
        }
        if ((px >= 315 && px <= 475) && (py>=430& py <=455 )){
            py = 455;
        }
        if ((px >= 475 && px <= 505) && (py>=455& py <=475 )){
            px = 475;
        }
        if ((px >= 475 && px <= 505) && (py>=640& py <=730 )){
            px = 475;
        }
        if ((px >= 465 && px <= 485) && (py>=640& py <=650 )){
            py = 650;
        }
        if ((px >= 445 && px <= 455) && (py>=600& py <=640 )){
            px = 445;
        }
        if ((px >= 465 && px <= 485) && (py>=570& py <=580 )){
            py = 570;
        }
        if ((px >= 485 && px <= 495) && (py>=550& py <=570 )){
            px = 485;
        }
        if ((px >= 485 && px <= 495) && (py>=550& py <=570 )){
            px = 485;
        }
        if ((px >= 495 && px <= 555) && (py>=540& py <=560 )){
            py = 540;
        }
       if ((px >= 560 && px <= 570) && (py>=550& py <=570 )){
            px = 570;
        }
       if ((px >= 570 && px <= 580) && (py>=570& py <=580 )){
            py = 570;
        }
       if ((px >= 580 && px <= 600) && (py>=590& py <=640 )){
            px = 600;
        }
       if ((px >= 570 && px <= 590) && (py>=640& py <=650 )){
            py = 650;
        }
       if ((px >= 560 && px <= 570) && (py>=640& py <=740 )){
            px = 570;
        }
       if ((px >= 705 && px <= 715) && (py>=600& py <=630 )){
            px = 705;
        }
       if ((px >= 715 && px <= 735) && (py>=570& py <=580 )){
            py = 570;
        }
       if ((px >= 495 && px <= 555) && (py>=485& py <=495 )){
            py = 495;
        }
       if ((px >= 555 && px <= 565) && (py>=455& py <=480 )){
            px = 565;
        }
       if ((px >= 695 && px <= 735) && (py>=440& py <=460 )){
            py = 460;
        }
       if ((px >= 675 && px <= 690) && (py>=390& py <=440 )){
            px = 675;
        }
       if ((px >= 615 && px <= 635) && (py>=390& py <=440 )){
            px = 635;
        }
       if ((px >= 595 && px <= 615) && (py>=380& py <=390 )){
            py = 380;
        }
       if ((px >= 690 && px <= 705) && (py>=380& py <=390 )){
            py = 380;
        }
       if ((px >= 705 && px <= 715) && (py>=360& py <=390 )){
            px = 705;
        }
       if ((px >= 575 && px <= 595) && (py>=360& py <=390 )){
            px = 595;
        }
       if ((px >= 725 && px <= 735) && (py>=350& py <=360 )){
            py = 350;
        }
       if ((px >= 25 && px <= 575) && (py>=350& py <=360 )){
            py = 350;
        }
       if ((px >= 5 && px <= 25) && (py>=340& py <=350 )){
            px = 25;
        }
       if ((px >= 25 && px <= 40) && (py>=230& py <=240 )){
            py = 240;
        }
       if ((px >= 145 && px <= 735) && (py>=230& py <=240 )){
            py = 240;
        }
       if ((px >= 125 && px <= 145) && (py>=175& py <=220 )){
            px = 125;
        }
       if ((px >= 35 && px <= 55) && (py>=175& py <=220 )){
            px = 55;
        }
       if ((px >= 15 && px <= 55) && (py>=155 & py <= 170 )){
            py = 155;
        }
       if ((px >= 145 && px <= 485) && (py>=155 & py <= 170 )){
            py = 155;
        }
        if ((px >= 15 && px <= 25) && (py>=235 & py <= 345 )){
            px = 25;
        }
        if ((px >= 15 && px <= 25) && (py>=50 & py <= 155 )){
            px = 25;
        }
        if ((px >= 475 && px <= 485) && (py>=50 & py <= 60 )){
            px = 475;
        }
        if ((px >= 475 && px <= 485) && (py>=140 & py <= 160 )){
            px = 475;
        }
        if ((px >= 495 && px <= 555) && (py>=125 & py <= 135 )){
            py = 125;
        }
        if ((px >= 495 && px <= 555) && (py>=60 & py <= 70 )){
            py = 70;
        }
        if ((px >= 560 && px <= 575) && (py>=50 & py <= 60 )){
            px = 575;
        }
        if ((px >= 560 && px <= 575) && (py>=140 & py <= 160 )){
            px = 575;
        }
        if ((px >= 565 && px <= 735) && (py>=155 & py <= 165 )){
            py = 155;
        }
        
       
      
      
        
          
    }
    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == 65) { //Left
            this.px -= 10;
            turn = img.ghostleft;
            System.out.println("px="+px+"py="+py);
            
        } else if (ke.getKeyCode() == 87) { //Up
            this.py -= 10;
            turn = img.ghosttop;
            System.out.println("px="+px+"py="+py);
            
        } else if (ke.getKeyCode() == 68) { //Right
            this.px += 10;
            turn = img.ghostright;
            System.out.println("px="+px+"py="+py);
            
        } else if (ke.getKeyCode() == 83) { //Down
            this.py += 10;
            turn = img.ghostdown;
            System.out.println("px="+px+"py="+py);
          
        }
        repaint();
    }
 
    @Override
    public void keyReleased(KeyEvent ke) {
    }
    
//     @Override
//    public void keyTyped(KeyEvent e) {
//
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//        if (e.getKeyCode() == KeyEvent.VK_W) {
//            this.py -= 10;
//            turn = img.top;
//            System.out.println("px="+px+"py="+py);
//        }
//
//
//        if (e.getKeyCode() == KeyEvent.VK_S) {
//           this.py += 10;
//            turn = img.bottom;
//            System.out.println("px="+px+"py="+py);
//
//        }
//
//
//        if (e.getKeyCode() == KeyEvent.VK_A) {
//            this.px -= 10;
//            turn = img.left;
//            System.out.println("px="+px+"py="+py);
//        }
//
//
//        if (e.getKeyCode() == KeyEvent.VK_D) {
//           this.px += 10;
//            turn = img.right;
//            System.out.println("px="+px+"py="+py);
//        }
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//
//    }
}
