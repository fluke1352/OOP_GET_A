import javax.swing.JFrame;
import java.awt.*;

/**
 *
 * เป็นClass ที่ไว้สร้าง Jframe หลักที่ใว้ display หน้า map กับ ตัวละคร จะถูก add ไว้ในนี้
 *
 */
public class map {
    public static final int w = 814, h = 500; //Attributes ที่เป็นตัวตั้งค่า ขนาด Jframe
    
    public map() {
        JFrame fr = new JFrame("พันถุ์เสือ");
        fr.setSize(w,h);
        fr.setResizable(false); // กำหนดให้ไม่สามารถขยาย หน้าต่างเกมได้
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        fr.setLocationRelativeTo(null); // กำหนดให้ Jframe อยู่ตรงกลางหน้าจอ
//        fr.setPreferredSize(new Dimension(w, h));
//        fr.getContentPane().setBackground(Color.BLACK);
        fr.add(new MacGame()); // สร้าง class MacGame
        fr.setVisible(true);
    }

}
