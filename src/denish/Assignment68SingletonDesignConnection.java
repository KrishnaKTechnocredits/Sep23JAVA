/*Assignment-68 : 29th Oct'23

Create Connection and apply singleton design pattern.
Create client class and prove design pattern works as expected.*/
package denish;

public class Assignment68SingletonDesignConnection {

	private static Assignment68SingletonDesignConnection con;

	private Assignment68SingletonDesignConnection() {
		System.out.println("Connection to DB!");
	}

	static Assignment68SingletonDesignConnection getObject() {
		if (con == null) {
			con = new Assignment68SingletonDesignConnection();
		}
		return con;
	}
}
