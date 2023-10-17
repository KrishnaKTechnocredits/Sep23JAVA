package pavan;

public class Assi25 {
	void processDataAll(String input) {
		for(int index=0; index < input.length(); index++) {
			int count = 0;
			char ch = input.charAt(index);
			if(ch != '*') {
				for(int innerIndex=0; innerIndex < input.length(); innerIndex++) {
					if(input.charAt(innerIndex) == ch)
						count++;
				}
				System.out.println(ch + "->" + count);
				input = input.replace(ch, '*');
			}
		}
	}
	
	public static void main(String[] args) {
		Assi25 assi25 = new Assi25();
		assi25.processDataAll("aakanksha");
	}
}
