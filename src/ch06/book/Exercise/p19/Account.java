package ch06.book.Exercise.p19;

public class Account {
	private static final int MIN_VALUE = 0;
	private final static int MAX_VALUE = 1000000;
	private int Balance;

	public void setBalance(int balance) {
		if(balance>=MIN_VALUE && balance<MAX_VALUE) {
			this.Balance = balance;
		} else {
			this.Balance = 10000;
		}
//		this.Balance = Balance + balance;
		
	}
	
	public int getBalance() {
		
		return Balance;
	}

	
	
}
