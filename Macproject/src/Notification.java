import javax.swing.*;

public class Notification extends JFrame {
    private JFrame noti;
    private JLabel noti_text;
    public Notification(){
        this.noti =  new JFrame("Notification");
        this.noti_text = new JLabel("");
        noti.setSize(400,200);
        noti.setLocation(null);
        noti.add(noti_text);
        noti.setVisible(true);
    }
    public  Notification (String text){
        this();
        noti_text.setText(text);

    }



}
