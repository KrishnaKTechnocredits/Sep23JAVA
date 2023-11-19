package denish;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Assignment92_Data_Operation {

	Properties properties;

	public Assignment92_Data_Operation(String filepath) throws IOException {
		File file = new File(filepath);
		FileInputStream fileInputStream = new FileInputStream(file);
		properties = new Properties();
		properties.load(fileInputStream);
	}

	public String getValue(String key) {
		return properties.getProperty(key);
	}

	public static void main(String[] args) throws IOException {
		Assignment92_Data_Operation ass = new Assignment92_Data_Operation("./src/denish/config.properties");
		String envValue = ass.getValue("env");
		System.out.println("Environment :" + envValue);

		String password = ass.getValue("password");
		System.out.println("Password:" + password);

		String username = ass.getValue("userName");
		System.out.println("UserName :" + username);
	}
}
