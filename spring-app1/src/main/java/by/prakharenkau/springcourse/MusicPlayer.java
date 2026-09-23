package by.prakharenkau.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
	private List<Music> musicList = new ArrayList<Music>();
	
	private String name;
	private int volume;
	
	
	public MusicPlayer() {}
	
	public void playMusicList() {
		for (Music music : musicList) {
			System.out.println("Playing: " + music.getSong());
		}
	}
	
	public void doMyInit() {
		System.out.println("Initializing musicPlayer");
	}
	
	public void doMyDestroy() {
		System.out.println("Destroy musicPlayer");
	}
	
	

	@Override
	public String toString() {
		return "MusicPlayer [musicList=" + musicList + ", name=" + name + ", volume=" + volume + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public List<Music> getMusicList() {
		return musicList;
	}

	public void setMusicList(List<Music> musicList) {
		this.musicList = musicList;
	}

	public void setMusic(Music music) {
		this.music = music;
	}
	
	
}
