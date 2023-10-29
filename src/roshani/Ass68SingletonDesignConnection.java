/*Assignment-68 : 29th Oct'23
Create Connection and apply singleton design pattern.
Create client class and prove design pattern works as expected.
*/

package roshani;

public class Ass68SingletonDesignConnection {
	private static Ass68SingletonDesignConnection con;
	
	private Ass68SingletonDesignConnection() {
		System.out.println("Connection to DB!");
	}
	
	static Ass68SingletonDesignConnection getObject() {
		if(con == null) {
			con = new Ass68SingletonDesignConnection();
		}
		return con;
	}
}
