/*Assignment-93: 17th Nov'2023
Practice to load a text file and print all lines.

Hint : Read text file using Scanner class. 
Scanner sc = new Scanner(FileName); */
package shrutika;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class As93ReadingTheFile {
	
	void textRead(String filePath)throws FileNotFoundException {
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			String newLine = sc.nextLine();
			System.out.println(newLine);
		}
		sc.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		As93ReadingTheFile as93ReadingTheFile = new As93ReadingTheFile();
		as93ReadingTheFile.textRead(".\\src\\shrutika\\As93UserFile.txt");
	}
}
