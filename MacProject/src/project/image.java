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
    public static BufferedImage ghostleft;
    public static BufferedImage ghostright;
    public static BufferedImage ghosttop;
    public static BufferedImage ghostdown, kame, bskame;
    public static BufferedImage heart;
    public static BufferedImage bossheart;

    // สำหรับรวม แค่ 2 ตัวนี้ไปเพิ่มของ class image
    public static BufferedImage macMap, macBoss;
    
    public image(){
        try {
            ghostleft = ImageIO.read(getClass().getResource("image/left.png"));
            ghostright = ImageIO.read(getClass().getResource("image/right.png"));
            ghosttop = ImageIO.read(getClass().getResource("image/top.png"));
            ghostdown = ImageIO.read(getClass().getResource("image/down.png"));
            kame = ImageIO.read(getClass().getResource("image/kame.png"));
            bskame = ImageIO.read(getClass().getResource("image/bskame.png"));
            heart = ImageIO.read(getClass().getResource("image/heart.png"));
            bossheart = ImageIO.read(getClass().getResource("image/bossheart.png"));

            // 2 ตัวสำหรับ Map, Boss ของแม็ก
            macMap =  ImageIO.read(getClass().getResource("image/BackGroudMac.png"));
            macBoss = ImageIO.read(getClass().getResource("image/BossMac.png"));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}