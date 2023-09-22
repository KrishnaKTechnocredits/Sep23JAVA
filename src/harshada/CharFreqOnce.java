//Assingment - 25 : 18th Sep'2023
//Print the freq of all character using nested for loop.
//String str = "aakansha";
//output : a -> 4
//         k -> 2
//		   n -> 1 
//		   s -> 1
//         h -> 1

package harshada;

public class CharFreqOnce {
	
	void printFreq(String input) {
			
		for(int index=0; index<input.length(); index++) {
			int count=0;
			
			if(input.charAt(index) != '*') {
				for(int innerIndex=0; innerIndex<input.length(); innerIndex++) {
					if(input.charAt(index)==input.charAt(innerIndex))
						count++;
				}
				System.out.println(input.charAt(index)+"-->"+count);
			}
			input=input.replace(input.charAt(index),'*');
		}
	}
	
	public static void main(String[] args) {
		CharFreqOnce charFreqOnce=new CharFreqOnce();
		charFreqOnce.printFreq("aakansha");
	}

}
