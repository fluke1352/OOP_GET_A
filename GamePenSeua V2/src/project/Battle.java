package project;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class Battle extends JPanel{
    public static final int w = 1000, h = 700;
    public static JFrame fr;
    private useSound us = new useSound();
    public static int count_map = 1;

    public Battle(){
        fr = new JFrame("Battle");
        fr.add(new Battle_Map(us, count_map));
        fr.setSize(w,h);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
        us.backGround2();
    }
}
