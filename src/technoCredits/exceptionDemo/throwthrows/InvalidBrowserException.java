package technoCredits.exceptionDemo.throwthrows;

import java.io.IOException;

public class InvalidBrowserException extends IOException{
	
	public InvalidBrowserException() {
		super();
	}
	
	public InvalidBrowserException(String message) {
		super(message);
	}
}
