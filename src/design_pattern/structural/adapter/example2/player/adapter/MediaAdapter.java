package design_pattern.structural.adapter.example2.player.adapter;

import design_pattern.structural.adapter.example2.CONST;
import design_pattern.structural.adapter.example2.player.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase(CONST.AudioType.vlc.toString())) {
            advancedMediaPlayer = new VlcPlayer();
        } else if(audioType.equalsIgnoreCase(CONST.AudioType.mp4.toString())) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType,
                     String fileName) {
        if(audioType.equalsIgnoreCase(CONST.AudioType.vlc.toString())) {
            advancedMediaPlayer.playVlc(fileName);
        } else if(audioType.equalsIgnoreCase(CONST.AudioType.mp4.toString())) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
