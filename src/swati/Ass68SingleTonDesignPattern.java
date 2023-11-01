/*Assignment-68 : 29th Oct'23 Create Connection and apply singleton design pattern. 
Create client class and prove design pattern works as expected*/
package swati;

public class Ass68SingleTonDesignPattern {
	
	private static Ass68SingleTonDesignPattern connection;
	
	private Ass68SingleTonDesignPattern() {
		
	}
	
	static Ass68SingleTonDesignPattern getObject() {
		if (connection == null) {
			connection = new Ass68SingleTonDesignPattern();
		}
		return connection;
	}
	
	void makeDBConnection(){
		System.out.println("Applied singletone design pattern");
	}
}