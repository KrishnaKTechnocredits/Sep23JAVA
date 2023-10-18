package technoCredits.exceptionDemo.throwthrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A {
	
	void m1() throws FileNotFoundException{
		File file = new File("D://mmk.txt");
		FileInputStream inputStream = new FileInputStream(file);
	}
	
	void m2() throws FileNotFoundException{
		try {
			m1();
		}catch(FileNotFoundException fe) {
			
		}
	}
	
	void m3() {
		try {
			m2();
		} catch (FileNotFoundException e) {
			
		}
	}
}
