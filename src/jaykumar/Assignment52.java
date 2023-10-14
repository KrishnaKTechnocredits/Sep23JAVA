/*Assignment-52 : 13th Oct'2023
WAP to print the count of vowels in the given string
String str = "technocredits";
output : 4*/

package jaykumar;

public class Assignment52 {

	void vowelsCount(String input) {
		int count = 0;
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
		}
		System.out.println("Given string is: "+input);
		System.out.println("Count of vowels in given string is: "+count);
	}
	
	public static void main(String[] args) {
		Assignment52 assignment52 = new Assignment52();
		assignment52.vowelsCount("technocredits");
	}
}
