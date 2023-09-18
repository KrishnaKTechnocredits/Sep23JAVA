//WAP to print last non repetitive character using while loop .Input: technocredits

package akshita;

public class LastNonRepetative {

	void nonRep(String input) {
		
		
		while(input.length()>0) {
			int acutualLength = input.length();
			char ch = input.charAt(input.length()-1);
			input = input.replace(input.valueOf(ch), "");
			int newLength = input.length();
			int diff = acutualLength-newLength;
			if(diff == 1)
			{
				System.out.println(ch + "-->" + diff);
				break;
				
			}
		}
	}
	
	public static void main(String[] args) {
		LastNonRepetative lastNonRepetative = new LastNonRepetative();
		String var = "technocredits";
		System.out.println("print last non repetitive character");
		System.out.println("Input : " + var);
		lastNonRepetative.nonRep(var);
	}
}
