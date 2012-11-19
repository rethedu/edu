package ch.rethab.decorator;

public class AndroidOS extends OSDecorator {
	
	private final Smartphone smartphone;
	
	public AndroidOS(Smartphone smartphone) {
		this.smartphone = smartphone;
	}

	@Override
	public String getModel() {
		return this.smartphone.getModel();
	}

	@Override
	public String getFeatures() {
		return this.smartphone.getFeatures() + ", Panomara Pictures";
	}

}
