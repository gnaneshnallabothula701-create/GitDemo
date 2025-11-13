
public class ToggleCharacters {
	public static void main(String[] args) {

		String s = "KowSAly!#AChaNDRASekhaR";
		String res="";
		
		for(int i=0;i<s.length();i++) {
			Character c = s.charAt(i);
			if(Character.isLowerCase(c)) {
				res = res+ (char)(c-32);
			}else if(Character.isUpperCase(c)) {
				res = res + (char)(c+32);
			}else {
				res =res+c;
			}
		}
		System.out.println(s);
		System.out.println(res);
		
		
		
		
		
	}
}
