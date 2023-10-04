//WAP to convert lowercase character to uppercase and uppercase character
//to lowercase, keeping the digit as is in the given string 
//String str = "Yo7GEsH";
//output : yO7geSh

package pushpa;

public class Assignment39 {
	
	public void convertStringChars(String str) {
		String str1 = "";
		System.out.println("String Before conversion: "+str);
		for(int i = 0; i<str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i)))
				str1 += Character.toUpperCase(str.charAt(i));
			else if(Character.isUpperCase(str.charAt(i)))
				str1 += Character.toLowerCase(str.charAt(i));
			else
				str1 += str.charAt(i);
		}
		System.out.println("String After conversion: "+str1);
	}

	public static void main(String[] args) {
		Assignment39 assignment39 = new Assignment39();
		assignment39.convertStringChars("Yo7GEsH");
	}

}
