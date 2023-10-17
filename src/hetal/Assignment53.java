//*Write a program to return unique vowels included in the string, ensure sequence is maintained.
//*String str = "aakaniksha eaep dube";
//*output : aieu



package hetal;

public class Assignment53 {
	
	void printUniqueVowel(String input) {
		String output="";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				output=output+ch;	
			}
			input = input.replace(String.valueOf(ch)," ");
		}
		System.out.println("unique vowels in given string --->" + output);
	}
	
	public static void main(String[] args) {
		Assignment53 assignment = new Assignment53();
		assignment.printUniqueVowel("aakaniksha eaep dube");
	}
	

}
