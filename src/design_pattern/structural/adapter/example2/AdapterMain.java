package design_pattern.structural.adapter.example2;

import design_pattern.structural.adapter.example2.player.AudioPlayer;

public class AdapterMain {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(CONST.AudioType.mp3.toString(), "beyond the horizon.mp3");
        audioPlayer.play(CONST.AudioType.mp4.toString(),"alone.mp4");
        audioPlayer.play(CONST.AudioType.vlc.toString(), "far far away.vlc");
        audioPlayer.play(CONST.AudioType.avi.toString(),"mind me.avi");
    }
}
