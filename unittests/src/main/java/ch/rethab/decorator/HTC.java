package ch.rethab.decorator;

public class HTC implements Smartphone {

	@Override
	public String getModel() {
		return "HTC Sense One";
	}

	@Override
	public String getFeatures() {
		return "Beats by Dr. Dre Integration";
	}
}
