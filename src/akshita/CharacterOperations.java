//WAP to print string "Technocredit" in reverse order with frequency of repeated Char


package akshita;

public class CharacterOperations {
	void reverseWithFrequency(String input,char var,int count) {
		System.out.println("print string Technocredit in reverse order with Index");
			for(int index=input.length()-1;index>=0;index--) {
				System.out.println(index + " => " + input.charAt(index)); 
					if(input.charAt(index) == var) {
						count = count +1;
				}
		}
	System.out.println("Frequency of " + var + " is " + count );	
	}
	
public static void main(String[] args) {
	CharacterOperations characterOperations = new CharacterOperations();
	characterOperations.reverseWithFrequency("Technocredits",'c',0);
	characterOperations.reverseWithFrequency("Technocredits",'t',0);
	characterOperations.reverseWithFrequency("Technocredits",'e',0);
	characterOperations.reverseWithFrequency("Technocredits",'d',0);
		
    }
	
}
