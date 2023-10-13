package naresh;

public class Assignment40 {
	
	
	
	void m1(String str) {
	int index = str.indexOf('e');
	int lastIndex = str.lastIndexOf('e');
		String output = str.substring(index, lastIndex);
		
		System.out.println(output);
	}

	public static void main(String[] args) {
		Assignment40 a = new Assignment40();
		a.m1("technocredits");
		
	}

}
/*
 * Assignment 40: 01-Oct-23 WAP to print a string from 1st repeating vowel 'e'
 * to last same repeating vowel 'e'. Input: technocredits Output: echnocr
 * 
 * Assignment 41: 01-Oct-23 WAP to print a string from 1st vowel Input:
 * pqrabcgtyes Output: abcgtres
 * 
 * Assignment 42: 01-Oct-23 WAP to calculate sum of digits which are present
 * outside of string i.e. 1st repeating vowel 'e' to last same repeating vowel
 * 'e' Input: t1ecehnoecredit983 Output: 1+9+8+3 = 21
 * 
 * Assignment 43: 01-Oct-23 WAP to calculate difference of outer sum (t1+dit983)
 * - inner sum (i.e. 1st repeating vowel 'e' to last same repeating vowel 'e' )
 * Input: t1ec5ehno4e7credit983 Output: Inner sum: e->e : 5+4+7 = 16 Outer sum:
 * t1+dit983 : 1+9+8+3 = 21
 */