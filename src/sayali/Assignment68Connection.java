/* Create Connection and apply singleton design pattern.
Create client class and prove design pattern works as expected. */

package sayali;

public class Assignment68Connection {

	private static Assignment68Connection con;

	private Assignment68Connection() {
		System.out.println("DB Connection");
	}

	static Assignment68Connection getObject() {
		if (con == null) {
			con = new Assignment68Connection();
		}
		return con;
	}

	void selectData(String query) {

	}
}