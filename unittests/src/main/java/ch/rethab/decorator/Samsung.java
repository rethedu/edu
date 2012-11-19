package ch.rethab.decorator;

public class Samsung implements Smartphone {

	@Override
	public String getModel() {
		return "Samsung Galaxy S III";
	}

	@Override
	public String getFeatures() {
		return "Smart TV Remote";
	}

}
