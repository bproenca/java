package br.com.bcp;

import java.util.HashMap;
import java.util.Map;

public class StrongCache implements Cache {

	private final Map<Integer, MyObject> myObjects = new HashMap<Integer, MyObject>();

	public void add(MyObject myObject) {
		myObjects.put(myObject.getId(), myObject);
	}

	public boolean contains(int id) {
		return myObjects.containsKey(id);
	}

}
