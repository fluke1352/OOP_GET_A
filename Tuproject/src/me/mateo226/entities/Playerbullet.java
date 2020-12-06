/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
package me.mateo226.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Playerbullet {

    public int x, y;
    public float moveSpeed = 0.1f;
    private BufferedImage playerTexture;;

    public Playerbullet(int x, int y, String texturePath){
        this.x = x;
        this.y = y;
        try {
        playerTexture = ImageIO.read(new File(texturePath));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void drawPlayer(Graphics g){

        g.setColor(Color.white);
        g.drawImage(playerTexture, x, y, null);

    }



}