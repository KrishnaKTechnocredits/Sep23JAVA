/*
Assignment - 50 : 8th Oct'2023
Find the second max from given array.
int[] age = {13,45,2,48,89,11,19,91};
output : 89
 */

package jagrati;

public class Assignment50 {
	int maxAge=0;
	int secondMax =0;
	void secondMax(int[] input) {
		for(int index =0; index< input.length; index++) {
			if(input[index]>maxAge) {
				secondMax = maxAge;
				maxAge =input[index];
			}
		}System.out.println(secondMax);
	}
public static void main(String[] args) {
	int[] age = {13,45,2,48,89,11,19,91};
	Assignment50 assign = new Assignment50();
	assign.secondMax(age);
}
}
