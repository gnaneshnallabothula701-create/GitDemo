import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupliactesFromArrayList {
	public static void main(String[] args) {
		
		List<String> li = new ArrayList<String>();
		li.add("hari");
		li.add("vishwa");
		li.add("Shiva");
		li.add("hari");
		li.add("vishwa");
		li.add("Shiva");
		li.add("hari");
		li.add("vishwa");
		li.add("Shiva");
		li.add("hari");
		li.add("vishwa");
		li.add("hari");
		li.add("vishwa");
		li.add("Shiva");
		li.add("hari");
		li.add("vishwa");
		li.add("Shiva");
		
		
		System.out.println(li);
		
		for(int i=0;i<li.size();i++) {
			for(int j = i+1;j<li.size();j++) {
				if(li.get(i).equals(li.get(j))) { 
					li.remove(j);
					j--;
				}
			}
		}
		
		System.out.println(li);
		//using set
		Set<String> set = new HashSet<String>(li);
		for(String s:set) {
			System.out.println(s+",");
		}
		
		//using other arraylist
		ArrayList<String> uniqueList = new ArrayList<>();
		for (int i = 0; i < li.size(); i++) {
			String s = li.get(i);
			if (!uniqueList.contains(s)) {
				uniqueList.add(s);
			}
		}

		System.out.println(uniqueList);
	}

}
