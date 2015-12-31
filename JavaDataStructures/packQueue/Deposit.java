package packQueue;

import java.util.Date;

public class Deposit extends Transaction {

	String modeOfDeposit;

	public Deposit(long txnID, Account txnAccount, String depositMode, Customer txnCustomer, double txnAmt) {
		super(txnID, "Deposit", new Date());
		this.txnAccount = txnAccount;
		this.txnCustomer = txnCustomer;
		this.modeOfDeposit = depositMode;
		this.txnOps = new Credit(txnAmt);
		this.txnAccount.addOperation(this.txnOps);
	}

	public String getModeOfDeposit() {
		return modeOfDeposit;
	}

	@Override
	public void updateAccountBalance() {
		// TODO Auto-generated method stub
		super.updateAccountBalance();
	}

	public void setModeOfDeposit(String modeOfDeposit) {
		this.modeOfDeposit = modeOfDeposit;
	}

	@Override
	public String toString() {
		return "Deposit [modeOfDeposit=" + modeOfDeposit +  super.toString() + "]";
	}
	
}
