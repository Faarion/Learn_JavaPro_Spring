package by.prakharenkau.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

public class JazzMusic implements Music {
	
	private List<String> musics = new ArrayList<String>();
	private Random rand = new Random();
	
	public JazzMusic() {
		super();
		this.musics.add("Caravan");
		this.musics.add("Strange Fruit");
		this.musics.add("Feeling Good");
	}

	@Override
	public String getSong() {
		int i = rand.nextInt(musics.size());
		return musics.get(i);
	}
	
	@Override
	public String toString() {
		return "Genres: Jazz Music";
	}
}
