//WAP to return non repetitive vowels from string
//"aakanikshaea epdube"
//Output: eu

package array;

public class Assignment54 {
	


	void nonRepetative(String input) {
		String output="";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
				input = input.replace(input.valueOf(ch), "");
			}
		}
		System.out.println("Output : " +output);
		}
	
	
	public static void main(String[] args) {
		Assignment54 ass54 = new Assignment54();
		String input = "aakanikshaea epdube";
		ass54.nonRepetative(input);
	}
}
