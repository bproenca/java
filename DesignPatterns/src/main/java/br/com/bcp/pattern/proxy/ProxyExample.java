package br.com.bcp.pattern.proxy;

class ProxyExample {
	public static void main(final String[] args) {
		final Image image1 = new ProxyImage("HiRes_10MB_Photo1");
		final Image image2 = new ProxyImage("HiRes_10MB_Photo2");
		final Image image3 = new ProxyImage("HiRes_10MB_Photo3");

		image1.displayImage(); // loading necessary
		image2.displayImage(); // loading necessary
		image2.displayImage(); // no loading necessary; already done
		// the third image will never be loaded - time saved!
	}
}
