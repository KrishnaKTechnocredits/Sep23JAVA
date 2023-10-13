package naresh;

public class Assignment41 {
	
	void display(String str) {
		for(int index = 0; index<str.length();index++) {
			char ch = str.charAt(index);
			
		if(ch=='a'||ch =='e'||ch=='i'||ch=='o'||ch=='u') {
		String output =	str.substring(index, str.length());
		System.out.println(output);
		break;

			
			
		}
			
			
		}
		
	}

	public static void main(String[] args) {
		Assignment41 a = new Assignment41();
		a.display("pqrabcgtyes");

	}

}
/**
 * Assignment 41: 01-Oct-23 WAP to print a string from 1st vowel Input:
 * pqrabcgtyes Output: abcgtyes
 */