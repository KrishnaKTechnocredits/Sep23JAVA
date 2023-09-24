package shamli;

public class Assignment19 {

	void freqOfChar(String input) {
		int freq=0;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch=='t') {
				freq++;
			}
		}
		System.out.println("Frequency of char t is :"+freq);
	}
	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		assignment19.freqOfChar("technocredits");
	}
}
