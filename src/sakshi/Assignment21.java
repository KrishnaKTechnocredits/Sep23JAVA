package sakshi;

public class Assignment21 {
	
	int getCharacterFrequency(String name, char ch) {
		int count=0;
		for(int index=0; index<name.length(); index++){
		if(name.charAt(index)==ch) {
			count++;
		}
		}
		return count;
	}
	
	void getMaximumCharFrequency(String inputName) {
		int maxFrequency = 0;z
		char maxChar =' ';
		for(int index=0; index<inputName.length(); index++) {
			char ch = inputName.charAt(index);
			int frequency= getCharacterFrequency(inputName, ch);
			if(maxFrequency<frequency) {
				maxFrequency = frequency;
				maxChar = ch;
			}
		}
		System.out.println(inputName + "--> "+ maxChar +" --> " + maxFrequency);
	}
	
	public static void main(String[] args) {
		Assignment21 assignment21 = new Assignment21();
		assignment21.getMaximumCharFrequency("aakanksha");
		assignment21.getMaximumCharFrequency("teecccchnoceredites");
	}
}
