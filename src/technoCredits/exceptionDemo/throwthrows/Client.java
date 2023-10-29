package technoCredits.exceptionDemo.throwthrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Client {
	
	void m1() throws Exception{
		File file = new File("D://sep23.txt");
		FileInputStream stream = new FileInputStream(file);
		
		Properties prop = new Properties();
		prop.load(stream);
	}
	
	void m2() {
		try {
			m1();
		}catch(FileNotFoundException fe) {
			System.out.println("credits");
		}catch(IOException ie) {
			System.out.println("Hi");
		}catch(Exception e) {
			System.out.println("techno");
		}
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		new Client().m2();
	}
}
