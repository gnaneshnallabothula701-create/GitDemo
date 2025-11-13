
public class LastFourCharacters {

	public static void main(String[] args) {

		String str = "www.google.com";
		System.out.println(str.length());
		System.out.println(str.substring(0,4)); //beginIndex is inclusive & endIndex is exclusive
		System.out.println(str.substring(4,str.length()-4));
		System.out.println(str.substring(str.length()-4,str.length()));
		
	}

}
