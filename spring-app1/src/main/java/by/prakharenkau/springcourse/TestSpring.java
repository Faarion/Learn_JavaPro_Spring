package by.prakharenkau.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Music music = context.getBean("musicBean", Music.class);
//		MusicPlayer musicPlayer = new MusicPlayer(music);
		
		Music music = context.getBean("classicalMusicBean", ClassicalMusic.class);
		System.out.println(music.getSong());
		
		MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		//musicPlayer.playMusicList();
		System.out.println(firstMusicPlayer);
		System.out.println(secondMusicPlayer);
		firstMusicPlayer.setVolume(100);
		System.out.println(firstMusicPlayer);
		System.out.println(secondMusicPlayer);
		
		context.close(); 
	}
}
