package treeSet;

import java.util.*;

class treeSetExample {
	public static void main(String args[]) {
		// Creating and adding elements
		TreeSet<String> al = new TreeSet<String>();
		al.add("Ravi");
		al.add("Ajay");
		al.add("1");
		al.add("2");

		// Traversing elements
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
