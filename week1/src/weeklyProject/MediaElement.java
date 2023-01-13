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

		if (MediaElement.this instanceof Audio) {
			for (int i = this.duration; i > 0; i--) {
				System.out.printf("%n- Title: %s | volume: ", this.title);
				for (int v = this.volume; v > 0; v--) {
					System.out.print("!");
				}
			}

			System.out.printf("%n-----------------------------------------------");
			
		} else if (MediaElement.this instanceof Video) {
			for (int i = this.duration; i > 0; i--) {
				
				System.out.printf("%n- Title: %s | volume: ", this.title);
				for (int v = this.volume; v > 0; v--) {
					System.out.print("!");
				}
				System.out.printf(" | brightness: ");

				for (int b = this.brightness; b > 0; b--) {
					System.out.print("*");
				}
				
			}

			System.out.printf("%n-----------------------------------------------");
		} else {
			show();
		}

	}

	public void show() {
		System.out.printf("%n- Title: %s", this.title);
		System.out.printf(" | brightness: ");
		for (int v = this.brightness; v > 0; v--) {
			System.out.print("*");
		}
		
		System.out.printf("%n-----------------------------------------------");
	}
	
}
