package technoCredits.designPattern;

public class Client {

	public static void main(String[] args) {
		Connection con1 = Connection.getObject();
		System.out.println(con1);
		
		Connection con2 = Connection.getObject();
		System.out.println(con2);
		
		Connection con3 = con2;
		System.out.println(con3);
	}
}
