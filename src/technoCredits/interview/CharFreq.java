package technoCredits.interview;

public class CharFreq {

	void printCharFreq(String input) {
		for (int index = 0; index < input.length(); index++) {
			int count = 0;
			char ch = input.charAt(index);
			if (ch != '#') {
				for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {
					if (ch == input.charAt(innerIndex))
						count++;
				}
				System.out.println(ch + "-->" + count);
				input = input.replace(ch, '#');
			}
		}
	}

	void printCharFreq1(String input) {
		while(input.length()!=0) {
			int count = 0;
			char ch = input.charAt(0);
			for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {
				if (ch == input.charAt(innerIndex))
					count++;
			}
			System.out.println(ch + "-->" + count);
			input = input.replace(String.valueOf(ch), "");
		}
	}
	
	void printAllCharFreq(String str) {
		while(str.length()>0){
			int orgLen = str.length();
			char ch = str.charAt(0);
			str = str.replace(String.valueOf(ch),"");
			int newLen = str.length();
			System.out.println(ch + "-->" + (orgLen-newLen));
		}
	}
	
	void printAllCharFreq1(String str) {
		for(;str.length()>0;){
			int orgLen = str.length();
			char ch = str.charAt(0);
			str = str.replace(String.valueOf(ch),"");
			int newLen = str.length();
			System.out.println(ch + "-->" + (orgLen-newLen));
		}
	}

	public static void main(String[] args) {
		CharFreq charFreq = new CharFreq();
		charFreq.printAllCharFreq1("aakanksha");
	}
}
