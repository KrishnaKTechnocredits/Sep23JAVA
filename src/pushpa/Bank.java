package pushpa;

class Bank {

    int balance = 1000;

    public void creditAmt(int amt) {
        if (amt > 5000)
            System.out.println("You can't deposite more than 5000 rs in one go.");
        else if (amt <= 0)
            System.out.println("Invalid amount");
        else
            balance += amt;
    }

    public void debitAmt(int amt) {
        if (amt > balance)
            System.out.println("Insufficient balance.");
        else if (amt <= 0)
            System.out.println("Invalid amount.");
        else
            balance -= amt;
    }

    public void checkBalance() {
        System.out.println("Available balance is " + balance + "Rs.");
    }

    public static void main(String args[]) {
        Bank bank = new Bank();
        bank.creditAmt(6000);
        bank.creditAmt(-500);
        bank.creditAmt(1000);
        bank.checkBalance();
        bank.debitAmt(5000);
        bank.debitAmt(-1000);
        bank.debitAmt(500);
        bank.checkBalance();
    }
}