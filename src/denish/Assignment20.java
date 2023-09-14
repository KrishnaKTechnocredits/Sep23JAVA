package denish;

public class Assignment20 {

	void processData(String input) {
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			int count = 0;
			for(int innerIndex=0; innerIndex<input.length(); innerIndex++) {
				if(input.charAt(innerIndex) == ch) {
					count++;
				}
			}
			System.out.println(ch + "->" + count);
		}
	}
	
	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		String input = "aakanksha";
		assignment20.processData(input);
	}
}
