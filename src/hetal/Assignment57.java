//*WAP to print consonants in the given String and count of vowels and consonants
//*String str = "technocredits";
//*output : 
//*Consonants in the given string are : tchncrdts
//*Count of vowels in given string is : 4
//*Count of consonants in given string is : 9



package hetal;

public class Assignment57 {
	
	void printCount(String input) {
		String output ="";
		int count1 = 0;
		int count2 = 0;
		
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count1++;
			}
			else {
				count2++;
				output = output + ch;
			}
		}
		System.out.println("consonants in the given string are : " + output );
		System.out.println("count of vowels in the given string is : " + count1);
		System.out.println("count of consonants in the given string is : " +count2);
	}
	 
	public static void main(String[] args) {
		Assignment57 a = new Assignment57();
		a.printCount("technocredits");
	}
}
