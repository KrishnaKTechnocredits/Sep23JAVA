package akshita;

public class FrequencyEachChar {
	void frequencyOfChar(String input) { 
		
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			int count =0;
			for(int innerIndex=0;innerIndex<input.length();innerIndex++) {
	    		if(input.charAt(innerIndex)== ch) {
	    			count++;
	    		}
	    	}
	    		System.out.println( "Frequency of " + ch + "=>" + count); 
    	  }
		 
		}
	
	
	public static void main(String[] args) {
		FrequencyEachChar frequencyEachChar = new FrequencyEachChar();
		
        String userInput = "aakansha";
        
        frequencyEachChar.frequencyOfChar(userInput);
        
        
}
}