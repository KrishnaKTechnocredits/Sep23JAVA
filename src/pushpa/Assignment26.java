//Print the freq of all character using while loop.
//String str = "aakansha";
//output : a -> 4
//         k -> 2
//		 n -> 1 
//		 s -> 1
//         h -> 1 
         
package pushpa;

public class Assignment26 {

	public void printFreqChar(String str) {
		int i = 0;
		while (i < str.length()) {
			char ch = str.charAt(i);
			int count = 0;
			if (ch != '&') {
				int j = 0;
				while (j < str.length()) {
					if (str.charAt(j) == ch)
						count++;
					j++;
				}
				System.out.println(str.charAt(i) + " -> " + count);
				str = str.replace(ch, '&');
			}
			i++;
		}
	}

	public static void main(String[] args) {
		Assignment26 freqOfEachCharInString = new Assignment26();
		freqOfEachCharInString.printFreqChar("aakanksha");
	}

}
