/*Assignment-95 : 17th Nov'2023 From text file,
print the line having maximum words. output : tech pune hello hi india -> 5 words*/
package swati;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ass95PrintLineWithMaxWord {
	String maxWordSentence = "";

	int getWordCount(String line) {
		String[] arrayOfWords = line.split(" ");
		return arrayOfWords.length;
	}

	void readTextFile(String textFilePath) throws FileNotFoundException {
		File file = new File(textFilePath);
		Scanner sc = new Scanner(file);
		int wordCount = 0;
		while (sc.hasNextLine()) {
			String newLine = sc.nextLine();
			int freq = getWordCount(newLine);
			if (wordCount < freq) {
				wordCount = freq;
				maxWordSentence = newLine;
			}
		}
		System.out.println("Sentence having maximum words is :" + maxWordSentence);
		System.out.println("No of words are :" +wordCount);
		sc.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		new Ass95PrintLineWithMaxWord().readTextFile("./src/swati/readmepractice3.txt");
	}
}
