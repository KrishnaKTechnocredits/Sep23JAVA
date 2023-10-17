//Assignment-52 : 13th Oct'2023
//String str = "technocredits";
//output : 4
//
//int getVowels(String str){
//
//}
package yogesh;

public class Yogesh_Assignment52 {

	int getVowvels(String str) {
		int temp = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if (str.charAt(index) != ' ')
					temp++;
			}
		}
		return temp;

	}

	public static void main(String[] args) {
		Yogesh_Assignment52 assignment52 = new Yogesh_Assignment52();
		String input = "technocredits";
		int output = assignment52.getVowvels(input);
		System.out.println("No. of vowvels in given string are:-->" + output);

	}
}
