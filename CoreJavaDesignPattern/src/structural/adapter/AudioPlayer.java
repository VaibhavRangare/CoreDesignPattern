package structural.adapter;

public class AudioPlayer implements Player {
	AdvancedPlayerAdapter apa;

	@Override
	public void play() {
		System.out.println("Playing Audio");
		apa.play();

	}

	public AudioPlayer(String type) {
		if (type.equals("digital")) {
			apa = new AdvancedPlayerAdapter(type);
		} else if (type.equals("surround")) {
			apa = new AdvancedPlayerAdapter(type);
		}
	}

}
