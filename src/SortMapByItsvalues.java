import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapByItsvalues {
	public static void main(String[] args) {
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		 map.put('A', 2);
		 map.put('D', 5);
		 map.put('E', 7);
		 map.put('K', 3);
		 map.put('F', 4);
		 
		List<Integer> li = new ArrayList<Integer>();
		for(Entry<Character,Integer> entry : map.entrySet()) {
			li.add(entry.getValue());
		}
		
		Collections.sort(li);
		System.out.println(li);
		
		Map<Character,Integer> sortedMap= new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<li.size();i++) {
			for(Entry<Character,Integer> entry : map.entrySet()) {
				if(li.get(i).equals(entry.getValue())) {
					sortedMap.put(entry.getKey(), li.get(i));
					System.out.println(entry.getKey() +" -- "+ li.get(i));
				}
				
			}
		}
		
		
		
		
		 
	}

}
