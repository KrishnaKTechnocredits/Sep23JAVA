package hetal;

class Bankdetails {
         int balance = 1000;
		 int debitcount;
		 int creditcount;
		 int printcount;
		 
		 void debitAmt(int amt){
			balance = balance - amt;
			debitcount=debitcount+1;
			
		 }
		 
		 void creditAmt(int amt){
			balance = balance + amt;
			creditcount = creditcount+1;
			
		 }
		 
		 void printstatementcount(){
			 printcount = printcount + 1;
		 }
		 
		 void printCountInfo(){
			 
			 System.out.println("remaining balance is " + balance);
			 System.out.println(debitcount + " times debitcount performed");
			 System.out.println(creditcount + " times creditcount performed");
			 System.out.println(printcount + " times printstatementcount performed");
		 }	 
		 
		 public static void main(String[] args){
			 Bankdetails bankdetails = new Bankdetails();
			 bankdetails.debitAmt(100);
			 bankdetails.debitAmt(300);
			 bankdetails.printstatementcount();
			 bankdetails.debitAmt(100);
			 bankdetails.creditAmt(600);
			 bankdetails.printstatementcount();
			 bankdetails.creditAmt(400);
			 bankdetails.printCountInfo();
		 }
			 	 
}