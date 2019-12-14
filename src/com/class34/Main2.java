package com.class34;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main2 {

	public static void main(String[] args) {

		LinkedHashSet<String> lhSet = new LinkedHashSet<>();
		lhSet.add("third");
		lhSet.add("first");
		;
		lhSet.add("seconed");

		System.out.println(lhSet);

		Iterator<String> it = lhSet.iterator();

		while (it.hasNext()) {

			it.next();
			it.remove();

		}
		System.out.println(lhSet);

	}

}
