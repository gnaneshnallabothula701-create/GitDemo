
public class ReverseString {

	public static void main(String[] args) {

		String str = "Cutputly";
		String result ="";
		
		for(int i=str.length()-1;i<str.length();i--) {
			result = result+str.charAt(i);
			if(i==0)
				break;
		}
		System.out.println(result);
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(str.charAt(i));
		}
		
		
		
		

	}

}
