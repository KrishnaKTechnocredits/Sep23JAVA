//WAP which take input and return all uppercase from given input using ASCII
//Input: TeCHNocreditS
//Output: TCHNS

package akshita;

public class CapitalCharAscii {

	String upperCase(String input) {
		String output="";
		for(int index=0;index<input.length();index++) {
			
			char ch = input.charAt(index);
				if(ch>=65 && ch<=90) {
					output= output + ch;
				}
		}
		return output;
	}	
	public static void main(String[] args) {
		CapitalCharAscii capitalCharAscii = new CapitalCharAscii();
		
		System.out.println("Uppercase from given input using ASCII");
		String var = "TeCHNocreditS";
		System.out.println("INput: " + var);
	    System.out.print("Output : ");
	    
		System.out.println(capitalCharAscii.upperCase(var));
	}
}
