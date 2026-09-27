package by.prakharenkau.springcourse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
	
	@Bean
	public ClassicalMusic classicalMusic() {
		return new ClassicalMusic();
	}
	
	@Bean
	public RockMusic rockMusic() {
		return new RockMusic();
	}
	
	@Bean
	public JazzMusic jazzMusic() {
		return new JazzMusic();
	}
	
	@Bean
	public List<Music> listMusics() {
		List<Music> listMusics =  new ArrayList<Music>();
		listMusics.add(classicalMusic());
		listMusics.add(rockMusic());
		listMusics.add(jazzMusic());
		return listMusics;
	}
	
	@Bean
	public MusicPlayer musicPlayer() {
		return new MusicPlayer(listMusics());
	}
	
	@Bean
	public Computer computer () {
		return new Computer(musicPlayer());
	}
	
}
