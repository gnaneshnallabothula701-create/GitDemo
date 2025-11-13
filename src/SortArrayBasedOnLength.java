
public class SortArrayBasedOnLength {
	public static void main(String[] args) {
		String[] arr ={"haridas","vishwa","Shiva","Raghav","Narasimha","ravi"};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].length()>arr[j].length()) { //for descending <
					String temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(String s:arr) {
			System.out.print(s+" ");
		}
	}

}
