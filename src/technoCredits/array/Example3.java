package technoCredits.array;

import java.util.Arrays;

public class Example3 {	
	static byte[] input = {1,2,127};
	
	void updateArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
		for(int index=0;index<arr.length;index++) {
			arr[index] = arr[index]*2;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	void setArray() {
		int[] num = {10,2,3,6,22,88};
		updateArray(num);
	}
	
	public static void main(String[] args) {
		Example3 example3 = new Example3();
		example3.setArray();
	}
}
