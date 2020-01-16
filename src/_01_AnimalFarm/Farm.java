package _01_AnimalFarm;

public abstract class Farm {
	
	public static void main(String[] args) {
		Animal[] farm = new Animal[4];
		farm[0] = new Cow() {};
		farm[1] = new Alpaca() {};
		farm[2] = new AnglerFish() {};
		farm[3] = new Ant() {};
		
		for (int i = 0; i < farm.length; i++) {
			System.out.println("");
			farm[i].makeNoise();
			farm[i].beDumb();
		}
	}
	
}
