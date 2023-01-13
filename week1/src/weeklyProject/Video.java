package weeklyProject;

import interfaces.Brightness;
import interfaces.Volume;

public class Video extends MediaElement implements Brightness, Volume{

	public Video(String titolo, int durata) {
		super(titolo, durata);
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

	@Override
	public int addBrightness() {
		if (volume < 10) {
			return brightness++;
		} else {
			System.out.println("Max brightness!");
		}
		return brightness;
	}

	@Override
	public int reduceBrightness() {
		if (volume > 0) {
			return brightness--;
		} else {
			System.out.println("Min brightness!");
		}
		return brightness;
	}
	
	@Override
    public String toString() {
        return "VIDEO - " + "Video title: " + this.title + " Duration:" + this.duration;
    }

}
