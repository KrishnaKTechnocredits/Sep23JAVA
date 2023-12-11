package technoCredits.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropOperation {
	private Properties prop;
	
	public PropOperation(String filePath) throws IOException{
		File file = new File(filePath);
		FileInputStream inputStream = new FileInputStream(file);
		prop = new Properties();
		prop.load(inputStream);
	}
	
	public String getValue(String key) throws IOException{
		return prop.getProperty(key);
	}
	
	public static void main(String[] args) throws IOException{
		String filePath = "./src/technoCredits/dev-config.properties";
		PropOperation propOperation = new PropOperation(filePath);
		String envValue = propOperation.getValue("url");
		System.out.println(envValue);
		
		String urlValue = propOperation.getValue("password");
		System.out.println(urlValue);
		
		String dbCredentails = propOperation.getValue("dbcredentials");
		System.out.println("Hi"+dbCredentails+"Hello");
		
		String filePath1 = "qa-config.properties";
		PropOperation propOperation1 = new PropOperation(filePath1);
		String envValue1 = propOperation1.getValue("env");
		System.out.println(envValue1);
		
		String urlValue1 = propOperation1.getValue("url");
		System.out.println(urlValue1);
		
		
	}
}
