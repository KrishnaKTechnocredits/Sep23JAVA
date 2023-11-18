/*Assignment-92: 17th Nov'2023

1. Practice to load properties file (provide key)
Create properties file, write a constructor to load file.
Create a method which should accept key and return value stored against that key.
Verify behavior when key does not exists and try to get value against key.
Verify behavior when we have same key with different value in properties file (duplicate key). */
package shrutika;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class As92DataOperation {

	public static void main(String[] args) throws IOException {
		File file = new File(".\\src\\shrutika\\As92TestData.Properties");
		FileInputStream input = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(input);
		String value = prop.getProperty("username");
		System.out.println("Enviornment= " + value);// key exits

		String value1 = prop.getProperty("browser");
		System.out.println("Browser= " + value1);// key does not exits

		String value2 = prop.getProperty("env");
		System.out.println("username= " + value2);// same key with different value(duplicate key)
	}
}
