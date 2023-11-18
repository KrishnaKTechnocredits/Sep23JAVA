/*Practice to load properties file (provide key)*/

package rahul;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Assignment92_1 {

	Properties prop;

	public Assignment92_1(String fileName) throws IOException {
		File file = new File(fileName);
		FileInputStream input = new FileInputStream(file);
		prop = new Properties();
		prop.load(input);
	}

	String getValue(String key) throws IOException {
		String str = prop.getProperty(key);
		return str;
	}

	public static void main(String[] args) throws IOException {

		Assignment92_1 assignment92A = new Assignment92_1("src/rahul/AllFiles/propertyFile1");
		String value = assignment92A.getValue("name");
		System.out.println(value); // rahul
		String value2 = assignment92A.getValue("username");
		System.out.println(value2); // blank value will be displayed

		Assignment92_1 assignment92B = new Assignment92_1("src/rahul/AllFiles/propertyFile2");
		String value3 = assignment92B.getValue("company");
		System.out.println(value3); // persistent
	}
}
