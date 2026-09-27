package by.prakharenkau.springcourse;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	
	@Value("${musicPlayer.name}")
	private String name;
	@Value("${musicPlayer.volume}")
	private int volume;
	
	private Music music1;
	private Music music2;
	private Music music3;
	private Random rand = new Random();

	@Autowired
	public MusicPlayer(@Qualifier("classicalMusic") Music music1, 
			@Qualifier("rockMusic") Music music2,
			@Qualifier("jazzMusic") Music music3) {
		super();
		this.music1 = music1;
		this.music2 = music2;
		this.music3 = music3;
	}

	public String playMusic(MusicGenres genre) {
		switch (genre) {
		case CLASSICAL:
			return music1.getSongs().get(rand.nextInt(3));
		case ROCK:
			return music2.getSongs().get(rand.nextInt(3));
		case JAZZ:
			return music3.getSongs().get(rand.nextInt(3));

		}
		return "";
	}
	

	public String getName() {
		return name;
	}

	public int getVolume() {
		return volume;
	}	
}
