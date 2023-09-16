package naresh;

public class Assignment_22 {
	

	/*int abc(String input, char ch ) {
		int count = 0;

		for (int index = 0; index < input.length(); index++) {

			if (input.charAt(index)==ch) {
				count = count + 1;
			}
		}
		return count;*/
		
	//}
	void Printmax(String input) {
	
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			//int freq = abc(input, ch);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.println(ch);
			}
		}
	}
	
	
	
public static void main(String[] args) {
	Assignment_22 freq = new Assignment_22();
	freq.Printmax("technocredits");
	
}
}
