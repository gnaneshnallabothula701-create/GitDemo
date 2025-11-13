
public class ReverseCharsPreservingSpecialCharsInTheirPositions {

	public static void main(String[] args) {
		 String s = "a,bc$#d";
		 char[] arr =s.toCharArray();
		 char[] arr1 = new char[arr.length];
		 
		 for(int i=0;i<arr.length;i++) {
			 if(!Character.isLetter(arr[i])) {
				 arr1[i] = arr[i];
			 }
		 }
		 
		 int j= arr1.length-1;
		 for(int i=0;i<arr.length;i++) {
			 if(Character.isLetter(arr[i])) {
				 while(j>=0 && !Character.isLetter(arr[j])) {
					 j--;
				 }
				 arr1[j] = arr[i];
				 j--;
			 }
		 }
		 
		 System.out.println(new String(arr1));
		 

	}

}
