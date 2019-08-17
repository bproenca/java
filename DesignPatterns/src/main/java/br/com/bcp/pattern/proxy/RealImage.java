package br.com.bcp.pattern.proxy;

class RealImage implements Image {
	private final String filename;

	public RealImage(final String filename) {
		this.filename = filename;
		loadImageFromDisk();
	}

	public void displayImage() {
		System.out.println("Displaying " + filename);
	}

	private void loadImageFromDisk() {
		// Potentially expensive operation
		// ...
		System.out.println("Loading   " + filename);
	}
}
