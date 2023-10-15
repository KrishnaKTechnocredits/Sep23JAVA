//WAP to print vowels of each string from given string array
//Input : {"technocredits","aakansha","yogesh","shamli"}
//Output: technocredits: eoei , aakansha : aaaa, yogesh: oe, shamli : aai

package akshita.array;

public class Assignment55 {

	void vowels(String[] input) {
		for (int index = 0; index < input.length; index++) {
			String str = input[index];
			String output = "";
			for (int innerIndex = 0; innerIndex < str.length(); innerIndex++) {
				char ch = str.charAt(innerIndex);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					output = output + ch;
				}

			}
			System.out.println(str + "=>" + output);
		}
	}

	public static void main(String[] args) {
		Assignment55 ass55 = new Assignment55();
		String[] arr = { "technocredits", "aakansha", "yogesh", "shamli" };
		System.out.println("vowels of each string from given string array");
		ass55.vowels(arr);
	}
}
