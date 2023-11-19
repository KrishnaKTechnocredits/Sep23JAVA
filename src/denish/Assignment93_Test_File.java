package denish;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment93_Test_File {

	void readData(String textPath) throws FileNotFoundException {
		File file = new File(textPath);
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String newLine = sc.nextLine();
			System.out.println(newLine);
		}
		sc.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		Assignment93_Test_File ass = new Assignment93_Test_File();
		ass.readData("./src/denish/reamData.txt");
	}
}
