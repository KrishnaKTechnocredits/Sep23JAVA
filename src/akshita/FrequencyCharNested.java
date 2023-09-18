//WAP to print the frequency of all character using nested for loop.
//Input: "aakanksha"
//Output: a->4, k->2,n->1,s->1,h->1


package akshita;

public class FrequencyCharNested {
	
	void printFreqChar(String input) {
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			int count=0;
				if(ch != '*') {
					for(int innerIndex=0;innerIndex<input.length();innerIndex++) {
						if(ch==input.charAt(innerIndex)) {
							count++;
						}
					}
					System.out.println(ch + "-->" + count);
					input = input.replace(ch,'*');
			}
				}
				
	}

	public static void main(String[] args) {
		FrequencyCharNested frequencyCharNested = new FrequencyCharNested();
		String ch= "aakanksha";
		System.out.println("Input : " + ch);
		frequencyCharNested.printFreqChar(ch);
	}

}
