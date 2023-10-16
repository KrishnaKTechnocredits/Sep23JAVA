/*
 * Assignment-56 : 13th Oct'2023
WAP to print vowels of the string only if count of vowels is greater than 2.
Expected output:
         technocredits -> eoei
         aakanksha -> aaaa
	 yogesh -> vowels count is less than 2 in given string
	 shamli -> vowels count is less than 2 in given string
 */

package shamli.array;

public class Assignment56 {
	
	void processArray(String[] arr) {
		for(int index=0;index<arr.length;index++) {
			String output=getMoreThan2VowelsString(arr[index]);
			System.out.println(arr[index]+"-> "+output);
		}
	}
	
	String getMoreThan2VowelsString(String input) {
		String vowelStr="";
		int count=0;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
				count++;
				vowelStr=vowelStr+ch;
				}
			}
		if(count>2) {
			return vowelStr;
		}else {
			return "vowels count is less than 2 in given string ";
		}
		
	}

	public static void main(String[] args) {
		Assignment56 assignment56=new Assignment56();
		String[] str = {"technocredits","aakanksha","yogesh","shamli"};
		assignment56.processArray(str);	

	}

}
