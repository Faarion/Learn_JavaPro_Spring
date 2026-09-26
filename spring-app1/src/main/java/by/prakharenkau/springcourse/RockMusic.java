package by.prakharenkau.springcourse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
	
	private List<String> musics = new ArrayList<String>();

	public RockMusic() {
		super();
		musics.add("Wind cries Mary");
		musics.add("Can't stop");
		musics.add("Hotel California");
	}

	@Override
	public  List getSongs() {
		return musics;
	}

}
