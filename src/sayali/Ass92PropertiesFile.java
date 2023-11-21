/* 1. Practice to load properties file (provide key) 
 Create properties file, write a constructor to load file. Create a method which 
should accept key and return value stored against that key. Verify behavior when 
key does not exists and try to get value against key. Verify behavior
when we have same key with different value in properties file (duplicate key).*/

package sayali;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Ass92PropertiesFile {

	Properties properties;

	public Ass92PropertiesFile(String filePath) throws IOException {

		File file = new File(filePath);
		FileInputStream fileInputStream = new FileInputStream(file);
		properties = new Properties();
		properties.load(fileInputStream);
	}

	public String getValue(String key) {
		return properties.getProperty(key);
	}

	public static void main(String[] args) throws IOException {
		Ass92PropertiesFile ass92PropertiesFile = new Ass92PropertiesFile(".\\src\\sayali\\configFile1.properties");
		String envValue = ass92PropertiesFile.getValue("env");
		System.out.println("Environment 1: " + envValue);// key exists

		String password = ass92PropertiesFile.getValue("password");
		System.out.println("password: " + password);// key does not exists

		// New or different file data loading with same key
		Ass92PropertiesFile ass92PropertiesFile1 = new Ass92PropertiesFile(".\\src\\sayali\\configFile2.properties");
		String envValue1 = ass92PropertiesFile1.getValue("env");
		System.out.println("Environment 2: " + envValue1);// same key with different value in properties file
	}
}