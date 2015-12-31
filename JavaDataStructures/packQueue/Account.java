package packQueue;

public class Account {
	
	long accountNo;
	String accountType;
	double accountBalance;
	Customer customer;
	Operation acctOps[];
	
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

	public void addOperation(Operation ops){
		Operation[] currentOps = getAcctOps();
		Operation[] newOps;
		if (currentOps != null){
			int size = currentOps.length;
			newOps = new Operation[size + 1];
			for (int i=0; i< size; i++){
				newOps[i] = currentOps[i];
			}
			newOps[size] = ops;
		} else {
			newOps = new Operation[1];
			newOps[0] = ops;
		}
		setAcctOps(newOps);
		
	}
	
	public Operation[] getAcctOps() {
		return acctOps;
	}

	public void setAcctOps(Operation[] acctOps) {
		this.acctOps = acctOps;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountType=" + accountType + ", accountBalance=" + accountBalance
				+ "]";
	}	

}
