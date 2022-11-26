package _08_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class _03_Map1 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("아메리카노", 1500);
		hm.put("카페라떼", 2500);
		hm.put("카라멜마끼아또", 3500);
		hm.put("주스", 4500);
		hm.put("케이크", 5500);
		
		System.out.println(hm.containsKey("아메리카노"));
		System.out.println(hm.containsValue(2500));
		System.out.println(hm.get("주스"));
		hm.remove("케이크");
		System.out.println(hm.keySet());
		
		Set<String> keySet = hm.keySet();
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("메뉴: "+key + "\t 가격: " + hm.get(key));
		}
	}
}
