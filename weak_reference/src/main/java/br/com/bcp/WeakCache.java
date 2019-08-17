package br.com.bcp;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class WeakCache implements Cache {

	private final Map<Integer, WeakReference<MyObject>> myObjects = new HashMap<Integer, WeakReference<MyObject>>();

	public void add(MyObject myObject) {
		myObjects.put(myObject.getId(), new WeakReference<MyObject>(myObject));
	}

	public boolean contains(int id) {
		return myObjects.containsKey(id) && myObjects.get(id).get() != null;
	}

}
