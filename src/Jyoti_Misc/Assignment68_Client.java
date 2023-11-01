package Jyoti_Misc;

public class Assignment68_Client {

	public static void main(String[] args) {
		Assignment68_Connection con1 = Assignment68_Connection.getObject();
		System.out.println("Connection1-->" + con1);

		Assignment68_Connection con2 = Assignment68_Connection.getObject();

		System.out.println("Connection2--->" + con2);

	}

}
