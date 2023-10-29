package technoCredits.exceptionDemo.throwthrows;

import java.io.IOException;

public class Example2 {

	void start(String browser) throws InvalidBrowserException{
		if(browser.equals("chrome")){
			System.out.println("chrome started");
		}else if(browser.equals("ff")){
			System.out.println("ff started");
		}else if(browser.equals("edge")){
			System.out.println("edge started");
		}else{
			throw new InvalidBrowserException("requested browser "+ browser +" is not supported");				
			//System.out.println("requested browser is not supported"); CE
		} 
	}
	
	int processData(String str) {
		if(str.equals("chrome"))
			return 1;
		else if(str.equals("ff"))
			return 2;
		
		throw new NullPointerException();
	}
	
	public static void main(String[] args){
		System.out.println("Program started");
		Example2 example2 = new Example2();
		try {
			example2.start("safari");
		} catch (InvalidBrowserException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end");
	}
}
