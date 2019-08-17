package br.com.bcp.pattern.proxy;

class ProxyImage implements Image {
	private final String filename;
	private Image image;

	public ProxyImage(final String filename) {
		this.filename = filename;
	}

	public void displayImage() {
		System.out.println("Proxy - displayImage()");
		if (image == null) {
			image = new RealImage(filename); // load only on demand
		}
		image.displayImage();
	}
}
