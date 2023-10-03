package gaurang;

public class Assignment22 {
	
	void nonRep(String input) {
		String print = "";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			int count = 0;
			for(int innerindex = 0;innerindex<input.length();innerindex++) {
				if(input.charAt(innerindex)==ch) {
					count++;
				}
			}
			if(count<2) {
				print = print + ch;
			}
		}
		System.out.println(print);
	}
	
	public static void main(String[] args) {
		Assignment22 a = new Assignment22();
		a.nonRep("technocredits");
	}
}
