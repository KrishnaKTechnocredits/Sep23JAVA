//WAP to find the difference between age of yougest and lowest family memeber.
//int[] ={13,45,2,48,89,91}
//Output : (91-2)89

package akshita.array;

import java.util.Arrays;

public class Assignment49 {

	int diff(int[] input) {
		int max = input[0];
		int min = input[0];
		for(int index=0;index<input.length;index++) {
			if(input[index]>max) {
				max= input[index];
			}
			if(input[index]<min) {
				min=input[index];
			}
		}
		return (max-min);
	}
	
	public static void main(String[] args) {
		Assignment49 ass49 = new Assignment49();
		int[] input = {13,45,2,48,89,91};
		System.out.println("Input : " +Arrays.toString(input));
		System.out.println("Output : " + ass49.diff(input));

	}

}
