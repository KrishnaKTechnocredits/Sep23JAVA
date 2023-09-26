/*Assignment-30 : 22 sep '2023
 
Write a method which takes input and return to return all Uppercase from given input.

input : "TeCHNocreditS";
output : TCHNS

Hint : we can add characters in string like below.
String output = "";
output = output + str.charAt(index);*/

package nivedita;

class A30ReturnData {

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
		A30ReturnData returnData = new A30ReturnData();
		String input = "TeCHNocreditS";
		String output = returnData.retUpperCase(input);
		System.out.println("Output is->" + output);
	}
}
