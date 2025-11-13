import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsInString {
	
	public static void main(String[] args) {
		
		String str = "I am am learn learn java java java programming programming programming programming";
		String[] arr = str.split(" ");
		
		// linkedhashset maintains insertion order
		Set<String> set = new LinkedHashSet<String>(); 
		for(String x:arr) {
			set.add(x);
		}
		for(String s:set) {
			System.out.print(s+" ");
		}
		System.out.println();
		Iterator<String> it =set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
			
	}

}
