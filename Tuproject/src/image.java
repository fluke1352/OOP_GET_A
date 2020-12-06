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
    public static BufferedImage map144;
    public static BufferedImage back;
    public static BufferedImage front;
    public static BufferedImage left;
    public static BufferedImage right;
    public static BufferedImage map;
    public static BufferedImage kame;
    public static BufferedImage flukeboss;
    public static BufferedImage heart;
    public static BufferedImage bossheart;
    public static BufferedImage bskame;
    
    
    public image(){
        try {
//            System.out.println("A");
            map144 = ImageIO.read(getClass().getResource("image/mapfinal.png"));
            back = ImageIO.read(getClass().getResource("image/back.png"));
            front =  ImageIO.read(getClass().getResource("image/front.png"));
            left = ImageIO.read(getClass().getResource("image/left.png"));
            right =  ImageIO.read(getClass().getResource("image/right.png"));
            map =  ImageIO.read(getClass().getResource("image/bg.png"));
            kame =  ImageIO.read(getClass().getResource("image/kame.png"));
            flukeboss = ImageIO.read(getClass().getResource("image/boss.png"));
            heart = ImageIO.read(getClass().getResource("image/heart.png"));
            bossheart = ImageIO.read(getClass().getResource("image/bossheart.png"));
            bskame = ImageIO.read(getClass().getResource("image/bskame.png"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}