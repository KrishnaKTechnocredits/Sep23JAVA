package nikita;

public class AllCharFreq {

	char ch;

	void getfrequency(String input) {
		for(int index=0; index<input.length();index++) {
			int count=0;
			char ch=input.charAt(index);
			for(int innerIndex=0;innerIndex<input.length();innerIndex++){
				if(input.charAt(innerIndex)==ch) {
					count++;
				}				
			}
			System.out.println(ch + " in " + input + " is " +count );
		}

	}

	public static void main(String[] args) {
		AllCharFreq allcharfreq= new AllCharFreq();
		allcharfreq.getfrequency("Nikita");
	}
}
