
public class FactorialOfNum {
	
	public static void main(String[] args) {
		
		int num =5;
		int fact =1;
		for(int i=1;i<=num;i++) {
			fact = fact * i;
		}
		
		System.out.println(fact);
		
		System.out.println(findFactorial(5));
	
	}
	
	public static int findFactorial(int n) {
		if(n<=1) // logic to exit because n=1 or 0 we should exit because it gives 1
			return 1;
		return n * findFactorial(n-1);
	}

}
