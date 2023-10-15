/*
 * Assignment - 49 : 8th Oct'2023
Find the difference between age of yongest and eldest family member.
int[] age = {13,45,2,48,89,91};
output : (91-2) 89
 */

package shamli.array;
import java.util.Arrays;

public class Assignment49 {
	
	int findDiffOfMaxAndMinAge(int[] arr) {
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return max-min;
	}

	public static void main(String[] args) {
		Assignment49 assignment49=new Assignment49();
		int[] age = {13,45,2,48,89,91};
		System.out.println("Input array :"+Arrays.toString(age));
		int differenceInAge=assignment49.findDiffOfMaxAndMinAge(age);
		System.out.println("Diff between max and min age is :"+differenceInAge);
	}
}
