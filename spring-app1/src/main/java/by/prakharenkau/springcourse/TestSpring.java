package by.prakharenkau.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Music music = context.getBean("rockMusic", Music.class);
		Music music2 = context.getBean("classicalMusic", Music.class);
		Music music3 = context.getBean("jazzMusic", Music.class);
		MusicPlayer musicPlayer = new MusicPlayer(music);
		musicPlayer.playMusic();
		musicPlayer.setMusic(music2);
		musicPlayer.playMusic();
		musicPlayer.setMusic(music3);
		musicPlayer.playMusic();
		context.close(); 
	}
}
