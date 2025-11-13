
public class SmallestAndLargestArray {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 1, 2, 5, 80, 109, 1, 11, 12, 12, -20, -11, 0, 25, 75, 99 };

		int smallest = arr[0];
		int largest = arr[0];
		int secondLargest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest)
				largest = arr[i];
			else if (arr[i] < smallest)
				smallest = arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < largest && arr[i] > secondLargest)
				secondLargest = arr[i];
		}

		System.out.println("largest no is " + largest);
		System.out.println("smallest no is " + smallest);
		System.out.println("second largest no is " + secondLargest);

	}
}
