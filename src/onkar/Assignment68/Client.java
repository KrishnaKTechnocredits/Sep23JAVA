package onkar.Assignment68;

public class Client {
	
	public static void main (String[] args) {
		SingletoneDesignPattern object = SingletoneDesignPattern.getObject();
		object.makeDBConnection();
		//SingletoneDesignPattern object = new SingletoneDesignPattern();			// Client cannot create object of that class
	}
}
