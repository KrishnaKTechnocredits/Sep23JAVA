package gaurang;

public class Assignment20 {
	
	void charFreq(String input) {
		for(int index = 0; index<input.length();index++) {
			int count = 0;
			char ch = input.charAt(index);
			for(int innerindex=0;innerindex<input.length();innerindex++) {
				if(input.charAt(innerindex)==ch)
					count++;
			}
			System.out.println(ch+"-->"+count);
		}
	}
	
	public static void main(String[] args) {
		Assignment20 a20 = new Assignment20();
		a20.charFreq("aakanksha");
	}
}
