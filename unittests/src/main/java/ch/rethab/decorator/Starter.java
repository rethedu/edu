package ch.rethab.decorator;

public class Starter {

	public static void main(String[] args) {
		Smartphone[] smartphones = new Smartphone[] {
			 new AndroidOS(new Samsung()), 
			 new AndroidOS(new HTC()),
			 new WindowsOS(new Samsung()),
			 new WindowsOS(new HTC())
		};
		for (Smartphone smartphone : smartphones) {
			System.out.print("Smartphone Model: " + smartphone.getModel());
			System.out.println(", Features: " + smartphone.getFeatures());
		}
	}

}
