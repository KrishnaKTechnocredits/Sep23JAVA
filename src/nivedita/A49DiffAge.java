/* Assignment 49
Find the difference between age of yongest and eldest family member.
int[] age = {13,45,2,48,89,91};
output : (91-2) 89*/

package nivedita;

public class A49DiffAge {
	void findDiff(int[] arr) {
		int minAge = arr[0];
		int maxAge = arr[0];
		
		for (int index=0; index<arr.length; index++) {
			if (arr[index] > maxAge)
				maxAge = arr[index];
			if (arr[index] < minAge)
				minAge = arr[index];
		}
		System.out.println("Difference is max and min age is : "+ (maxAge-minAge));
	}
	
	public static void main(String[] args) {
		int[] age = {13,45,2,48,89,91};
		new A49DiffAge().findDiff(age);
	}
}
