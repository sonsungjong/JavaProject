package _08_collection;

import java.util.Iterator;
import java.util.TreeSet;

public class _01_Set2 {
	// 중복x, 자동정렬
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("one");
		ts.add("two");
		ts.add("one");
		ts.add("three");
		
		Iterator<String> it = ts.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
