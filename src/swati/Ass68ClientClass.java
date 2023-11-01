/*Assignment-68 : 29th Oct'23 Create Connection and apply singleton design pattern. 
Create client class and prove design pattern works as expected*/
package swati;

public class Ass68ClientClass {

	public static void main (String[] args) {
		Ass68SingleTonDesignPattern object = Ass68SingleTonDesignPattern.getObject();
		object.makeDBConnection();
	}
}
