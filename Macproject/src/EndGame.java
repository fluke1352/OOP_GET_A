import javax.swing.*;
import java.awt.*;

public class EndGame extends JFrame{
    public static final int w = 814, h = 500;
    private ImageIcon imageEnd;
    private JLabel img;
    private JButton newGame, exitGame;
    private JLayeredPane layerEnd;

    public EndGame(){
        super("End");
        setSize(w, h);
        imageEnd = new ImageIcon(getClass().getResource("image/EndGame.png"));
        img = new JLabel(imageEnd);
        newGame = new JButton("New Game");
        exitGame = new JButton("Exit");
        JLayeredPane pane = getLayeredPane();

        newGame.setBounds(200, 300, 100, 50);
        newGame.setBackground(Color.LIGHT_GRAY);
        exitGame.setBounds(500, 300, 100, 50);
        exitGame.setBackground(Color.LIGHT_GRAY);
        img.setBounds(0, 0, w, h);
        setLocationRelativeTo(null);

        pane.add(img, 1);
        pane.add(newGame, 2);
        pane.add(exitGame, 3);

    }
    public static void main(String[] args) {
        EndGame mac = new EndGame();
        mac.setVisible(true);
    }
}
