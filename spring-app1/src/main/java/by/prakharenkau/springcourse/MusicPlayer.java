package by.prakharenkau.springcourse;

public class MusicPlayer {
	private Music music;
	
	public MusicPlayer(Music music) {
		this.music = music;
	}
	
	public void playMusic() {
		System.out.println(music.getSong());
	}

	public void setMusic(Music music) {
		this.music = music;
	}
	
	
}
