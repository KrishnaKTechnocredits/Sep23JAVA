/*Assignment-68 : 29th Oct'23

Create Connection and apply singleton design pattern.
Create client class and prove design pattern works as expected.

-----------------------------------------
*/

package deepak;

public class Assignment68_SingleTonDesignClient {
	public static void main(String[] args) {
		Assignment68_SingleTonDesignConnection con1 = Assignment68_SingleTonDesignConnection.getObject();
		System.out.println(con1);
		Assignment68_SingleTonDesignConnection con2 = Assignment68_SingleTonDesignConnection.getObject();
		System.out.println(con2);
	}
}
