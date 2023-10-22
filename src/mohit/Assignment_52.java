/**WAP to return count of vowels

String str = "technocredits";
output : 4

int getVowels(String str){

}*/

package mohit;

public class Assignment_52 {
	void getVowelscount(String input) {
		int count=0;
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("the total count of vowels in " + input + "->" + count);
	}

	public static void main(String[] args) {
		Assignment_52 assignment_52 = new Assignment_52();
		String str = "technocredits";
		String str1="abc ere ead";
		assignment_52.getVowelscount(str);
		
		
		
	}
}
