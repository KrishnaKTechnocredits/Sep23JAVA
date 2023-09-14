package mayank;

public class Assignment21 {
		void nonRepetingChar(String input){
			for (int index=0;index<input.length();index++){
				char ch = input.charAt(index);
				if (input.indexOf(ch)==input.lastIndexOf(ch)){
					System.out.print(ch);
				}
			}
		}
		public static void main(String[] args){
		Assignment21 assignment21=new Assignment21();
		assignment21.nonRepetingChar("technocredits");
		}
 }

