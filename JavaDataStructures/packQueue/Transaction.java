package packQueue;
import java.util.Date;
public class Transaction {
	long txnID;
	String txnName;
	Date txnDate;
	Customer txnCustomer;
	Account txnAccount;
	Operation txnOps;
	
	public Transaction(long txnID, String txnName, Date txnDate) {
		super();
		this.txnID = txnID;
		this.txnName = txnName;
		this.txnDate = txnDate;
	}

	public long getTxnID() {
		return txnID;
	}

	public void setTxnID(long txnID) {
		this.txnID = txnID;
	}

	public String getTxnName() {
		return txnName;
	}

	public void setTxnName(String txnName) {
		this.txnName = txnName;
	}

	public Date getTxnDate() {
		return txnDate;
	}

	public void setTxnDate(Date txnDate) {
		this.txnDate = txnDate;
	}

	public Customer getTxnCustomer() {
		return txnCustomer;
	}

	public void setTxnCustomer(Customer txnCustomer) {
		this.txnCustomer = txnCustomer;
	}

	public Account getTxnAccount() {
		return txnAccount;
	}

	public void setTxnAccount(Account txnAccount) {
		this.txnAccount = txnAccount;
	}

	public Operation getTxnOps() {
		return txnOps;
	}

	public void setTxnOps(Operation txnOps) {
		this.txnOps = txnOps;
	}
	
	public void updateAccountBalance(){
		double balance = this.txnAccount.getAccountBalance();
		balance = balance + this.txnOps.getAmount();
		this.txnAccount.setAccountBalance(balance);
	}

	@Override
	public String toString() {
		return "Transaction [txnID=" + txnID + ", txnName=" + txnName + ", txnDate=" + txnDate + "]";
	}
	
}
