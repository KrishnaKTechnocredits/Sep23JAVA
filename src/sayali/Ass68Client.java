
package sayali;

public class Ass68Client {
	public static void main(String[] args) {

		Assignment68Connection con1 = Assignment68Connection.getObject();
		System.out.println(con1);

		Assignment68Connection con2 = Assignment68Connection.getObject();
		System.out.println(con2);

		Assignment68Connection con3 = Assignment68Connection.getObject();
		System.out.println(con3);

		Assignment68Connection con4 = con3;
		System.out.println(con4);
	}
}