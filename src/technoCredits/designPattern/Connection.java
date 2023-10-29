package technoCredits.designPattern;

//Lazy loading
// Lazy initialization
public class Connection {
	private static Connection con;
	
	private Connection(){
		System.out.println("Connect to DB --- ");
	}

	static Connection getObject(){
		if(con == null) {
			con = new Connection();
		}
		return con;
	}
	
	void seletData(String query) {
	
	}
	
	void deleteData(String query) {
		
	}
	
	void updateData(String query) {
		
	}
}
