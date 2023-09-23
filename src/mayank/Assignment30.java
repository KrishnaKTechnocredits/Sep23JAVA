package mayank;

public class Assignment30 {

	String upperCaseFind(String input){
		String output ="";
		for(int index=0;index<input.length();index++) {
		char ch = input.charAt(index);
			if (Character.isUpperCase(ch)){
				output = output + ch;
			}
		}
			return output;
	}
	public static void main(String[] args){
		Assignment30  assignment30 = new  Assignment30();
		String input = "TeCHNocredits";
		String output =assignment30.upperCaseFind(input);
		System.out.println( " "+ output);
	}
}

