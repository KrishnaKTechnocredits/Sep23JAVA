/*Find the difference between age of yongest and eldest family member.
int[] age = {13,45,2,48,89,91};
output : (91-2) 89*/

package gaurang;

public class Assignment49 {

	void findDiff(int[] input) {
		int youngest = input[0];
		int eldest = 0;
		for(int index=0 ; index<input.length ; index++) {
			int x = input[index];
			if(x>eldest) {
				eldest=x;
			}
			if(x<youngest) {
				youngest=x;
			}
		}
		System.out.println("Difference bet youngest and eldest is "+(eldest-youngest));
	}
	
	public static void main(String[] args) {
		Assignment49 a = new Assignment49();
		int[] age = {13,45,2,48,89,91};
		a.findDiff(age);
	}
}
