//Assignment 39: 01st Oct 2023
//WAP to convert lowercase character to uppercase and uppercase character to lowercase, keeping the digit as is in the given string 
//String str = "Yo7GEsH";
//output : yO7geSh
package yogesh;

public class Yogesh_Assignment39 {

	void test(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch)) {
				output = output + Character.toUpperCase(ch);
			} else if (Character.isUpperCase(ch)) {
				output = output + Character.toLowerCase(ch);
			} else
				output = output + ch;
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		Yogesh_Assignment39 assignment39 = new Yogesh_Assignment39();
		assignment39.test("Yo7GEsH");
	}
}
