package packQueue;

import java.util.Date;

public class Withdraw extends Transaction {
	
	String modeOfWithdrawal;

	public Withdraw(long txnID, Account txnAccount, String withdrawMode, Customer txnCustomer, double txnAmt) {
		super(txnID, "Withdraw", new Date());
		this.txnAccount = txnAccount;
		this.txnCustomer = txnCustomer;
		this.modeOfWithdrawal = withdrawMode;
		this.txnOps = new Debit(txnAmt);
		this.txnAccount.addOperation(this.txnOps);
	}

	public String getModeOfWithdrawal() {
		return modeOfWithdrawal;
	}

	public void setModeOfWithdrawal(String modeOfWithdrawal) {
		this.modeOfWithdrawal = modeOfWithdrawal;
	}

	@Override
	public void updateAccountBalance() {
		// TODO Auto-generated method stub
		super.updateAccountBalance();
	}

	@Override
	public String toString() {
		return "Withdraw [modeOfWithdrawal=" + modeOfWithdrawal +  super.toString() + "]";
	}

}
