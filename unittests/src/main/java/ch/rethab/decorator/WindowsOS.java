package ch.rethab.decorator;

public class WindowsOS extends OSDecorator {
	
	private final Smartphone smartphone;
	
	public WindowsOS(Smartphone smartphone) {
		this.smartphone = smartphone;
	}

	@Override
	public String getModel() {
		return this.smartphone.getModel();
	}

	@Override
	public String getFeatures() {
		return this.smartphone.getFeatures() + ", Internet Explorer";
	}

}
