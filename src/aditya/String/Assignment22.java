package aditya.String;

public class Assignment22 {

	void nonRepeatative(String input) {
		for(int index=0; index<input.length(); index++) {
			char ch =input.charAt(index);
			if(input.indexOf(ch)==input.lastIndexOf(ch)){
					System.out.println(ch);

			}
		}
	}	



	public static void main(String[] args) {

		Assignment22 as22 = new Assignment22();
		as22.nonRepeatative("technocredits");
		// TODO Auto-generated method stub

	}

}