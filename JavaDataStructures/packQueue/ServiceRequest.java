package packQueue;
import java.util.Date;
public class ServiceRequest {
	
	long srID;
	Date srDate;
	Transaction srTxn;
	String srStatus;
	int srAvgProcessTime;
	int srActProcessTime;
	Customer srCustomer;
	
	
	public ServiceRequest(long srID, Date srDate, Transaction srTxn, int srAvgProcessTime) {
		super();
		this.srID = srID;
		this.srDate = srDate;
		this.srTxn = srTxn;
		this.srAvgProcessTime = srAvgProcessTime;
	}

	public long getSrID() {
		return srID;
	}

	public void setSrID(long srID) {
		this.srID = srID;
	}

	public Date getSrDate() {
		return srDate;
	}

	public void setSrDate(Date srDate) {
		this.srDate = srDate;
	}

	public Transaction getSrTxn() {
		return srTxn;
	}

	public void setSrTxn(Transaction srTxn) {
		this.srTxn = srTxn;
	}

	public String getSrStatus() {
		return srStatus;
	}

	public void setSrStatus(String srStatus) {
		this.srStatus = srStatus;
	}

	public int getSrAvgProcessTime() {
		return srAvgProcessTime;
	}

	public void setSrAvgProcessTime(int srAvgProcessTime) {
		this.srAvgProcessTime = srAvgProcessTime;
	}

	public int getSrActProcessTime() {
		return srActProcessTime;
	}

	public void setSrActProcessTime(int srActProcessTime) {
		this.srActProcessTime = srActProcessTime;
	}

	public Customer getSrCustomer() {
		return srCustomer;
	}

	public void setSrCustomer(Customer srCustomer) {
		this.srCustomer = srCustomer;
	}

	@Override
	public String toString() {
		return "ServiceRequest [srID=" + srID + ", srDate=" + srDate + ", srTxn=" + srTxn + ", srStatus=" + srStatus
				+ ", srCustomer=" + srCustomer + "]";
	}
	
}
