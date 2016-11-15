package uebung4;

class Cow {

	private String name;
	private boolean hungry = true;
	private static int cowCounter = 0;
	
	
	Cow (String name) {
		this.name = name;
		cowCounter++;
	}

	String getName() {
		return this.name;
	}
	static int getcowCounter () {
		return cowCounter;
	}
	public void toggleHungry() {
		hungry =! hungry;
	}

	public boolean isHungry() {
		return hungry;
	}
	
}
