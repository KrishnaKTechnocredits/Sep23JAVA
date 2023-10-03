/*WAP to convert lowercase character to uppercase and uppercase character to lowercase, keeping the digit as is in the given string 
String str = "Yo7GEsH";
output : yO7geSh*/

package gaurang;

public class Assignment39 {

	void upToLo(String input) {
		String update = "";
		for(int index = 0; index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				char u = Character.toLowerCase(ch);
				update = update + u;
			}
			else if(Character.isLowerCase(ch)){
				char l = Character.toUpperCase(ch);
				update = update + l;
			}
			else {
				update = update + ch;
			}
		}
		System.out.println("Reverse cases of input will be "+update);
	}
	
	public static void main(String[] args) {
		Assignment39 a = new Assignment39();
		a.upToLo("Yo7GEsH");
	}
}
