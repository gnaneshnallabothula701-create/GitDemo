
public class ReverseCharsKeepingSpacesInTheirOriginalPositions {
	
	public static void main(String[] args) {
		String s ="my name is Gnanesh";
	      char[] c1 =s.toCharArray();
	      char[] c2 = new char[c1.length];
	      
	      for(int i=0;i<c1.length;i++) { // checking spaces
	    	  if(c1[i] == ' ') {
	    		  c2[i] = ' ';
	    	  }
	      }
	      
	      int j = c2.length-1;
	      for(int i=0;i<c1.length;i++) {
	    	  if(c1[i]!=' ') {
	    		  while(j>=0 && c2[j] == ' ') {
	    			  j--;
	    		  }
	    		  
	    		  c2[j] = c1[i];
	    		  j--;
	    	  }
	      }
	      
	      System.out.println(new String(c2));
	      System.out.println(String.valueOf(c2));
	        
	    //or
	        
	        String s1 = "My name is Gnanesh";
	        String input= s1.replace(" ", "");
	        StringBuffer buffer = new StringBuffer(input);
	        buffer.reverse();
	        // Mark spaces in result
	        for (int i = 0; i < s.length(); i++) {
	          if(s.charAt(i) == ' ') {
	        	  buffer.insert(i, ' ');
	          }
	        }
	        
	        System.out.println(buffer.toString());
	        
	        
	 }

}
