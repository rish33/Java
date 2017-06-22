package arrayList;

import java.util.*;

class arraylistAddAll {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.remove("Ravi");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Sonoo");
		al2.add("Hanumat");
		al.addAll(al2);// adding second list in first list
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
