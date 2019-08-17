package br.com.bcp.pattern.singleton;

/**
 * Just like the one above, this solution is thread-safe without requiring
 * special language constructs, but it lacks the laziness. The INSTANCE is
 * created as soon as the Singleton class loads. That might even be long before
 * getInstance() is called. It might be (for example) when some static method of
 * the class is used. If laziness is not needed or the instance needs to be
 * created early in the application's execution, this (slightly) simpler
 * solution can be used:
 * 
 * @author $author
 * @version $revision
 * @create $date
 */
public class SingletonTraditional {
	public final static SingletonTraditional INSTANCE = new SingletonTraditional();

	// Protected constructor is sufficient to suppress unauthorized
	// calls to the constructor
	protected SingletonTraditional() {
	}
}

/*
 * Sometimes the static final field is made private and a static factory-method
 * is provided to get the instance. This way the underlying implementation may
 * change easily while it has no more performance-issues on modern JVMs.
 */
