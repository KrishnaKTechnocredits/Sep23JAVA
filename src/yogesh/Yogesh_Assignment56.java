//Print vowels of the string only if count of vowels is greater than 2.
//Expected output:
//         technocredits -> eoei
//         aakanksha -> aaaa
//	 yogesh -> vowels count is less than 2 in given string
//	 shamli -> vowels count is less than 2 in given string
package yogesh;

public class Yogesh_Assignment56 {

	int countVowels(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
		return count;
	}

	String printVowvels(String str) {
		String output = "";
		int count = countVowels(str);
		if (count > 2) {
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					output = output + ch;
					count++;
				}
			}
			return output;
		} else
			return "vowels count is less than 2 in given string";
	}

	void process(String[] arr) {

		for (int index = 0; index < arr.length; index++) {
			String output = printVowvels(arr[index]);
			System.out.println(arr[index] + "-->" + output);
		}
	}

	public static void main(String[] args) {
		Yogesh_Assignment56 assignment56 = new Yogesh_Assignment56();
		String[] str = { "technocredits", "aakanksha", "yogesh", "shamli" };
		assignment56.process(str);

	}
}
