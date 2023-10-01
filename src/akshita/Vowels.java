//WAP to get the sum of digits n a string only if there is any vowels in string else return 0.
//Input: "Pu1ne5lnd3ia" , "R1hlTns7h";
//Output:9 

package akshita;

public class Vowels {
	boolean test;
	int sum=0;
	int sum(String input) {
		
		for(int index=0;index<input.length();index++){
			char ch = input.charAt(index);
			if(ch =='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				test = true;	
			}
		}
		if(test==true) {
			for(int index=0;index<input.length();index++){
				char ch = input.charAt(index);
				if(Character.isDigit(ch)) {
					sum= sum + Character.getNumericValue(ch); 
				}	
			}	
		}
		return sum;
	}	
public static void main(String[] args) {
		System.out.println("Print sum of digit if there is any vowels in string : ");
		Vowels vowels = new Vowels();
		String v1 = "Pu1ne5lnd3ia";
		System.out.println("Input : " + v1 +" => " + "Ouput : " + vowels.sum(v1));
		Vowels s2 = new Vowels();
		String v2 = "R1hlTns7h";
		System.out.println("Input : " + v2 +"   => " + "Output : " + s2.sum(v2));	
		
		
	}
}
