/*Assignment-95 : 17th Nov'2023
From text file, print the line having maximum words.

output : tech pune hello hi india -> 5 words */
package shrutika;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class As95MaxWordInFile {

	int getwordLength(String line) {
		String[] wordArry = line.split(" ");
		return wordArry.length;
	}

	void maximumWordsFromFile(String filePath) throws FileNotFoundException {
		String maxWord = "";
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		int countWord = 0;
		while (sc.hasNextLine()) {
			String newLine = sc.nextLine();
			int freq = getwordLength(newLine);
			if (countWord < freq) {
				countWord = freq;
				maxWord = newLine;
			}
		}
		sc.close();
		System.out.println("Number of Max Words in sentence is :\n " + maxWord + " -> " + countWord);
	}

	public static void main(String[] args) throws FileNotFoundException {
		As95MaxWordInFile as95MaxWordInFile = new As95MaxWordInFile();
		as95MaxWordInFile.maximumWordsFromFile(".\\src\\shrutika\\As95UserFile3.txt");
	}
}
