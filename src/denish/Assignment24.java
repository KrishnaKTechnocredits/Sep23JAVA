package denish;

public class Assignment24 {
	
	public static void main(String[] args) {
		
		String str="Rah5ulTEC6Hnoc2redItS";
		int sum=0;
		
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
				System.out.println("Digit is ->"+ Character.getNumericValue(ch));
			}
		}
		
		System.out.println("Sum Of Digit is ->" + sum);
	}
}
