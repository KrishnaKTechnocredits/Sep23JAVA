package technoCredits.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextOperation {
	
	void printGivenWordCount(String line, String word) {
		String[] words = line.split(" ");
		int count = 0;
		for(String currentWord : words) {
			currentWord = currentWord.replaceAll("\\.", "");
			
			if(currentWord.equals(word))
				count++;
		}
		System.out.println(count);
	}
	
	
	void readTextData(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
	
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			System.out.println(line);
			printGivenWordCount(line, "techno");
		}
		sc.close();
	}
	
	
	public static void main(String[] args) throws FileNotFoundException{
		TextOperation textOperation = new TextOperation();
		textOperation.readTextData("readme.txt");
	}
}
