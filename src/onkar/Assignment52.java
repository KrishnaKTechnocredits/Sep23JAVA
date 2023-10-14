/*WAP to return count of vowels

String str = "technocredits";
output : 4

int getVowels(String str){

}*/


package onkar;

public class Assignment52 {
	
	void getCountOfVowels (String input) {
		int count = 0;
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				count++;
		}
		System.out.println("Numbe of vowels in the given string are : "+count);
	}
	
	public static void main(String[] args) {
		new Assignment52().getCountOfVowels("technocredits");
	}
}
