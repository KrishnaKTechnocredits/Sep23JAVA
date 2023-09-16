package akshita;

public class MaxCharFrequency {
	
	int getMaxCharFrequncy(String input, char ch) {
		int count =0;
			for(int sindex=0;sindex<input.length();sindex++) {
				if(input.charAt(sindex)>ch) {
					count++;
				}
			}	
		return count;
	}
	
	void printMaxCharFrequency(String input) {
	int max = 0;
	char maxChar = ' ';
		for(int index =0;index<input.length();index++) {
			char ch= input.charAt(index);
			int freq = getMaxCharFrequncy(input,ch);
				if(max<freq) {
					max= freq;
					maxChar = ch;
				}
		}
		System.out.println("Output: " + maxChar + " =>" + max);
	}
	
	public static void main(String[] args) {
		MaxCharFrequency maxCharFrequency = new MaxCharFrequency();	
		System.out.println("Maximun frequency character");
		System.out.println("  ");
		
		String var = "aakansha";
		System.out.println("Input: " + var);
		maxCharFrequency.printMaxCharFrequency(var);
		System.out.println("  ");
		
		String var1 = "teecchnoocredit";
		System.out.println("Input: " + var1);
		maxCharFrequency.printMaxCharFrequency(var1);
	}

}
