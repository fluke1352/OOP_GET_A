package project;

public class useSound {
    private loopsound ls = new loopsound();
    private sound s = new sound();

    public void playerATK(){
        s.useSound("sound/PlayerATK.wav");
    }

    //เพลงตอนชนะ
    public void winnerBoss(){
        s.useSound("sound/Winner.wav");
    }

    public void bossATK(){
        s.useSound("sound/BossATK.wav");
    }

    //หน้าเริ่มเกมของ TK
    public void backGround1(){
        ls.useSoundBackGround("sound/BG1.wav");
    }

    public void backGround2(){
        ls.useSoundBackGround("sound/BG2.wav");
    }

    public void backGround3(){
        ls.useSoundBackGround("sound/BG3.wav");
    }

    public void stop(){
        ls.clip.stop();
    }
}
