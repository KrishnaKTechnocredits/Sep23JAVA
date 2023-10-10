/*Assignment - 49 : 8th Oct'2023
Find the difference between age of yongest and eldest family member.
int[] age = {13,45,2,48,89,91};
output : (91-2) 89*/

package jaykumar;

public class Assignment49 {

	void processAge(int[] arr) {
		int minAge = arr[0];
		int maxAge = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(maxAge<arr[i]) {
				maxAge = arr[i];
			}else if(minAge>arr[i]) {
				minAge = arr[i];
			}
		}
		System.out.println("Max age in family: "+maxAge);
		System.out.println("Min age in family: "+minAge);
		System.out.println("Difference in max & min age is: "+(maxAge-minAge));
	}
	
	public static void main(String[] args) {
		Assignment49 assignment49 = new Assignment49();
		int[] age = {13,45,2,48,89,91};
		assignment49.processAge(age);
	}
}
