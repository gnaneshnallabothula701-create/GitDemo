public class MissingNumberInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,14,11,12,10,15,13};
		int num =0;
		int num1 =0;
		for(int i=0;i<arr.length;i++) {
			num = num+arr[i];
		}
		for(int i=1;i<=15;i++) {
			num1 = num1+i;
		}
		
		System.out.println(num1-num);
		
		
	}

}
