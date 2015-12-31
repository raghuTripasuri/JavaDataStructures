package packQueue;

import java.util.Arrays;

public class Customer {
	int customerID;
	String customerName;
	String customerCategory;
	String customerContact;
	double totalNetWorth;
	Account accounts[];
	
	
	public Customer(int customerID, String customerName) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCategory() {
		return customerCategory;
	}

	public void setCustomerCategory(String customerCategory) {
		this.customerCategory = customerCategory;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

	public double getTotalNetWorth() {
		return totalNetWorth;
	}

	public void setTotalNetWorth(double totalNetWorth) {
		this.totalNetWorth = totalNetWorth;
	}

	public void updateTotalNetWorth(){
		double balance =0;
		for (Account acct : this.accounts){
			balance = balance + acct.getAccountBalance();
		}
		setTotalNetWorth(balance);
	}
	
	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerCategory="
				+ customerCategory + ", totalNetWorth=" + totalNetWorth + ", accounts=" + Arrays.toString(accounts)
				+ "]";
	}
	
	
}
