package design_pattern.structural.adapter.example2.player;

import design_pattern.structural.adapter.example2.CONST;
import design_pattern.structural.adapter.example2.player.adapter.MediaAdapter;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // inbuilt support to play mp3 music files
        if (audioType.equalsIgnoreCase(CONST.AudioType.mp3.toString())) {
            System.out.println("Playing mp3 file. Name: " +fileName);
        }
        // mediaAdapter is providing support to play other file formats
        else if(audioType.equalsIgnoreCase(CONST.AudioType.vlc.toString()) ||
                audioType.equalsIgnoreCase(CONST.AudioType.mp4.toString())) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " +audioType+ " format not supported");
        }
    }
}
