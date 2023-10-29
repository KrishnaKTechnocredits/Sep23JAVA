/*Assignment-68 : 29th Oct'23

Create Connection and apply singleton design pattern.
Create client class and prove design pattern works as expected.*/
package denish;

public class Assignment68SingletonDesignClient {

	public static void main(String[] args) {
		Assignment68SingletonDesignConnection con1 = Assignment68SingletonDesignConnection.getObject();
		System.out.println(con1);

		Assignment68SingletonDesignConnection con2 = Assignment68SingletonDesignConnection.getObject();
		System.out.println(con2);

		Assignment68SingletonDesignConnection con3 = con2;
		System.out.println(con3);
	}
}
