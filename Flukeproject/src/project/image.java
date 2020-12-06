/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Fluke
 */
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.EOFException;
import java.io.IOException;

public class image {
    public static BufferedImage flukemap;
    public static BufferedImage ghostleft;
    public static BufferedImage ghostright;
    public static BufferedImage ghosttop, flukeboss;
    public static BufferedImage ghostdown, map, kame, bskame;
    public static BufferedImage heart;
    public static BufferedImage bossheart, punboss;
    
    public image(){
        try {
//            System.out.println("A");
            flukemap = ImageIO.read(getClass().getResource("image/fluketomap.png"));
            ghostleft = ImageIO.read(getClass().getResource("image/left.png"));
            ghostright = ImageIO.read(getClass().getResource("image/right.png"));
            ghosttop = ImageIO.read(getClass().getResource("image/top.png"));
            ghostdown = ImageIO.read(getClass().getResource("image/down.png"));
            map =  ImageIO.read(getClass().getResource("image/bg.png"));
            flukeboss = ImageIO.read(getClass().getResource("image/Ultrainstinct.png"));
            kame = ImageIO.read(getClass().getResource("image/kame.png"));
            bskame = ImageIO.read(getClass().getResource("image/bskame.png"));
            heart = ImageIO.read(getClass().getResource("image/heart.png"));
            bossheart = ImageIO.read(getClass().getResource("image/bossheart.png"));
            punboss = ImageIO.read(getClass().getResource("image/pun.png"));
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}