package weeklyProject;

abstract public class MediaElement {

	String title;
	int duration;
	int volume;
	int brightness;

	public MediaElement(String title, int duration) {

		this.title = title;
		this.duration = duration;
	}

	public void play() {
		
		
		if(MediaElement.this instanceof Audio) {	
			System.out.println();
			for(int i = this.duration; i > 0; i--) {
				System.out.println("Title: " + this.title.toUpperCase() + " - Duration: " + i + " - Volume: " + this.volume);
			}
			
			System.out.println("-----------------------------------------------");
		} else if(MediaElement.this instanceof Video) {
			for(int i = this.duration; i > 0; i--) {
				System.out.println("Title: " + this.title +  " - Duration: " + i + " - Volume: " + this.volume + " - Brightness: " + this.brightness);
			}
			
			System.out.println("-----------------------------------------------");
		} else {
			System.out.println("Per riprodurre l'immagine " + this.title.toUpperCase() + " usa il metodo: play();");
		}
		
		
	}

	public void show() {
		System.out.println("Title: " + this.title + " - Brightness: " + this.brightness);
		System.out.println("-----------------------------------------------");
	}

}
