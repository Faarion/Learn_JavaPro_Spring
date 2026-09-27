package by.prakharenkau.springcourse;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MusicPlayer {
	
	private ApplicationContext context;
	
	@Value("${musicPlayer.name}")
	private String name;
	@Value("${musicPlayer.volume}")
	private int volume;
	
	private List<Music> listMusics;
	
	private Random rand = new Random();

	public MusicPlayer(List<Music> listMusics) {
		super();
		this.listMusics = listMusics;
	}

	public Music playMusic() {
		return listMusics.get(rand.nextInt(listMusics.size()));
	}
	

	public String getName() {
		return name;
	}

	public int getVolume() {
		return volume;
	}	
}
