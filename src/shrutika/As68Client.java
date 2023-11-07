/*Assignment-68 : 29th Oct'23 Create Connection and apply singleton design pattern. 
Create client class and prove design pattern works as expected*/
package shrutika;

public class As68Client {

	public static void main(String[] args) {
		As68SingleTonDesignPattern object = As68SingleTonDesignPattern.getObject();
		object.makeDBConnection();
	}
}
