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
    
    public image(){
        try {
//            System.out.println("A");
            map144 = ImageIO.read(getClass().getResource("image/mapfinal.png"));
            back = ImageIO.read(getClass().getResource("image/back.png"));
            front =  ImageIO.read(getClass().getResource("image/front.png"));
            left = ImageIO.read(getClass().getResource("image/left.png"));
            right =  ImageIO.read(getClass().getResource("image/right.png"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}