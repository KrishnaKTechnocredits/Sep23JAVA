//*Find the second max from given array.
//*int[] age = {13,45,2,48,89,11,19,91};
//*output : 89*//


package hetal;

public class Assignment50 {
	
	void printSecondMax(int[] arr) {
		int max = arr[0];
		int secondMax = arr[1];
		
		if(arr[0]<arr[1]) {
			max = arr[1];
			secondMax = arr[0];
		}
		for(int index=0;index<arr.length;index++) {
			if(max<arr[index]) {
				secondMax = max;
				max = arr[index];
			}else if(secondMax < arr[index]) {
				secondMax = arr[index];
			}
		}
		System.out.println(" second max is " + secondMax);
	}

	public static void main(String[] args) {
		Assignment50 a = new Assignment50();
		int[] age = {13,45,2,48,89,11,19,91};
		a.printSecondMax(age);
	}
}
