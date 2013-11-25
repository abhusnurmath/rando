package collections;

import java.util.*;

public class ListExample {

	public static void main(String args[]) {
		String[] array = { "Phil", "Mary", "Betty", "bob" };
		List<String> myList = Arrays.asList(array);
		Collections.sort(myList);
		System.out.println("Sorted: " + myList);
		int where = Collections.binarySearch(myList, "bob");
		System.out.println("bob is at " + where);
		Collections.shuffle(myList);
		System.out.println("Shuffled: " + myList);
		printAll(myList);
	}
	
	static void printAll (Collection coll) {
		for (Object o: coll){
			System.out.println(o);
		}
	}
}