//WAP to print sum of all digits within given input "Rah5uiTEC6Hnoc2reditS"

package akshita;

public class SumDigit {

	static int sum =0;
	public static void main(String[] args) {
		String input = "Rah5uiTEC6Hnoc2reditS";
			System.out.println("Sum of all digits within given input ");
		    System.out.println("Input : " +input);
				for(int index=0;index<input.length();index++) {
					if(Character.isDigit(input.charAt(index))) {
						sum = sum + Character.getNumericValue(input.charAt(index));
					}		
			}
			System.out.println("Output : " + sum);
	}
}