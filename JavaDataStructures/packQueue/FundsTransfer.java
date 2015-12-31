package packQueue;

import java.util.Date;

public class FundsTransfer extends Transaction {
	Account fromAccount;
	Account toAccount;
	double txnAmt;
	Operation[] txnOps;
	
	public FundsTransfer(long txnID, Account fromAccount, Account toAccount, double txnAmt) {
		super(txnID, "FundsTransfer", new Date());
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		
		this.txnOps = new Operation[2];
		txnOps[0] = new Debit(txnAmt);
		txnOps[1] = new Credit(txnAmt);
		
		this.fromAccount.addOperation(this.txnOps[0]);
		this.toAccount.addOperation(this.txnOps[1]);
	}

	public Account getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(Account fromAccount) {
		this.fromAccount = fromAccount;
	}

	public Account getToAccount() {
		return toAccount;
	}

	public void setToAccount(Account toAccount) {
		this.toAccount = toAccount;
	}

	public double getTxnAmt() {
		return txnAmt;
	}

	public void setTxnAmt(double txnAmt) {
		this.txnAmt = txnAmt;
	}

	public Operation[] getTxnOperations() {
		return txnOps;
	}

	public void setTxnOperations(Operation[] txnOps) {
		this.txnOps = txnOps;
	}

	@Override
	public void updateAccountBalance() {
		this.fromAccount.setAccountBalance(this.fromAccount.getAccountBalance() + this.getTxnOperations()[0].getAmount());
		this.toAccount.setAccountBalance(this.toAccount.getAccountBalance() + this.getTxnOperations()[1].getAmount());	
	}
	
}
