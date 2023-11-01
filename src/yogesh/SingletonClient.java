package yogesh;

public class SingletonClient {

	public static void main(String[] args) {
		Yogesh_Assignment68 object = Yogesh_Assignment68.getObject();
		object.makeDBConnection();
		// SingletoneDesignPattern object = new SingletoneDesignPattern(); // Client
		// cannot create object of that class
	}
}
