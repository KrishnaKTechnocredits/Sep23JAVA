/*Assignment-68 : 29th Oct'23 Create Connection and apply singleton design pattern. 
Create client class and prove design pattern works as expected*/
package shrutika;

public class As68SingleTonDesignPattern {
	private static As68SingleTonDesignPattern connection;

	private As68SingleTonDesignPattern() {

	}

	static As68SingleTonDesignPattern getObject() {
		if (connection == null) {
			connection = new As68SingleTonDesignPattern();
		}
		return connection;
	}

	void makeDBConnection() {
		System.out.println("Applied singletone design pattern");
	}
}
