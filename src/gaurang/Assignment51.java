/* String str = "technocredits";
output : eoei*/

package gaurang;

public class Assignment51 {

	void getVowels(String input) {
		String output = "";
		for(int index=0 ; index<input.length() ; index++) {
			char ch = input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u') {
				output += ch;
			}
		}
		System.out.println(input+ "-->" +output);
		
	}
	
	public static void main(String[] args) {
		Assignment51 a = new Assignment51();
		a.getVowels("technocredits");
	}
}
