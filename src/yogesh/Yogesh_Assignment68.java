//Assignment-68 : 29th Oct'23
//
//Create Connection and apply singleton design pattern.
//Create client class and prove design pattern works as expected.
package yogesh;

public class Yogesh_Assignment68 {

	private static Yogesh_Assignment68 connection;

	private Yogesh_Assignment68() {

	}

	static Yogesh_Assignment68 getObject() {
		if (connection == null) {
			connection = new Yogesh_Assignment68();
		}
		return connection;
	}

	 void makeDBConnection() {
		// Sample method created for test purpose
		System.out.println("Applied singletone design pattern");
	}

}
