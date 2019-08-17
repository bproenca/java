package br.com.bcp.pattern.singleton;

/**
 * If and only if the compiler used is Java 5 (also known as Java 1.5) or newer,
 * AND all Java virtual machines the application is going to run on fully
 * support the Java 5 memory model, then (and only then) the volatile double
 * checked locking can be used (for a detailed discussion of why it should never
 * be done before Java 5 see The "Double-Checked Locking is Broken"
 * Declaration):
 * 
 * @author $author
 * @version $revision
 * @create $date
 */
public class SingletonJava5 {
	private static volatile SingletonJava5 INSTANCE;

	public static SingletonJava5 getInstance() {
		synchronized (Singleton.class) {
			if (INSTANCE == null) {
				INSTANCE = new SingletonJava5();
			}
		}
		return INSTANCE;
	}

	// Protected constructor is sufficient to suppress unauthorized
	// calls to the constructor
	protected SingletonJava5() {
	}
}

/*
 * Allen Holub (in "Taming Java Threads", Berkeley, CA: Apress, 2000, pp.
 * 176–178) notes that on multi-CPU systems (which are widespread as of 2007),
 * the use of volatile may have an impact on performance approaching to that of
 * synchronization, and raises the possibility of other problems. Thus this
 * solution has little to recommend it over Pugh's solution described above.
 */