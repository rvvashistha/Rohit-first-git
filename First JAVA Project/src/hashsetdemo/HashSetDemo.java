package hashsetdemo;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashset = new HashSet<>();

		hashset.add("rohit");
		hashset.add("rahul");
		hashset.add("karan");

		hashset.add("rohit");
		hashset.add("rima");
		hashset.add("kush");

		// System.out.println(hashset);

		Iterator<String> itr = hashset.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());

		}
		System.out.println();

	}

}
