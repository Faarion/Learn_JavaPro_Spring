package by.prakharenkau.springcourse;

public class ClassicalMusic implements Music{
	
	private ClassicalMusic() {}

	public void doMyInit() {
		System.out.println("Doing my initialization");
	}
	
	public void doMyDestroy() {
		System.out.println("Doing my destruction");
	}
	
	public static ClassicalMusic getClassicalMusic() {
		return new ClassicalMusic();
	}
	
	@Override
	public String getSong() {
		return "Hungarian Rhapsodi";
	}

	@Override
	public String toString() {
		return "Hungarian Rhapsodi";
	}
}
