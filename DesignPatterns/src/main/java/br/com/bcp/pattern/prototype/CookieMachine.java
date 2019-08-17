package br.com.bcp.pattern.prototype;

/** Client Class* */
public class CookieMachine {

	public static void main(final String args[]) {
		Cookie tempCookie = null;
		final Cookie prot = new CoconutCookie("cc");
		final CookieMachine cm = new CookieMachine(prot);
		for (int i = 0; i < 100; i++) {
			tempCookie = cm.makeCookie();
			System.out.println(tempCookie.toString());
			try {
				Thread.sleep(10);
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private final Cookie cookie;// could have been a private Cloneable cookie;

	public CookieMachine(final Cookie cookie) {
		this.cookie = cookie;
	}

	public Cookie makeCookie() {
		return (Cookie) cookie.clone();
	}
}