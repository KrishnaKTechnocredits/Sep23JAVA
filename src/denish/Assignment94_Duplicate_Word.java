/*Assignment-94 : 17th Nov'2023 Consider you have a text file with multiple line.
Create a method which will print frequency of given word in each line. 
input : text file with few lines input : technocredits 
output : 1.this is technocredits in pune technocredits -> 2    
2.this is pune -> 0    
3.technocredits is well known institute to learn automation -> 1*/
package denish;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment94_Duplicate_Word {

	void printWordCount(String line, String word) {
		String[] arrOfWords = line.split(" ");
		int count = 0;
		for (String currentWord : arrOfWords) {
			if (currentWord.equals(word)) {
				count++;
			}
		}
		System.out.println(word + " : " + count);
	}

	void readTextFile(String FilePath) throws FileNotFoundException {
		File file = new File(FilePath);
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String newLine = sc.nextLine();
			System.out.println(newLine);
			printWordCount(newLine, "technocredits");
		}
		sc.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		Assignment94_Duplicate_Word ass = new Assignment94_Duplicate_Word();
		ass.readTextFile("./src/denish/practis.txt");
	}
}
