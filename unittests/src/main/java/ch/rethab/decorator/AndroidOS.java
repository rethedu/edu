package ch.rethab.decorator;

public class AndroidOS extends OSDecorator {
	
	private final Smartphone smartphone;
	
	public AndroidOS(Smartphone smartphone) {
		this.smartphone = smartphone;
	}

	public String getModel() {
		return this.smartphone.getModel();
	}

	public String getFeatures() {
		return this.smartphone.getFeatures() + ", Panomara Pictures";
	}

}
