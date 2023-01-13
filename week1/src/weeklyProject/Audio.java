package weeklyProject;

import interfaces.Volume;

public class Audio extends MediaElement implements Volume {


	public Audio(String title, int duration) {
		super(title, duration);
	}

	@Override
	public int addVolume() {
		if (volume < 10) {
			return volume++;
		} else {
			System.out.println("Max volume!");
		}
		return volume;
	}

	@Override
	public int reduceVolume() {
		if (volume > 0) {
			return volume--;
		} else {
			System.out.println("Min volume!");
		}
		return volume;

	}

}
