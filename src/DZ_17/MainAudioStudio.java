package DZ_17;

public class MainAudioStudio {
    public static void main(String[] args) {
        MusicStyles popGroup = new PopMusic();
        MusicStyles rockGroup = new RockMusic();
        MusicStyles classicGroup = new ClassicMusic();

        MusicStyles[] groups = {popGroup, rockGroup, classicGroup};
        for (MusicStyles play: groups) {
            play.playMusic();
        }
    }
}
