/*Assignment - 50 : 8th Oct'2023
Find the second max from given array.
int[] age = {13,45,2,48,89,11,19,91};
output : 89*/

package jaykumar;

import java.util.Arrays;

public class Assignment50 {
	int temp;
	
	void processArray(int[] arr) {

		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Second max num is: "+(arr[arr.length-2]));
	}
	
	public static void main(String[] args) {
		Assignment50 assignment50 = new Assignment50();
		int[] age = {13,45,2,48,89,11,19,91};
		assignment50.processArray(age);
	}
}
