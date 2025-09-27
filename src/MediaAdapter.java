public class MediaAdapter implements MediaPlayer {
    private Mp4Player mp4Player;

    public MediaAdapter() {
        mp4Player = new Mp4Player();
    }

    @Override
    public void play(String fileName) {
        mp4Player.play(fileName);
    }
}
