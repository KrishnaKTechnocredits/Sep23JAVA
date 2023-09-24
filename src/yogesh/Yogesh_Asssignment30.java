/*Assignment-30 : 22nd '2023
 
Write a method which takes input and return to return all Uppercase from given input.

input : "TeCHNocreditS";
output : TCHNS

Hint : we can add characters in string like below.
String output = "";
output = output + str.charAt(index);*/
package yogesh;

 class Yogesh_Asssignment30 {

	String retUpperCase(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				output = output + ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Yogesh_Asssignment30 asssignment30 = new Yogesh_Asssignment30();
		String input="TeCHNocreditS";
		String output=asssignment30.retUpperCase(input);
		System.out.println("Output is->" + output);
	}
}
