package project3;

public class useSound {

    public static void playerATK(){
        new sound("sound/PlayerATK.wav");
    }
    public static void bossATK(){
        new sound("sound/BossATK.wav");
    }
    //หน้าเริ่มเกมของ TK
    public static void backGround1(){
        new loopsound("sound/BG1.wav");
    }

    //หน้าเลือกด้านของ P
    public static void backGround2(){
        new loopsound("sound/BG2.wav");
    }

    //หน้าเลือกต่อสู้ของทุกคนนนนน
    public static void backGround3(){
        new loopsound("sound/BG3.wav");
    }

    //เพลงตอนชนะ
    public static void winnerBoss(){
        new sound("sound/Winner.wav");
    }
}
