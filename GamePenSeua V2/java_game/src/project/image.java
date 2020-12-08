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
    public static BufferedImage front_player;
    
    public image(){
        try {
//            System.out.println("A");
            flukemap = ImageIO.read(getClass().getResource("image/map_mac.png"));
            front_player = ImageIO.read(getClass().getResource("image/player/front.png"));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}