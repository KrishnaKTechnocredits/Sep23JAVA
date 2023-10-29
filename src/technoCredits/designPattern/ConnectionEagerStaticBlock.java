package technoCredits.designPattern;

//Eager loading
// static block Eager initialization of singleton design pattern
public class ConnectionEagerStaticBlock {
	private static ConnectionEagerStaticBlock con;
	
	static {
		con = new ConnectionEagerStaticBlock();
	}
	
	private ConnectionEagerStaticBlock(){
		System.out.println("Connect to DB --- ");
	}

	static ConnectionEagerStaticBlock getObject(){
		return con;
	}
	
	void seletData(String query) {
	
	}
	
	void deleteData(String query) {
		
	}
	
	void updateData(String query) {
		
	}
}
