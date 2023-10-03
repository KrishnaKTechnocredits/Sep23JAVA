/*WAP to print a string from 1st vowel
Input: pqrabcgtyes
Output: abcgtyes*/

package gaurang;

public class Assignment41 {

	void getPrint(String input) {
		int count = 0;
		for(int index = 0; index<input.length();index++) {
			char ch = input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count = index;
				break;
			}
		}
		String update = input.substring(count);
		System.out.println("Required input is "+update);
	}
	
	public static void main(String[] args) {
		Assignment41 a = new Assignment41();
		a.getPrint("pqrabcgtyes");
	}
}
