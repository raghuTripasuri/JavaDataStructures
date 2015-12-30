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
	
}
