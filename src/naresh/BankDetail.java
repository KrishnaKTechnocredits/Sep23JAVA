package naresh;

class BankDetail{
	int balance=1000;
	int debitCount;
	int creditCount;
	int printCount;
	
	void DebitAmt(int amt){
		balance=balance-amt;
		debitCount=debitCount+1;
		}
	
	void CreditAmt(int amt){
		balance=balance+amt;
	    creditCount=creditCount+1;
		}
	
	
	void printCountInfo(){		
		
		System.out.println(balance+ " rs. remaining balanace");
		System.out.println(debitCount+ " times debit operation performed");
		System.out.println(debitCount+ " times credit operation performed");
		System.out.println(printCount+ " times print Statement operation performed");	
		}
	
	void printStatement(){
		printCount=printCount+1;
		}
	
	public static void main(String[] args){
	
		BankDetail bankDetail=new BankDetail();
	
		bankDetail.DebitAmt(100);
		bankDetail.DebitAmt(300);
		bankDetail.printStatement();
		bankDetail.DebitAmt(100);
		bankDetail.CreditAmt(600);
		bankDetail.printStatement();
		bankDetail.CreditAmt(400);
		bankDetail.printCountInfo();
		}
	}