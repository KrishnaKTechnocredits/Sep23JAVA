/*Assignment-68 : 29th Oct'23

Create Connection and apply singleton design pattern.
Create client class and prove design pattern works as expected.

-----------------------------------------
*/

package deepak;

public class Assignment68_SingleTonDesignConnection {
	private static Assignment68_SingleTonDesignConnection con;

	private Assignment68_SingleTonDesignConnection() {
		System.out.println("------DB Connection Established------");
	}

	static Assignment68_SingleTonDesignConnection getObject() {
		if (con == null) {
			con = new Assignment68_SingleTonDesignConnection();
		}
		return con;
	}

	void getData() {
		System.out.println("In getData method");
	}

	void processData() {
		System.out.println("In processData method");
	}
}
