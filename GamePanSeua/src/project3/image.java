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
    public static BufferedImage heart, Takaimap, Takaiboss;
    public static BufferedImage bossheart, fireball, rasengan ;
    // สำหรับรวม แค่ 2 ตัวนี้ไปเพิ่มของ class image
    public static BufferedImage macMap, macBoss, Takaikame, Takaibskame, punboss, Tuboss;
    public static BufferedImage punmap, tumap ;

    public image() {
        try {

            ghostleft = ImageIO.read(getClass().getResource("image/left.png"));
            ghostright = ImageIO.read(getClass().getResource("image/right.png"));
            ghosttop = ImageIO.read(getClass().getResource("image/top.png"));
            ghostdown = ImageIO.read(getClass().getResource("image/down.png"));
            map = ImageIO.read(getClass().getResource("image/bg.png"));
            
            flukeboss = ImageIO.read(getClass().getResource("image/Ultrainstinct.png"));
            kame = ImageIO.read(getClass().getResource("image/kame.png"));
            bskame = ImageIO.read(getClass().getResource("image/bskame.png"));
            heart = ImageIO.read(getClass().getResource("image/heart.png"));
            bossheart = ImageIO.read(getClass().getResource("image/bossheart.png"));

            // 2 ตัวสำหรับ Map, Boss ของแม็ก
            macMap = ImageIO.read(getClass().getResource("image/BackGroudMac.png"));
            macBoss = ImageIO.read(getClass().getResource("image/BossMac.png"));

//            takai
            Takaimap = ImageIO.read(getClass().getResource("image/computer.jpg"));
            Takaiboss = ImageIO.read(getClass().getResource("image/Takaiboss.png"));
            Takaikame = ImageIO.read(getClass().getResource("image/meme.png"));
            Takaibskame = ImageIO.read(getClass().getResource("image/fireball.png"));

//            tu
            Tuboss = ImageIO.read(getClass().getResource("image/face3.png"));
            fireball = ImageIO.read(getClass().getResource("image/fireball.png"));
            rasengan = ImageIO.read(getClass().getResource("image/rasengan.png"));
            punboss = ImageIO.read(getClass().getResource("image/pun.png"));
            punmap = ImageIO.read(getClass().getResource("image/punmap.png"));
            tumap = ImageIO.read(getClass().getResource("image/tumap.png"));
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
