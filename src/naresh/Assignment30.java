package naresh;

public class Assignment30 {

	String m1(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {

			char ch = input.charAt(index);

			if (Character.isUpperCase(ch)) {

				output = output + ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment31 assignment31 = new Assignment31();
		String input = "TeCHNocreditS";
		assignment31.m1(input);
		String output = assignment31.m1(input);
		System.out.println(output);
	}
}
