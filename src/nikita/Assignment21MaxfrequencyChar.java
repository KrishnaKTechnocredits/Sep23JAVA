//Write a program to find character having maximum frequency from given String.
//input : aakanksha
//output : aakanksha -> a -> 4

package nikita;

public class Assignment21MaxfrequencyChar {

	int count;

	int getFrequency(String str,char ch) {
		count=0;
		for(int i=0;i<str.length();i++) {
			if(ch==str.charAt(i)) {
				count++;
			}
		}
		//System.out.println(count);
		return count;
	}

	void getMaxfrequency(String input) {
		char maxch=' ';
		int maxFrequency = 0;
		for(int i=0;i<input.length();i++) {
			char ch= input.charAt(i);
			int frequency= getFrequency(input,ch);
			if(maxFrequency<frequency) {
				maxFrequency=frequency;
				maxch=ch;
			}
		}
		System.out.println(input+ "->" +maxch+ "->" +maxFrequency);
	}

	public static void main(String[] args) {
		Assignment21MaxfrequencyChar assignment21= new Assignment21MaxfrequencyChar();
		assignment21.getMaxfrequency("Nikkkitaaaa");

	}
}


