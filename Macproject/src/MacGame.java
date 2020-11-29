import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import javax.swing.*;

/**
 *
 * Class นี้เป็นตัวหลักในการกำหนดค่าต่างๆ ของเกม ไม่ว่าจะเป็น
 * - set Camara ในการขยับ map ให้วิ่งไปในทิศตัวละคร
 * - set Player ให้อยู่ในตำแหน่ง เริ่มต้น
 * - สร้าง loop time
 * - สร้าง class img
 *
 */
public class MacGame extends JPanel implements ActionListener {

    private int  x_cam = 0, y_cam = 0; //ค่าเรื่มต้นของ Camara ในเกมให้ตรง

    image img;  //(1) ไว้เรียน class img
    Timer loop; //(2) ไว้เรียน class loop

    MacPlayer user = new MacPlayer(402,42); //สร้าง class Player set จุดเริ้มต้นใน สร้างใน Constructor(X,Y)

    // Constructor สร้าง 1. loop 2. img
    public MacGame(){
        loop = new Timer(0, this); // (2) ทำการสร้าง loop set delay = 0
        loop.start();
        img = new image(); //(1) สร้าง class ที่ไว้สร้าง img ที่ใช้สำหรับ map, ตัวละคร
        addKeyListener(user); // ให้ Player สามารถใช้ method ในการขยับ ตัวละครได้
        setFocusable(true); // กำหนดการ Focus
    }

    // method ในการวาด รูปต่างๆ ลง JFrame
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2 = (Graphics2D) g;
        image img = new image(); //(1) สร้าง class ที่ไว้สร้าง img ที่ใช้สำหรับ map, ตัวละคร

        /**
         * วาด Map และ เป็นตัวแสดง camara ด้วย drawImage(img.รูป map, มุมกล้องแกรน X, มุมกล้องแกรน Y, กว้าง, ยาว, this)
         * เหตุที่ -160 เพราะเป็นมุมกล้องที่เหมาะสนในการแสดงหน้าเริ่มต้น
         */
        g.drawImage(img.macmap, getX_cam() - 160, getY_cam(), 1000, 1000, this);


        user.draw(g2,this); // method ของ Player ที่ไว้วาดรูปตัวละคร เริ่มต้น, เวลาเดิน, และกำหนดมุมกล้อง

    }

    //Method สำหรับ loop ในการวาด
    @Override
    public void actionPerformed(ActionEvent e) {
        user.upDate(); //ให้ Class Player Method Update ทำงานตลอดเวลา
        repaint(); //ให้ทำการวาดภาพไหม่เมือมีการเปรียนแปลง ตำแหน่ง หรือ รูปภาพ
    }
    //set ค่า X ของ camara
    public void setX_cam(int x_cam) {
        if (x_cam >= 160){ // เพื่อไม่ให้เกินกรอบ ขวา ถ้าเกินให้ล็อกไว้อยู่กับที่
            this.x_cam = 160;
        }
        else if (x_cam <= -60){ // เพื่อไม่ให้เกินกรอบ ซ้าย ถ้าเกินให้ล็อกไว้อยู่กับที่
            this.x_cam = -60;
        }
        else {
            this.x_cam = x_cam; //กำหนดค่า X camara
        }
//        this.x_cam = x_cam;

    }

    public void setY_cam(int y_cam) {
        if (y_cam >= 0){ // เพื่อไม่ให้เกินกรอบ บน ถ้าเกินให้ล็อกไว้อยู่กับที่
            this.y_cam = 0;
        }
        else if (y_cam <= -530){ // เพื่อไม่ให้เกินกรอบ ล่าง ถ้าเกินให้ล็อกไว้อยู่กับที่
            this.y_cam = -530;
        }
        else {
            this.y_cam = y_cam; // กำหนดค่า Y Camara
        }
//        this.y_cam = y_cam;
    }
    public int getX_cam() {
        return x_cam;
    }
    public int getY_cam() {
        return y_cam;
    }
}
