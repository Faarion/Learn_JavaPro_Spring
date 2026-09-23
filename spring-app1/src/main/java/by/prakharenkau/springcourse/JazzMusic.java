package by.prakharenkau.springcourse;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {

	@Override
	public String getSong() {
		return "La Vie En Rose";
	}
	
	@Override
	public String toString() {
		return "La Vie En Rose";
	}

}
