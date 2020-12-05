
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class keybord extends KeyAdapter {
    Takaiplayer p;

    public keybord(Takaiplayer p) {
        this.p = p;
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
//            player.key
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
