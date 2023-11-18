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
	
	Properties properties;
	
	public As92DataOperation(String filePath) throws IOException {
		File file = new File(filePath);
		FileInputStream fileInputStream = new FileInputStream(file);
		properties = new Properties();
		properties.load(fileInputStream);
	}
	
	public String getValue(String key) {
		return properties.getProperty(key);
	}
	
	public static void main(String[] args) throws IOException  {
		As92DataOperation Operation = new As92DataOperation(".\\src\\shrutika\\As92TestData.Properties");
		String value = Operation.getValue("username");
		System.out.println("Username= " + value);// key exits

		String value1 = Operation.getValue("browser");
		System.out.println("Browser= " + value1);// key does not exits

		String value2 = Operation.getValue("env");
		System.out.println("Enviornment= " + value2);// same key with different value(duplicate key)
	}
}
