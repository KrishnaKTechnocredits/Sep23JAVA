/*Assignment-93: 17th Nov'2023 Practice to load a text file and print all lines. 
Hint : Read text file using Scanner class. Scanner sc = new Scanner(FileName);*/

package swati;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ass93LoadTestFile {

	void readTest(String textPath) throws FileNotFoundException {
		File file = new File(textPath);
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String newLine = sc.nextLine();
			System.out.println(newLine);
		}
		sc.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		Ass93LoadTestFile ass93LoadTestFile = new Ass93LoadTestFile();
		ass93LoadTestFile.readTest("./src/swati/readmepractice1.txt");
	}
}
