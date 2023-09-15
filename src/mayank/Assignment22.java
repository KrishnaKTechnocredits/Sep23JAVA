package mayank;

public class Assignment22 {

	int getCharFreq(String input,char ch){
		int count =0;
		for (int index=0;index<input.length();index++){
			if (ch ==input.charAt(index))
				count++;
		}
		return count;
	}
		void maxCharacter(String input){
			int maxFreq=0;
			char maxChar=' ';
			for(int index=0;index<input.length();index++){
				char ch = input.charAt(index);
				int freq = getCharFreq(input,ch);
				if(maxFreq<freq){
					maxFreq =freq;
					maxChar = ch;
				}
			}
			System.out.print(input + " -- "  + maxChar + " -> " +maxFreq);
		}

		public static void main(String[] args){
			Assignment22 assignment22 = new Assignment22();
			assignment22.maxCharacter("aakanksha");
			assignment22.maxCharacter("teecchnoceredeits");
			
		}

}
