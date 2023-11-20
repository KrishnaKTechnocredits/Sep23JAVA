/*Practice to load a text file and display all lines (scanner class)*/

package rahul;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment92_2 {

	void readLine(String txtFileName) throws FileNotFoundException {
		File file = new File(txtFileName);
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			System.out.println(str);
		}
		sc.close();
	}

	public static void main(String[] args) throws FileNotFoundException {

		Assignment92_2 assignment92_2 = new Assignment92_2();
		assignment92_2.readLine("src/rahul/AllFiles/textFile1");
	}
}
