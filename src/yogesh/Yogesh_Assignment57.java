//WAP to print consonants in the given String and count of vowels and consonants
//String str = "technocredits;
//output : 
//Consonants in the given string are : tchncrdts
//Count of vowels in given string is : 4
//Count of consonants in given string is : 9
package yogesh;

public class Yogesh_Assignment57 {
	
	void constVowvel(String str) {
		int ctemp=0;
		int vtemp=0;
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vtemp++;
		}
			else
				ctemp++;
		}
		System.out.println("Vowvels in given string:--"+vtemp);
		System.out.println("Constants in given string:--"+ctemp);
	}

	
	public static void main(String[] args) {
		Yogesh_Assignment57 assignment58=new Yogesh_Assignment57();
		assignment58.constVowvel("technocredits");
	}
}
