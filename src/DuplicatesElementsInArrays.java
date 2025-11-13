import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicatesElementsInArrays {
	
	public static void main(String[] args) {
		
		int[] arr = {2,4,6,1,2,5,8,9,1,11,12,12};
		usingBruteForce(arr);
		usingArraysSorting(arr);
		usingHashSet(arr);
		usingHashMap(arr);	
	}
	
	public static void usingBruteForce(int[] arr) {	
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j])
					System.out.println(arr[i]+" is duplicate element");
			}
		}	
	}
	
	public static void usingArraysSorting(int[] arr) {	
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) { 
			if(arr[i] == arr[i+1]) {
				System.out.println(arr[i]+" is duplicate element");
			}
		}	
	}
	
	public static void usingHashSet(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i:arr) {
			if(!set.add(i))
				System.out.println(i+" is duplicate element");
		}	
	}
	
	public static void usingHashMap(int[] arr) {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i:arr) {
			if(!map.containsKey(i))
				map.put(i, 1);
			else
				map.put(i, map.get(i)+1);
		}
		
		for(int i:map.keySet()) {
			if(map.get(i)>1)
				System.out.println(i+" is duplicate element");	
		}	
	}
	
	

}
