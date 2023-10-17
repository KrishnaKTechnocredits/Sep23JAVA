//WAP to print vowels if count is greater than 2
////Input : {"technocredits","aakansha","yogesh","shamli"}
// technocreditd: eoei , aakansha:aaaa

package akshita.array;

import java.util.Arrays;

public class Assignment56 {

	void vowels(String[] input) {
		for(int index=0;index<input.length;index++) {
			String str= input[index];
			String output="";
			int count =0;
			for(int iIndex=0; iIndex<str.length();iIndex++) {
				char ch= str.charAt(iIndex);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					output = output+ ch;
					count++;
				}
			}
			if(count>2) {
				System.out.println(str + "=>" + output);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment56 ass56 = new Assignment56();
		String[] arr = {"technocredits","aakansha","yogesh","shamli"};
		System.out.println(Arrays.toString(arr));
		ass56.vowels(arr);
	}
}
