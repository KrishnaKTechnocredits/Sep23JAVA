/*Assignment-52:13 th Oct'2023 String str="technocredits";output:4

int getVowels(String str){

}
*/
package pratik;

public class Assignment52 {
	
	void printVowels(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Vowels in given string are : " + count);
	}

	public static void main(String[] args) {
		Assignment52 assignment52 = new Assignment52();
		assignment52.printVowels("technocredits");

	}
}
