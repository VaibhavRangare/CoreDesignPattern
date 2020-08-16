package structural.adapter;

public class AdvancedPlayerAdapter implements Player {

	AdvancePlayer ap;
	String type;

	@Override
	public void play() {
		if (type.equals("digital")) {
			ap.playDigital();
		} else if (type.equals("surround")) {
			ap.playSurround();
		}
	}

	public AdvancedPlayerAdapter(String type) {
		if (type.equals("digital")) {
			ap = new DigitalPlayer();
			this.type = type;
		} else if (type.equals("surround")) {
			ap = new SurroundPlayer();
			this.type = type;
		}
	}

}
