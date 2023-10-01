//WAP to convert lowercase character to uppercae and viceversa, keeping the digit as it is in given string
//Input: "Y07GEsH""

package akshita;

public class CaseConversion {
	
	String display(String input) {
		String str="";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				ch =Character.toLowerCase(ch);
				str=str+ch;
			}
			else {
				ch =Character.toUpperCase(ch);
				str=str+ch;
			}
		}
	  return str;	
	}

	public static void main(String[] args) {
		CaseConversion caseConversion = new CaseConversion();
		System.out.println("Convert lowercase character to uppercae and viceversa");
		String v1= "Y07GEsH";
		System.out.println("Input : "+ v1);
		System.out.println("Output : " + caseConversion.display(v1));
	}
}

