import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {
	
	public static void main(String[] args) {
		
		String str= "popsicles";
		
		Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			if(!map.containsKey(str.charAt(i)))
				map.put(str.charAt(i), 1);
			else
				map.put(str.charAt(i), map.get(str.charAt(i))+1);	
		}
		
		for(char ch : map.keySet()) {
			if(map.get(ch) == 1) {
				System.out.println(ch+" is first non repeated charcter");
				break;
			}
		}
		
		//or
		
		for(Entry<Character,Integer> entry :map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey()+" is first non repeated charcter");
				break;
			}
			
		}
		
		
		
	}

}
