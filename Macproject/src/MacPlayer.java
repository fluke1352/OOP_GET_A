import javax.swing.*;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class MacPlayer extends KeyAdapter {
    private int width = 50;
    private int height = 50;
    private int x, move_x = 0;
    private int y, move_y = 0;
    private int speed = 8;
    image img = new image();
    BufferedImage position_user = img.ghostdown;

    public MacPlayer(int x, int y) {
        setX(x);
        setY(y);
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

    public BufferedImage getPosition_user() {
        return position_user;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMove_x() {
        return move_x;
    }

    public int getMove_y() {
        return move_y;
    }

    public void setMove_x(int move_x) {
        this.move_x = move_x;
    }

    public void setMove_y(int move_y) {
        this.move_y = move_y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosition_user(BufferedImage position_user) {
        this.position_user = position_user;
    }

    public void upDate() {
        setX(getX() + getMove_x());
        setY(getY() + getMove_y());
        System.out.println("User :" +x + " " + y);

    }

    public void draw(Graphics2D g2, MacGame g) {
        g2.drawImage(getPosition_user(), getX(), getY(), getWidth(), getHeight(), g);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W){
            setPosition_user(img.ghosttop);
            setMove_y(-getSpeed());

        }
        if (e.getKeyCode() == KeyEvent.VK_S){
            setPosition_user(img.ghostdown);
            setMove_y(getSpeed());
        }

        if (e.getKeyCode() == KeyEvent.VK_A) {
            setPosition_user(img.ghostleft);
            setMove_x(-getSpeed());
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            setPosition_user(img.ghostright);
            setMove_x(getSpeed());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            setMove_y(0);
        }
        if (e.getKeyCode() == KeyEvent.VK_S){
            setMove_y(0);
        }
        if (e.getKeyCode() == KeyEvent.VK_A ) {
            setMove_x(0);
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            setMove_x(0);
        }
    }

}