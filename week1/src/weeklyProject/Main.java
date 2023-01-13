package weeklyProject;

public class Main {

	public static void main(String[] args) {
		
		Audio a1 = new Audio("Mr. Brightside - The Killers", 10);
		
		Video v1 = new Video("Avatar", 10);
		
		Picture p1 = new Picture("www.lemonparty.org", 10);
		
		
		a1.addVolume();
		a1.addVolume();
		a1.addVolume();
		a1.play();
		v1.addVolume();
		v1.addVolume();
		v1.addVolume();
		v1.addBrightness();
		v1.addBrightness();
		v1.play();
		p1.addBrightness();
		p1.show();
		p1.play();
	}

}
