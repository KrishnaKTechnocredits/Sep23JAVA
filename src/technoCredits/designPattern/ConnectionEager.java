package technoCredits.designPattern;

//Eager loading
// Eager initialization
public class ConnectionEager {
	private static ConnectionEager con = new ConnectionEager();
	
	private ConnectionEager(){
		System.out.println("Connect to DB --- ");
	}

	static ConnectionEager getObject(){
		return con;
	}
	
	void seletData(String query) {
	
	}
	
	void deleteData(String query) {
		
	}
	
	void updateData(String query) {
		
	}
}
