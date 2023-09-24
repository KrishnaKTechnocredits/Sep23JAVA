//Print the freq of all character using nested for loop.
//String str = "aakanksha";
//output : a -> 4
//         k -> 2
//		 n -> 1 
//		 s -> 1
//         h -> 1

package pushpa;

public class Assignment25 {

	public void printFreqChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = 0;
			if (ch != '&') {
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == ch) {
						count++;
					}
				}
				System.out.println(str.charAt(i) + " -> " + count );
				str=str.replace(ch, '&');
			}
		}
	}

	public static void main(String[] args) {
		Assignment25 freqOfEachCharInString = new Assignment25();
		freqOfEachCharInString.printFreqChar("aakanksha");
	}

}
