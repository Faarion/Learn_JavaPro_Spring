package by.prakharenkau.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

public class RockMusic implements Music {
	
	private List<String> musics = new ArrayList<String>();
	private Random rand = new Random();

	public RockMusic() {
		super();
		musics.add("Wind cries Mary");
		musics.add("Can't stop");
		musics.add("Hotel California");
	}

	@Override
	public String getSong() {
		int i = rand.nextInt(musics.size());
		return musics.get(i);
	}
	
	@Override
	public String toString() {
		return "Genres: Rock Music";
	}

}
