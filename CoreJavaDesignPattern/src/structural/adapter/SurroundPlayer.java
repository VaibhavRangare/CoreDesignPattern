package structural.adapter;

public class SurroundPlayer implements AdvancePlayer {

	@Override
	public void playDigital() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playSurround() {
		System.out.println("Playing Surround");

	}

	public String toString() {
		return "Advanced Surround Player";
	}

}
