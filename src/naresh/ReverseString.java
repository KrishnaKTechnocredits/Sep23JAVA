package naresh;

public class ReverseString {

	
		void display(String name) {

	
			for (int index =name.length()-1; index >=0; index--) {
	          System.out.println(name.charAt(index));
				
				
				
			}
				
			}
				public static void main(String[] args) {
					ReverseString text =new	ReverseString();
					text.display("technocredits");
					
					
	}

}
