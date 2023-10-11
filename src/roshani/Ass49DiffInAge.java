/*Assignment - 49 : 8th Oct'2023
Find the difference between age of yongest and eldest family member.
int[] age = {13,45,2,48,89,91};
output : (91-2) 89
*/

package roshani;

public class Ass49DiffInAge{
	
	void printAgeDiff(int[] input){
		int maxAge = input[0];
		int minAge = input[0];
		int difference = 0;
		
		for(int index = 0; index < input.length; index++){
			if(input[index] > maxAge){
				maxAge = input[index];
			}else if(input[index] < minAge){
				minAge = input[index];
			}
		}
		difference = maxAge - minAge;
		System.out.println("Difference in age of eldest and yougest family member is: " + difference);
	}
	
	public static void main(String[] args){
		int[] age = {13,45,2,48,89,91};
		new Ass49DiffInAge().printAgeDiff(age);
	}
}