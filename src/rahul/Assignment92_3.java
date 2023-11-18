/*WAP to find word frequency, where text file is created and used to find word frequency*/

package rahul;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment92_3 {

	void checkWordFreq(String line, String word) {
		int count = 0;
		System.out.println(line);
		String words[] = line.split(" ");
		for (String currentWord : words) {
			if (currentWord.equals(word))
				count++;
		}
		System.out.println(word + " -> " + count);
	}

	void readTextFile(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			checkWordFreq(str, "techno");
		}
		sc.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		Assignment92_3 assignment92_2 = new Assignment92_3();
		assignment92_2.readTextFile("src/rahul/AllFiles/textFile1");
	}
}
