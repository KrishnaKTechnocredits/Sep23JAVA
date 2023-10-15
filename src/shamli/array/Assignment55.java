/*
 * Assignment-55 : 13th Oct'2023
WAP to print vowels of each string from the given String array.
String[] str = {"technocredits","aakanksha","yogesh","shamli"};
output : technocredits -> eoei
         aakanksha -> aaaa
		 yogesh -> oe
		 shamli -> ai
 */

package shamli.array;

public class Assignment55 {
	
	void processArray(String[] arr) {
		for(int index=0;index<arr.length;index++) {
			String output=getVowels(arr[index]);
			System.out.println(arr[index]+"-> "+output);
		}
	}
	
	String getVowels(String input) {
		String vowelStr="";
		for(int i=0;i<input.length();i++) {
		char ch=input.charAt(i);
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
			vowelStr=vowelStr+ch;
			}
		}
		return vowelStr;
	}

	public static void main(String[] args) {
		Assignment55 assignment55=new Assignment55();
		String[] str = {"technocredits","aakanksha","yogesh","shamli"};
		assignment55.processArray(str);	
	}

}
