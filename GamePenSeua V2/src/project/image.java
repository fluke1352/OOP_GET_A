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
    public static BufferedImage ghostleft, ghostright, ghosttop ,ghostdown;
    public static BufferedImage heart;
    public static BufferedImage bossheart;

    public static BufferedImage kame_1, kame_2, kame_3, kame_4, kame_5; //ทำ Random
    public static BufferedImage map_1, map_2, map_3, map_4, map_5 ,map_6, map_7; //ทำ Random
    public static BufferedImage bskame_1, bskame_2, bskame_3, bskame_4, bskame_5; //ทำ Random
    public static BufferedImage boss_1,boss_2, boss_3 ,boss_4, boss_5; //ทำ Random


    public image(){
        try {
            //-------------Image for Player-----------------------------------------------
            ghostleft = ImageIO.read(getClass().getResource("image/Player/left.png"));
            ghostright = ImageIO.read(getClass().getResource("image/Player/right.png"));
            ghosttop = ImageIO.read(getClass().getResource("image/Player/top.png"));
            ghostdown = ImageIO.read(getClass().getResource("image/Player/down.png"));

            //-------------Image for Map-----------------------------------------------
            map_1 =  ImageIO.read(getClass().getResource("image/Map/bg_1.png"));
            map_2 =  ImageIO.read(getClass().getResource("image/Map/bg_2.png"));
            map_3 =  ImageIO.read(getClass().getResource("image/Map/bg_3.png"));
            map_4 =  ImageIO.read(getClass().getResource("image/Map/bg_4.jpg"));
            map_5 =  ImageIO.read(getClass().getResource("image/Map/bg_5.jpg"));
            map_6 =  ImageIO.read(getClass().getResource("image/Map/bg_6.jpg"));
            map_7 =  ImageIO.read(getClass().getResource("image/Map/bg_7.jpg"));

            //-------------Image for PlayerATK-----------------------------------------------
            kame_1 = ImageIO.read(getClass().getResource("image/AtkKame/kame_1.png"));
            kame_2 = ImageIO.read(getClass().getResource("image/AtkKame/kame_2.png"));
            kame_3 = ImageIO.read(getClass().getResource("image/AtkKame/kame_3.png"));
            kame_4 = ImageIO.read(getClass().getResource("image/AtkKame/kame_4.png"));
            kame_5 = ImageIO.read(getClass().getResource("image/AtkKame/kame_5.png"));

            //-------------Image for BossATK-----------------------------------------------
            bskame_1 = ImageIO.read(getClass().getResource("image/AtkBoss/bskame_1.png"));
            bskame_2 = ImageIO.read(getClass().getResource("image/AtkBoss/bskame_2.png"));
            bskame_3 = ImageIO.read(getClass().getResource("image/AtkBoss/bskame_3.png"));
            bskame_4 = ImageIO.read(getClass().getResource("image/AtkBoss/bskame_4.png"));
            bskame_5 = ImageIO.read(getClass().getResource("image/AtkBoss/bskame_5.png"));

            //-------------Image for Boss-----------------------------------------------
            boss_1 = ImageIO.read(getClass().getResource("image/Boss/Boss_1.png"));
            boss_2 = ImageIO.read(getClass().getResource("image/Boss/Boss_2.png"));
            boss_3 = ImageIO.read(getClass().getResource("image/Boss/Boss_3.png"));
            boss_4 = ImageIO.read(getClass().getResource("image/Boss/Boss_4.png"));
            boss_5 = ImageIO.read(getClass().getResource("image/Boss/Boss_5.png"));

            //-------------Image for Heart-----------------------------------------------
            heart = ImageIO.read(getClass().getResource("image/heart.png"));
            bossheart = ImageIO.read(getClass().getResource("image/bossheart.png"));
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}