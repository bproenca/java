package br.com.bcp;

import junit.framework.Assert;

import org.junit.Test;

public class CacheTest {
	
	// if any object was removed before the end of execution,
	// try to reduce de amount of memory (JVM)
	@Test
	public void test_weak_cache() {
		Cache cache = new WeakCache();
		for (int i = 1; i < 100000; i++) {
			cache.add(new MyObject(i));
			if(!cache.contains(1)) {
				System.out.println("[weak] Gone in iteration " + i);
				return;
			}
		}
		System.out.println("[weak] All objects were cached");
		Assert.assertFalse("[weak] Try to reduce de amount of memory (JVM)", true);
	}

	@Test
	public void test_strong_cache() {
		Cache cache = new StrongCache();
		for (int i = 1; i < 100000; i++) {
			cache.add(new MyObject(i));
			if(!cache.contains(1)) {
				System.out.println("[strong] Gone in iteration " + i);
				Assert.assertFalse("[strong] Should stay until the end", true);
			}
		}
		System.out.println("[strong] All objects were cached");
	}
	

}
