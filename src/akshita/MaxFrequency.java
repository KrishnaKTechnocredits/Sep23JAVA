//WAP to find character having maximum frequency from given string
//input: aakansha,Teecccchnoocredit


package akshita;

public class MaxFrequency {
	int getCharFrequency(String input, char ch) {
		int count=0;
		for(int sindex=0; sindex<input.length();sindex++){
			if(input.charAt(sindex) == ch) {
				count++;
			}
		}
		return count;
	}
	
	void printMaxCharFrequency(String input) {
		int max =0;
		char maxChar = ' ';
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			int freq = getCharFrequency(input,ch);	
				if(max<freq) {
					max = freq;
					maxChar = ch;
				}
			}
		System.out.println("Output => " + maxChar + " => "+ max);
	}
	
	public static void main(String[] args) {
		MaxFrequency maxFrequency = new MaxFrequency();
		String var= "akansha";
		String var1 = "teeccchnnoocredit";
		
		System.out.println("Character having maximum frequency");
		System.out.println("  ");
		System.out.println("Input : " + var);
		maxFrequency.printMaxCharFrequency(var);
		System.out.println("  ");
		
		System.out.println("Input : " + var1);
		maxFrequency.printMaxCharFrequency(var1);
		System.out.println("  ");
	}

}
