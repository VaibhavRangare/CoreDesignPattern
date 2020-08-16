package structural.adapter;

public class PlayerClient {

	public static void main(String[] args) {
		AudioPlayer apa = new AudioPlayer("surround");
		apa.play();
	}

}
