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
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.EOFException;
import java.io.IOException;

public class image {
    public static BufferedImage punmap;
    public static BufferedImage fluketomap;
    public static BufferedImage tuumap;
    public static BufferedImage ghosttop;
    public static BufferedImage ghostright;
    public static BufferedImage ghostleft;
    public static BufferedImage ghostdown;
    public static BufferedImage selectmap_pun;
    public static BufferedImage selectmap_fluke;
    public static BufferedImage selectmap_tuu;
    BufferedImage turn;
    

    
    public image(){
        try {
//            ส่วนของการเลือกแมพ
            selectmap_pun = ImageIO.read(getClass().getResource("image/selectmapPun.png"));
            selectmap_fluke = ImageIO.read(getClass().getResource("image/selectmapFluke.png"));
            selectmap_tuu = ImageIO.read(getClass().getResource("image/selectmapTuu.png"));
            
           fluketomap = ImageIO.read(getClass().getResource("image/fluketomap.png"));
            punmap = ImageIO.read(getClass().getResource("image/punmap.png"));
            tuumap = ImageIO.read(getClass().getResource("image/tuumap.png"));
            ghosttop = ImageIO.read(getClass().getResource("image/top.png"));
            ghostright = ImageIO.read(getClass().getResource("image/right.png"));
            ghostleft = ImageIO.read(getClass().getResource("image/left.png"));
            ghostdown = ImageIO.read(getClass().getResource("image/bottom.png"));
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}