/*Assignment-94 : 17th Nov'2023
Consider you have a text file with multiple line. Create a method which will print frequency of given word in each line.

input : text file with few lines 
input : technocredits

output : this is technocredits in pune technocredits -> 2
              this is pune -> 0
              technocredits is well known institute to learn automation -> 1 */
package shrutika;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class As94FrequencyOfWord {

	void wordCount(String line, String word) {
		String[] wordArry = line.split(" ");
		int count = 0;
		for (String currentword : wordArry) {
			if (currentword.equals(word)) {
				count++;
			}
		}
		System.out.println("Count of " + word + " = " + count);
	}

	void textRead(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String newLine = sc.nextLine();
			System.out.println(newLine);
			wordCount(newLine, "technocredits");
		}
		sc.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		new As94FrequencyOfWord().textRead(".//src//shrutika//As94UserFile2.txt");
	}
}
