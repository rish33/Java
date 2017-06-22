package linkedList;

import java.util.*;

public class LinkedListExample {
	public static void main(String args[]) {

		LinkedList<String> al = new LinkedList<String>();
		al.addFirst("Ravi");
		al.add("Vijay");
		al.addLast("Ravi");
		al.add("Ajay");
		al.removeFirst();

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}