package part12_Abstraction;

public abstract class Car extends Vehicle1 {
	public abstract void openGate();

	public void playMusic()
	{
		System.out.println("Play the music in car");
	}
}
