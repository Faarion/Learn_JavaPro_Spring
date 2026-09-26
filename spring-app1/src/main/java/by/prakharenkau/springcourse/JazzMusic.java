package by.prakharenkau.springcourse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {
	
	private List<String> musics = new ArrayList<String>();
	
	public JazzMusic() {
		super();
		this.musics.add("Caravan");
		this.musics.add("Strange Fruit");
		this.musics.add("Feeling Good");
	}

	@Override
	public List getSongs() {
		return musics;
	}
}
