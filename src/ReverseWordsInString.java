public class ReverseWordsInString {

	public static void main(String[] args) {

		String str = "Java is a good language";
		String[] arr =str.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
