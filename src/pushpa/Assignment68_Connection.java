/*Assignment-68 : 29th Oct'23
Create Connection and apply singleton design pattern.
Create client class and prove design pattern works as expected.*/

package pushpa;

public class Assignment68_Connection {
	private static Assignment68_Connection con;

	private Assignment68_Connection() {

	}

	static Assignment68_Connection getObject() {
		if (con == null) {
			con = new Assignment68_Connection();
		}
		return con;
	}

	void m1() {
		System.out.println("Connection class m1 method");
		System.out.println("Current object " + this);
	}
}
