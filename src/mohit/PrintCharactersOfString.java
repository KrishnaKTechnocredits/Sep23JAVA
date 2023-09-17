package mohit;

public class PrintCharactersOfString {
	
	void charactersOfString(String input) {
		for(int index=0;index<input.length();index++) {
			System.out.println(index + "->" + input.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		PrintCharactersOfString printCharactersOfString = new PrintCharactersOfString();
		printCharactersOfString.charactersOfString("Technocredits");
	}
}
