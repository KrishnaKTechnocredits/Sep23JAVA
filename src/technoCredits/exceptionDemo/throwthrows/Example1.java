package technoCredits.exceptionDemo.throwthrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example1 {
	
	
	Example1() throws FileNotFoundException {
		System.out.println("Hi");
	}

	void m1() throws FileNotFoundException {
		File file = new File("D://mmk123123.txt");
		FileInputStream inputStream = new FileInputStream(file);
	}

	public static void main(String[] args) throws FileNotFoundException {
		try {
			Example1 example1 = new Example1();
			example1.m1();
		}catch(Exception fe) {
			System.out.println("Handled");
		}
		System.out.println("End");
	}
}
