package technoCredits;

public class SwitchEx2 {
	
	void bankOperation(String bank, String op) {
		
		switch(bank) {
			case "ICICI" :
				if(op.equals("debit"))
					System.out.println("ICICI debit operation is performed");
				else if(op.equals("credit"))
					System.out.println("ICICI credit operation is performed");
				break;
				
			case "HDFC" :
				switch(op) {
					case "debit":
						System.out.println("HDFC debit operation is performed");
						break;
						
					case "credit":
						System.out.println("HDFC credit operation is performed");
						break;
						
					default :
						System.out.println("operation invalid");
				}
				break;
				
			default :
				System.out.println("Bank invalid");
		}
	}
	
	public static void main(String[] args) {
		new SwitchEx2().bankOperation("HDFC", "credit");
	}
}
