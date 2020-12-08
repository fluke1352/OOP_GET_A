package project;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Player {
    private int width = 40;
    private int height = 40;
    private int x;
    private int y;
    private int move_x = 0;
    private int move_y = 0;


    public Player(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
 
    public void upDate(){
        this.x += this.move_x;
        this.y += this.move_y;
    }
    public  void  draw(Graphics2D g2, image img,game g){
        g2.drawImage(img.front_player, getX(), getY(), getWidth() ,getHeight(),g);
    }
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W)
            this.move_y =- 5;
        if (e.getKeyCode() == KeyEvent.VK_S)
            this.move_y = 5;
        if (e.getKeyCode() == KeyEvent.VK_A)
            this.move_x =- 5;
        if (e.getKeyCode() == KeyEvent.VK_D)
            this.move_x = 5;
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W)
            this.move_y = 0;
        if (e.getKeyCode() == KeyEvent.VK_S)
            this.move_y = 0;
        if (e.getKeyCode() == KeyEvent.VK_A)
            this.move_x = 0;
        if (e.getKeyCode() == KeyEvent.VK_D)
            this.move_x = 0;
    }
}
