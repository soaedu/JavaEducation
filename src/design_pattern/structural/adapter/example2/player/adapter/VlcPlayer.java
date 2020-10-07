package design_pattern.structural.adapter.example2.player.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " +fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }
}
