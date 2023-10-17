//*WAP to print the count of vowels in the given string
//*String str = "technocredits";
//*output : 4


package hetal;

public class Assignment52 {
	
	void printCount(String input) {
		int count = 0;
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;  
			}
		}
		System.out.println("The count of vowels is -->" +count);
	}

	public static void main(String[] args) {
		Assignment52 a = new Assignment52();
		a.printCount("technocredits");
	}
}
