package hetal;

public class Assignment_22 {
	
	void nonRpt(String input) {
		String total = "";
		for(int index = 0; index<input.length();index++) {
			char ch = input.charAt(index);
			int count = 0;
			for(int innerindex=0; innerindex<input.length();innerindex++) {
				if(input.charAt(innerindex)==ch) {
					count++;	
				}
			}
			if(count==1) {
				total = total + ch;
			}
		}
		System.out.println("Non Repeat charaters are "+ total);
	}
	
	public static void main(String[] args) {
		Assignment_22 ass22 = new Assignment_22();
		ass22.nonRpt("technocredits");
	}
}
