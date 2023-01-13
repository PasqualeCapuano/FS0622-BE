package weeklyProject;

import interfaces.Brightness;

public class Picture extends MediaElement implements Brightness{

	public Picture(String title, int brightness) {
		super(title, brightness);
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

}
