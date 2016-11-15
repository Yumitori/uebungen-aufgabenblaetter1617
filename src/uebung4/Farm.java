package uebung4;

class Farm {

	public static void main(String[] args) {
		
		Cow cow1 = new Cow("Berta");
		Cow cow2 = new Cow("Hilde");
		Cow cow3 = new Cow("Miltank");
		Cow cow4 = new Cow("Hoeneﬂ");
			
		System.out.println( cow1.getName() ); 
		System.out.println( cow2.getName() );
		System.out.println( cow3.getName() );
		
		System.out.println("Anzahl: " + Cow.getcowCounter() );
		
		Farmer farmer = new Farmer();
		System.out.println("Kuh hungrig: "+ cow1.isHungry());
		farmer.feedCow(cow1);
		System.out.println("Kuh hungrig: "+ cow1.isHungry());
	}

}
