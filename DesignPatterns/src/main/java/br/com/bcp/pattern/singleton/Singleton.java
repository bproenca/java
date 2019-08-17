package br.com.bcp.pattern.singleton;

/**
 * The solution of Bill Pugh This is the recommended method. It is known as the
 * initialization on demand holder idiom and is as lazy as possible. Moreover,
 * it works in all known versions of Java. This solution is the most portable
 * across different Java compilers and virtual machines. The inner class is
 * referenced no earlier (and therefore loaded no earlier by the class loader)
 * than the moment that getInstance() is called. Thus, this solution is
 * thread-safe without requiring special language constructs (i.e. volatile
 * and/or synchronized).
 * 
 * 
 * @author $author
 * @version $revision
 * @create $date
 */
public class Singleton {
	/**
	 * SingletonHolder is loaded on the first execution of
	 * Singleton.getInstance() or the first access to SingletonHolder.instance ,
	 * not before.
	 */
	private static class SingletonHolder {
		private final static Singleton INSTANCE = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

	// Protected constructor is sufficient to suppress unauthorized
	// calls to the constructor
	protected Singleton() {
	}
}