/*Assignment-95 : 17th Nov'2023 From text file,
print the line having maximum words. output : tech pune hello hi india -> 5 words*/

package denish;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment95_Print_Max_Word {

	String maxWords = "";

	int getWordCount(String line) {
		String[] arr = line.split(" ");
		return arr.length;
	}

	void processData(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		int wordCount = 0;
		while (sc.hasNextLine()) {
			String newLine = sc.nextLine();
			int freq = getWordCount(newLine);
			if (wordCount < freq) {
				wordCount = freq;
				maxWords = newLine;
			}
		}
		System.out.println("Max Word Is : " + maxWords);
		System.out.println("Count : " + wordCount);
	}

	public static void main(String[] args) throws FileNotFoundException {
		Assignment95_Print_Max_Word ass = new Assignment95_Print_Max_Word();
		ass.processData("./src/denish/practis2.txt");
	}
}
