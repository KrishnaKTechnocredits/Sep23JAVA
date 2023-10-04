//WAP to print a string from 1st repeating vowel 'e' to last same repeating vowel 'e'.
//Input: technocredits
//Output: echnocr

package pushpa;

public class Assignment40 {

	public void findFirstLastVowelSubstring(String str) {
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u' ||
			   ch == 'A' || ch == 'E' || ch=='I' || ch=='O' || ch=='U')
				if(str.indexOf(ch) != str.lastIndexOf(ch))
					str1 = str.substring(str.indexOf(ch), str.lastIndexOf(ch));
		}
		
		System.out.println("String is: "+str1);
	}

	public static void main(String[] args) {
		Assignment40 assignment40 = new Assignment40();
		assignment40.findFirstLastVowelSubstring("technocredits");
	}

}
