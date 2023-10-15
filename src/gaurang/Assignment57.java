/*WAP to print consonants in the given String and count of vowels and consonants
String str = "technocredits";
output : 
Consonants in the given string are : tchncrdts
Count of vowels in given string is : 4
Count of consonants in given string is : 9*/

package gaurang;

public class Assignment57 {

	void printChar(String input) {
		int count = 0;
		int count1 = 0;
		String output = "";
		for(int index=0; index<input.length() ; index++) {
			char ch = input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i') {
				count++;
			}
			else {
				output += ch;
				count1++;
			}
		}
		System.out.println("In given String Consonants String : "+output);
		System.out.println("vowels --> "+count);
		System.out.println("consonannts --> "+count1);
	}
	
	public static void main(String[] args) {
		Assignment57 a = new Assignment57();
		a.printChar("technocredits");
	}
}
