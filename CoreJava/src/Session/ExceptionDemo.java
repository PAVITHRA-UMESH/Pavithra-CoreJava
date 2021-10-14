package Session;

class Account {
	private static int acc_balance = 0;

	public Account(int acc_balance) {
		super();
		this.acc_balance = acc_balance;
	}

	void withdraw(int amount) {
		try {
			if (amount > acc_balance) {
				throw new WithdrawException("Insufficient Balance!!!");
			} else {
				acc_balance = acc_balance - amount;
			}
		} catch (WithdrawException e) {
			System.err.println(e);

		}
	}

	void showBalance() {
		System.out.println("Balance:" + acc_balance);
	}
}

class WithdrawException extends Exception {

	String msg;

	public WithdrawException(String msg) {
		super(msg);
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Withdraw Exception:" + msg;
	}
}

public class ExceptionDemo {

	public static void main(String[] args) {
		Account ac = new Account(25000); // This is the initial balance
		System.out.println("Pass withdraw amount more than Account Balance : ");
		ac.withdraw(30000);
		System.out.println("--------------------------------------------------");

		System.out.println("Pass withdraw amount less than Account Balance : ");
		ac.withdraw(20000);
		ac.showBalance();
		System.out.println("--------------------------------------------------");

		System.out.println("Again pass withdraw amount more than Account Balance : ");
		ac.withdraw(10000);

	}

}
