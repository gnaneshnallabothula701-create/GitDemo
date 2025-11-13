import java.util.HashMap;
import java.util.Map;

public class CountWordOccurence {

	public static void main(String[] args) {
		
		String str = "I am am learn learn java java java programming programming programming programming";
		String[] arr = str.split(" ");
		Map<String,Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i]))
				map.put(arr[i], 1);
			else
				map.put(arr[i], map.get(arr[i])+1);	
		}
		
		for(String key:map.keySet()) {
			System.out.println(key +" -- "+map.get(key));
		}
		
		
		
		
		
	}

}
