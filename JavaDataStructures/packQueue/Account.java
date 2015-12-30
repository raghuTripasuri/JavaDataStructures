package packQueue;

public class Account {
	
	long accountNo;
	String accountType;
	double accountBalance;
	Customer customer;
	
	public Account(long accountNo, String accountType) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountType=" + accountType + ", accountBalance=" + accountBalance
				+ "]";
	}	

}
