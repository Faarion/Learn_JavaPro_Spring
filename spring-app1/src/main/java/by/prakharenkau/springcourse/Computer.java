package by.prakharenkau.springcourse;

public class Computer {

	private int id;
	private MusicPlayer musicPlayer;
	
	public Computer(MusicPlayer musicPlayer) {
		super();
		this.id = 1;
		this.musicPlayer = musicPlayer;
	}

	@Override
	public String toString() {
		Music music = musicPlayer.playMusic();
		return "Computer " + id + ". " + music +
				" - " + music.getSong();
	}
}
