package com.class33;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		boolean myList = list.isEmpty();
		System.out.println(myList);

		list.add("Syntax");
		boolean myList1 = list.isEmpty();

		System.out.println(myList1);
	}

}
