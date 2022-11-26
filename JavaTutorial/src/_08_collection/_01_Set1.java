package _08_collection;

import java.util.HashSet;
import java.util.Iterator;

public class _01_Set1 {
	// 중복x
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		hs.add("one");
		hs.add("two");
		hs.add("one");
		hs.add("three");
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
