public class ReverseEachWordsInString {

	public static void main(String[] args) {

		String str = "Java is a good language";
		String[] arr =str.split(" ");
		for(String s:arr) {
			for(int i=s.length()-1;i>=0;i--) {
				System.out.print(s.charAt(i));
			}
			System.out.print(" ");
		}
		
		System.out.println();
		
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=arr[i].length()-1;j>=0;j--) {
				System.out.print(arr[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
