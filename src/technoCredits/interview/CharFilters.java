package technoCredits.interview;

public class CharFilters {

	String getUpperCaseChars(String input) {
		String output = ""; //"TCHNS_Maulik"
		String predefinedStr = "Maulik";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				output = output + ch;
			}
		}
		return output + "_" + predefinedStr;
	}
	
	public static void main(String[] args) {
		CharFilters charFilters = new CharFilters();
		String input = "TeCHNocreditS";
		String output = charFilters.getUpperCaseChars(input);
		System.out.println(input + ", found uppercases " + output);
	}
}
