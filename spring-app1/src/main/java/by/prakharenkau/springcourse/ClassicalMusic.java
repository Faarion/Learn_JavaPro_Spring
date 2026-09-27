package by.prakharenkau.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class ClassicalMusic implements Music{
	
	private List<String> musics = new ArrayList<String>();
	private Random rand = new Random();
	
	public ClassicalMusic() {
		super();
		this.musics.add("Peer Gynt Suite");
		this.musics.add("Symphony No. 5 in C minor, op. 67, \"Fate\": I. Allegro con brio");
		this.musics.add("The Four Seasons, op. 8, \"Spring\": Allegro");
	}
	
	@PostConstruct
	public void doMyInit() {
		System.out.println("Doing my initialization");
	}
	
	@PreDestroy
	public void doMyDestroy() {
		System.out.println("Doing my destroy");
	}
	
	@Override
	public String getSong() {
		int i = rand.nextInt(musics.size());
		return musics.get(i);
	}

	@Override
	public String toString() {
		return "Genres: Classical Music";
	}
	
	
}
