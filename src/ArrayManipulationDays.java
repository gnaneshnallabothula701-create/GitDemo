
public class ArrayManipulationDays {
	public static void main(String[] args) {
		String[] arr = {
			    "Monday", 
			    "Tuesday",
			    "Wednesday",
			    "Thursday",
			    "Friday",
			    "Saturday",
			    "Sunday"
			};
		
		String[] modifiedArray = new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			//modifiedArray[i] = arr[i].substring(0, 3);
			modifiedArray[i] = arr[i].substring(0, arr[i].length()-3);
			
		}
		
		for(String s:modifiedArray) {
			System.out.println(s);
		}
	}
//done by asian guy

}
