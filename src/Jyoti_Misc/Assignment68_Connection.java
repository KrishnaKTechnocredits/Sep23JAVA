package Jyoti_Misc;

public class Assignment68_Connection {
	static Assignment68_Connection con;

	private Assignment68_Connection() {

		System.out.println("Connect to DB---");

	}

	/*
	 * static Assignment68_Connection getObject() { Assignment68_Connection con =new
	 * Assignment68_Connection(); return con; }
	 */

	static Assignment68_Connection getObject() {
		if (con == null) {
			con = new Assignment68_Connection();
		}
		return con;
	}

}
