import java.util.HashMap;
import java.util.Map;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		
		String str1 = "Java is best for backend programming";
		int length = str1.length()-str1.replace("v", "").length();
		System.out.println("occurence of char a: "+length);
		
		
		String str = "Java is best for backend programming";
		char[] arr = str.replace(" ", "").toCharArray();
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+1);
			else
				map.put(arr[i], 1);
		}
		
		System.out.println(map);
		
	}

}
