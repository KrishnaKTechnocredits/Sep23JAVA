/*Create Connection and apply singleton design pattern.
Create client class and prove design pattern works as expected.*/

package onkar.Assignment68;

public class SingletoneDesignPattern {
	
	private static SingletoneDesignPattern connection;
	
	private SingletoneDesignPattern() {
		
	}
	
	static SingletoneDesignPattern getObject() {
		if (connection == null) {
			connection = new SingletoneDesignPattern();
		}
		return connection;
	}
	
	void makeDBConnection(){
		//Sample method created for test purpose
		System.out.println("Applied singletone design pattern");
	}
}
