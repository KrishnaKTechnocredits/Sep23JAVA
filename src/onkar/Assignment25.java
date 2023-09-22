/*Print the freq of all character using nested for loop.
String str = "aakansha";
output : a -> 4
         k -> 2
		 n -> 1 
		 s -> 1
         h -> 1*/

package onkar;

public class Assignment25 {
	
	void findCharFreq(String input) {
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			int count = 0;
			if(ch != '*') {
				for (int innerIndex=0; innerIndex<input.length(); innerIndex++) {
					if (input.charAt(innerIndex)==ch) {
						count++;
					}
				}
				System.out.println(ch+"-->"+count);
				input = input.replace(ch, '*');
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment25 assignment25 = new Assignment25();
		assignment25.findCharFreq("aakansha");
	}
}
