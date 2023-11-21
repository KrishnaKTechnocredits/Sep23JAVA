/* Practice to load a text file and print all lines. 
Hint : Read text file using Scanner class. Scanner sc = new Scanner(FileName); */

package sayali;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ass93LoadTextFile {

	void readText(String textPath) throws FileNotFoundException {
		File file = new File(textPath);
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String newLine = sc.nextLine();
			System.out.println(newLine);
		}
		sc.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		Ass93LoadTextFile ass93LoadTextFile = new Ass93LoadTextFile();
		ass93LoadTextFile.readText("./src/sayali/Ass93PracticeTextFile.txt");
	}
}