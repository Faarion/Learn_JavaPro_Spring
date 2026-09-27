package by.prakharenkau.springcourse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music{
	
	private List<String> musics = new ArrayList<String>();	
	
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
	public List<String> getSongs() {
		return musics;
	}
}
