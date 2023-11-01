package roshani;

public class Ass68SingletonDesignClient {
	public static void main(String[] args) {
		Ass68SingletonDesignConnection con1 = Ass68SingletonDesignConnection.getObject();
		System.out.println(con1);
		
		Ass68SingletonDesignConnection con2 = Ass68SingletonDesignConnection.getObject();
		System.out.println(con2);
		
		Ass68SingletonDesignConnection con3 = con2;
		System.out.println(con3);
	}
}
