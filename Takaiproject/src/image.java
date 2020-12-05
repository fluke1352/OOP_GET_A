/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Fluke
 */
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.EOFException;
import java.io.IOException;

public class image {
    public static BufferedImage takaimap;
    public static BufferedImage ghostleft;
    public static BufferedImage ghostright;
    public static BufferedImage ghosttop;
    public static BufferedImage ghostdown;
    
    public image(){
        try {
//            System.out.println("A");
            takaimap = ImageIO.read(getClass().getResource("image/takaimap.png"));
            ghostleft = ImageIO.read(getClass().getResource("image/left.png"));
            ghostright = ImageIO.read(getClass().getResource("image/right.png"));
            ghosttop = ImageIO.read(getClass().getResource("image/top.png"));
            ghostdown = ImageIO.read(getClass().getResource("image/down.png"));
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}