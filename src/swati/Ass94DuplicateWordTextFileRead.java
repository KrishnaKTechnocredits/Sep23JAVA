/*Assignment-94 : 17th Nov'2023 Consider you have a text file with multiple line.
Create a method which will print frequency of given word in each line. 
input : text file with few lines input : technocredits 
output : 1.this is technocredits in pune technocredits -> 2    
2.this is pune -> 0    
3.technocredits is well known institute to learn automation -> 1*/
package swati;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ass94DuplicateWordTextFileRead {

	void printWordCount(String line, String word) {
		String[] arrayOfWords = line.split(" ");
		int count = 0;
		for (String currentWord : arrayOfWords) {
			if (currentWord.equals(word)) {
				count++;
			}
		}
		System.out.println(word + " : " + count);
	}

	void readTextFile(String textFilePath) throws FileNotFoundException {
		File file = new File(textFilePath);
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String newLine = sc.nextLine();
			System.out.println(newLine);
			printWordCount(newLine, "technocredits");
		}
		sc.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		new Ass94DuplicateWordTextFileRead().readTextFile("./src/swati/readmepractice2.txt");
	}
}
