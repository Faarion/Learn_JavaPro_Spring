package by.prakharenkau.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	
	private ClassicalMusic classicalMusic;
	private RockMusic rockMusic;
	private JazzMusic jazzMusic;
	
	@Autowired
	public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, JazzMusic jazzMusic) {
		super();
		this.classicalMusic = classicalMusic;
		this.rockMusic = rockMusic;
		this.jazzMusic = jazzMusic;
	}

	public String playMusic() {
		return "Playing "  + classicalMusic.getSong();
//		System.out.println("Playing"  + classicalMusic.getSong());
//		System.out.println("Playing"  + rockMusic.getSong());
//		System.out.println("Playing"  + jazzMusic.getSong());
	}

//	@Autowired
//	public void setMusic(Music music) {
//		this.music = music;
//	}
	
	
}
