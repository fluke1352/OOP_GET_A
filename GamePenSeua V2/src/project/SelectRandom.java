/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Nickky
 *
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import org.w3c.dom.events.MouseEvent;

public class SelectRandom extends JFrame implements MouseListener {

    public static final int w = 814, h = 500;
    private ImageIcon unknown;
    private JLabel img, map, welcome;
    public static Battle mainGame = new Battle();

    public SelectRandom() {
        setSize(w, h);
        unknown = new ImageIcon(getClass().getResource("image/unknown.png"));
        img = new JLabel(unknown);
        welcome = new JLabel("Welcome");
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        JLayeredPane pane = getLayeredPane();
        Font font = new Font("Virtual Dj", Font.BOLD, 48);
        Font font2 = new Font("Virtual Dj", Font.BOLD, 24);
        map = new JLabel("map 1/5");
        map.setFont(font2);

        welcome.setBounds(310, 50, 500, 50);
        welcome.setFont(font);

        img.setBounds(0, 0, w, h);
        map.setBounds(350, 400, 500, 50);
        pane.add(map);
        pane.add(welcome);
        pane.add(img);
        this.setResizable(false);

        setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        img.addMouseListener(this);

    }

    public static void main(String[] args) {
        new SelectRandom();

    }



    @Override
    public void mouseClicked(java.awt.event.MouseEvent me) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent me) {
       if (me.getSource().equals(img)){

           dispose();
       }
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent me) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent me) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent me) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
