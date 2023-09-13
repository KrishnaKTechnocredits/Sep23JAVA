package denish;

public class Assignment22 {
	
	void returnData(String input) {
		for(int index=0; index< input.length(); index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch)==input.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment22 assignment22 = new Assignment22();
		assignment22.returnData("technocredits");
	}
}
