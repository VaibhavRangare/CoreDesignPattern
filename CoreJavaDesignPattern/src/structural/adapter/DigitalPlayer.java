package structural.adapter;

public class DigitalPlayer implements AdvancePlayer {

	@Override
	public void playDigital() {
		System.out.println("Playing Digital");

	}

	@Override
	public void playSurround() {
		// TODO Auto-generated method stub

	}

	public String toString() {
		return "Advanced Digital Player";
	}

}
