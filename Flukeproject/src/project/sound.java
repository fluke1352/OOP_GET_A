package project;

import javax.sound.sampled.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sound {
    public Clip clip;
    public sound(String p){
        try {
            AudioInputStream sound = AudioSystem.getAudioInputStream(getClass().getResource(p));
            clip = AudioSystem.getClip();
            clip.open(sound);
            clip.setFramePosition(0);
            FloatControl gaiControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            double gain = 1;
            float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
            gaiControl.setValue(dB);
            clip.start();
        } catch (LineUnavailableException e) {
            System.out.println(e);
            Logger.getLogger(loopsound.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            System.out.println(e);
            Logger.getLogger(loopsound.class.getName()).log(Level.SEVERE, null, e);
        } catch (UnsupportedAudioFileException e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }


}
