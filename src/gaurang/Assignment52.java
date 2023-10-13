/*String str = "technocredits";
output : 4
*/

package gaurang;

public class Assignment52 {

	int getVowels(String input) {
		int count = 0;
		for(int index=0 ; index<input.length() ; index++) {
			char ch = input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Assignment52 a = new Assignment52();
		System.out.println("In technocredits total vowels are "+ a.getVowels("technocredits"));
	}
}
