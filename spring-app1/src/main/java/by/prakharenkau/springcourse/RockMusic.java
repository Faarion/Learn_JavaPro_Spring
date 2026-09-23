package by.prakharenkau.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

	@Override
	public String getSong() {
		return "Wind cries Mary";
	}
	
	@Override
	public String toString() {
		return "Wind cries Mary";
	}


}
