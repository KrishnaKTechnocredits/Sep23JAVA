package denish;

public class Assignment40 {

	void processData(String input, char ch) {
		int first = input.indexOf(ch);
		int last = input.lastIndexOf(ch);
		String update = input.substring(first, last);
		System.out.println("Output is " + update);
	}

	public static void main(String[] args) {
		Assignment40 assignment40 = new Assignment40();
		assignment40.processData("technocredits", 'e');
	}
}
