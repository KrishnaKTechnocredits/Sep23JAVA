package pushpa;

public class Assignment68_Client {

	public static void main(String[] args) {
		Assignment68_Connection con1 = Assignment68_Connection.getObject();
		Assignment68_Connection con2 = Assignment68_Connection.getObject();
		Assignment68_Connection con3 = Assignment68_Connection.getObject();
		System.out.println("Connection 1 " + con1);
		System.out.println("Connection 2 " + con2);
		System.out.println("Connection 3 " + con3);
		con3.m1();
	}
}
