import java.awt.*;
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
    private int camX = 0, camY = 0;
    private int locationCam = 1;
    image img;  //(1) ไว้เรียน class img
    Timer loop; //(2) ไว้เรียน class loop

    MacPlayer user = new MacPlayer(144,66); //สร้าง class Player set จุดเริ้มต้นใน สร้างใน Constructor(X,Y)

    // Constructor สร้าง 1. loop 2. img
    public MacGame(){
        loop = new Timer(1, this); // (2) ทำการสร้าง loop set delay = 0
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
         * DrawImage เป็นส่วนที่ในการวาด map ลงไป และก็ปรับขนาดเป็น 1500 x 1500 เพือที่จะได้ขนาดที่มีการ zoom เข้าไปใน map
         * - camX : เป็นการ set มุมกล้องตามฉากต่างๆ
         * - camY : เป็นการ set มุมกล้องตามฉากต่างๆ
         *      โดยใช้ method setcamara() กับ CheckPosition() เป็นตัวดูการเครื่องไหว
         */
        g2.drawImage(img.macmap, this.camX, this.camY, 1500, 1500, this);

        user.draw(g2,this); // method ของ Player ที่ไว้วาดรูปตัวละคร เริ่มต้น, เวลาเดิน, และกำหนดมุมกล้อง

    }

    //Method สำหรับ loop ในการวาด
    @Override
    public void actionPerformed(ActionEvent e) {
        user.upDate(); //ให้ Class Player Method Update ทำงานตลอดเวลา
        this.setcamara();
        this.CheckPosition(user);
        repaint(); //ให้ทำการวาดภาพไหม่เมือมีการเปรียนแปลง ตำแหน่ง หรือ รูปภาพ

    }

    // เป็นการบอกว่าใน map มีท้้งหมด 10 ฉาก แล้วก็ทำการ set ค่า X,Y ของแต่ละฉากไว้ใน method นี้
    public void setcamara(){
        if (this.locationCam == 0){
            this.camX = 0;
            this.camY = 0;
        }
        if (this.locationCam == 1){
            this.camX = -700;
            this.camY = -10;
        }
        if (this.locationCam == 2){
            this.camX = -700;
            this.camY = -500;
        }
        if (this.locationCam == 3){
            this.camX = -350;
            this.camY = -350;
        }
        if (this.locationCam == 4){
            this.camX = -350;
            this.camY = -650;
        }
        if (this.locationCam == 5){
            this.camX = -50;
            this.camY = -650;
        }
        if (this.locationCam == 6){
            this.camX = -50;
            this.camY = -350;
        }
        if (this.locationCam == 7){
            this.camX = -700;
            this.camY = -800;
        }
        if (this.locationCam == 8){
            this.camX = -700;
            this.camY = -1030;
        }
        if (this.locationCam == 9){
            this.camX = -350;
            this.camY = -1030;
        }
        if (this.locationCam == 10){
            this.camX = 0;
            this.camY = -1030;
        }
    }

    // method นี้เป็นการเช็กตำแหน่งของ Player ว่าเดินมาถึงในจุดที่ต้องทำการเปรียนฉากยัง
    public void CheckPosition(MacPlayer user){
        /**
         * if(ฉากที่ user อยู่ในปัจจุบัน)
         *      if(ถึง X,Y ที่เป็นตำแหน่งเปรียนฉาก)
         *          ให้เปรียนเป็นฉากที่ (n)
         *          set จุดเริ่มต้นของฉาก
         */
        if(locationCam == 0){
            if(user.getX() >= 744 & (user.getY() <= 180 && user.getY() >= 132)){
                this.setLocationCam(1);
                user.setX(48);
                user.setY(168);
            }
        }
        else if (locationCam == 1){
            if(user.getX() <= 6 & (user.getY() <= 180 && user.getY() >= 132)){
                this.setLocationCam(0);
                user.setX(696);
                user.setY(168);
            }
            else if(user.getY() >= 414 & (user.getX() <= 564 && user.getX() >= 450)){
                this.setLocationCam(2);
                user.setX(504);
                user.setY(6);
            }
        }
        else if(locationCam == 2){
            if(user.getY() <= 0 & (user.getX() <= 564 && user.getX() >= 450)){
                this.setLocationCam(1);
                user.setX(504);
                user.setY(402);
            }
            else if(user.getX() <= 378 & (user.getY() <= 160 && user.getY() >= 60)){
                this.setLocationCam(3);
                user.setX(732);
                user.setY(270);
            }
            else if(user.getY() >= 360 & (user.getX() <= 558 && user.getX() >= 450)){
                this.setLocationCam(7);
                user.setX(498);
                user.setY(72);
            }
        }
        else if(locationCam == 3){
            if(user.getY() >= 414 & (user.getX() <= 342 && user.getX() >= 318)){
                this.setLocationCam(4);
                user.setX(330);
                user.setY(156);
            }
            if(user.getX() >= 756 & (user.getY() <= 312 && user.getY() >= 210)){
                this.setLocationCam(2);
                user.setX(408);
                user.setY(114);
            }
        }
        else if(locationCam == 4){
            if(user.getY() <= 66 & (user.getX() <= 342 && user.getX() >= 318)){
                this.setLocationCam(3);
                user.setX(330);
                user.setY(348);
            }
            if(user.getX() >= 756 & (user.getY() <= 342 && user.getY() >= 210)){
                this.setLocationCam(7);
                user.setX(402);
                user.setY(162);
            }
            if(user.getX() <= 132 & (user.getY() <= 312 && user.getY() >= 210)){
                this.setLocationCam(5);
                user.setX(438);
                user.setY(300);
            }
        }
        else if(locationCam == 5){
            if(user.getX() >= 540 & (user.getY() <= 342 && user.getY() >= 240)){
                this.setLocationCam(4);
                user.setX(246);
                user.setY(300);
            }
            if(user.getY() <= -12 & (user.getX() <= 302 && user.getX() >= 18)){
                this.setLocationCam(6);
                user.setX(192);
                user.setY(282);
            }
        }
        else if(locationCam == 6){
            if(user.getY() >= 414 & (user.getX() <= 342 && user.getX() >= 18)){
                this.setLocationCam(5);
                user.setX(192);
                user.setY(156);
            }
        }
        else if(locationCam == 7){
            if(user.getY() <= 0 & (user.getX() <= 564 && user.getX() >= 450)){
                this.setLocationCam(2);
                user.setX(504);
                user.setY(216);
            }
            else if(user.getY() >= 246 & (user.getX() <= 744 && user.getX() >= 444)){
                this.setLocationCam(8);
                user.setX(492);
                user.setY(18);
            }
            else if(user.getX() <= 390 & (user.getY() <= 198 && user.getY() >= 150)){
                this.setLocationCam(4);
                user.setX(714);
                user.setY(324);
            }
        }
        else if(locationCam == 8){
            if(user.getY() <= -6 & (user.getX() <= 558 && user.getX() >= 444)){
                this.setLocationCam(7);
                user.setX(504);
                user.setY(210);
            }
            if(user.getX() <= 204 & (user.getY() <= 384 && user.getY() >= 312)){
                this.setLocationCam(9);
                user.setX(504);
                user.setY(354);
            }
        }
        else if(locationCam == 9){
            if(user.getX() >= 503 & (user.getY() <= 384 && user.getY() >= 300)){
                this.setLocationCam(8);
                user.setX(222);
                user.setY(354);
            }
            if((user.getX() <= 264 && user.getX() >= 246) & (user.getY() <= 360 && user.getY() >= 354)){
                this.setLocationCam(10);
                user.setX(276);
                user.setY(222);
            }
        }
        else if(locationCam == 10){
            if((user.getX() <= 276 && user.getX() >= 268) & (user.getY() <= 182 && user.getY() >= 174)){
                this.setLocationCam(9);
                user.setX(258);
                user.setY(318);
            }
        }
    }

    public void setLocationCam(int locationCam) {
        this.locationCam = locationCam;
    }
}
