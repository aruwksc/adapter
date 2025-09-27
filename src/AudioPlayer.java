public class AudioPlayer {
    private MediaPlayer mediaPlayer;

    public void play(String fileName, String format) {
        if ("mp3".equalsIgnoreCase(format)) {
            mediaPlayer = new Mp3Player();
            mediaPlayer.play(fileName);
        } else if ("mp4".equalsIgnoreCase(format)) {
            mediaPlayer = new MediaAdapter();
            mediaPlayer.play(fileName);
        } else {
            System.out.println("Invalid format: " + format);
        }
    }
}
