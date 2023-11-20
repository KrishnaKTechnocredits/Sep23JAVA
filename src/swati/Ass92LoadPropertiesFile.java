/*Assignment-92: 17th Nov'2023 1. Practice to load properties file (provide key) 
Create properties file, write a constructor to load file. Create a method which 
should accept key and return value stored against that key. Verify behavior when 
		key does not exists and try to get value against key. Verify behavior
when we have same key with different value in properties file (duplicate key).*/

package swati;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Ass92LoadPropertiesFile {

	Properties properties;

	public Ass92LoadPropertiesFile(String filePath) throws IOException {

		File file = new File(filePath);
		FileInputStream fileInputStream = new FileInputStream(file);
		properties = new Properties();
		properties.load(fileInputStream);
	}

	public String getValue(String key) {
		return properties.getProperty(key);
	}

	public static void main(String[] args) throws IOException {
		Ass92LoadPropertiesFile ass92LoadPropertiesFile = new Ass92LoadPropertiesFile(".\\src\\swati\\configFile1.properties");
		String envValue = ass92LoadPropertiesFile.getValue("env");
		System.out.println("Environment 1: " + envValue);// exist

		String password = ass92LoadPropertiesFile.getValue("password");
		System.out.println("password: " + password);// does not exist

		// New or different file data loading with same key
		Ass92LoadPropertiesFile ass92LoadPropertiesFile1 = new Ass92LoadPropertiesFile(".\\src\\swati\\configFile2.properties");
		String envValue1 = ass92LoadPropertiesFile1.getValue("env");
		System.out.println("Environment 2: " + envValue1);// Same key in different property file with different value
	}
}
