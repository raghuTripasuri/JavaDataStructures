package packQueue;
import myDataStructures.DllNode;
import myDataStructures.DllNodeList;
import java.util.Random;
import java.util.Date;
/**
 * @author raghunatht
 * Core Bank Simulator class that will generate customers, Accounts and Transactions
 */
public class BankSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Create Customers and Accounts
		DllNodeList customerList = new DllNodeList();
		StringBuffer str = new StringBuffer();
		Customer cust;
		Account acct;
		Transaction firstTxn;
		BankSimulator bankSim = new BankSimulator();
		
		for (int i = 0; i < 15; i++){
			str.setLength(0);
			str.append("c_xyz_");
			str.append(i);
			cust = new Customer(i, str.toString());
			acct = new Account(i*125014, "Savings");
			acct.customer = cust;
			firstTxn = new Deposit(i*142312,acct,"GIFT",cust,1000);
			acct.accountBalance = 1000;
			cust.accounts = new Account[1];
			cust.accounts[0] = acct;
			if(i%2 == 0)
				cust.customerCategory ="NORMAL";
			 else cust.customerCategory = "PRIVILEGE";
			cust.totalNetWorth = bankSim.getNetWorth(cust);
			customerList.addToTail(cust);
		}
		
		customerList.printAll();
		
		//Create some transactions for the accounts;
		int customerID, toCustomerID;
		
		Random randVar = new Random();
		Transaction txn;
		DllNodeList allTransactions = new DllNodeList();
		double txnAmt;
		int txnBoundValue;
		Customer toCust=null;
		cust=null;
		acct=null;
				
		for (int i=1; i< 25; i++){
			customerID = randVar.nextInt(5);
			cust = bankSim.getCustomerWithID(customerID, customerList);
			acct = cust.getAccounts()[0];
			//System.out.println(cust.toString());
			
			switch(i%3){
				case 0: //Deposit transaction
					txnAmt = randVar.nextInt(5000);
					txn = new Deposit(i,acct,"CASH",cust,txnAmt);
					txn.updateAccountBalance();
					cust.updateTotalNetWorth();
					allTransactions.addToTail(txn);
					break;
				case 1: //Withdrawal transaction 
					txnBoundValue = new Double(acct.getAccountBalance()).intValue();
					txnAmt = randVar.nextInt(txnBoundValue);
					txn = new Withdraw(i, acct,"CASH", cust, txnAmt);
					txn.updateAccountBalance();
					cust.updateTotalNetWorth();
					allTransactions.addToTail(txn);
					break;
				case 2:	//Fund Transfer Transaction
					toCustomerID = customerID + 1;
					if(toCustomerID > 5) toCustomerID -= 5;
					toCust = bankSim.getCustomerWithID(toCustomerID, customerList);
					txnBoundValue = new Double(acct.getAccountBalance()).intValue();
					txnAmt = randVar.nextInt(txnBoundValue);
					txn = new FundsTransfer(i,acct, toCust.getAccounts()[0], txnAmt);
					txn.updateAccountBalance();
					cust.updateTotalNetWorth();
					toCust.updateTotalNetWorth();
					allTransactions.addToTail(txn);
					break;
			}
			
		}

		allTransactions.printAll();
		bankSim.printAccountBalances(customerList);
		bankSim.checkConsistency(customerList, allTransactions);
	}
	
	public double getNetWorth(Customer cust){
		
		double totalBalance = 0;
		for (Account account : cust.getAccounts()){
			totalBalance += account.getAccountBalance();
		}
		return (totalBalance);
	}
	
	public Customer getCustomerWithID(int id, DllNodeList customerList){
		DllNode tmp;
		Object custObject;
		Customer matchCustomer = null;
		int identity;
		for(tmp = customerList.getHead(); tmp != null; tmp = tmp.next){
			custObject = tmp.info;
			identity = ((Customer) custObject).getCustomerID(); 
			
			if(id == identity) {
				matchCustomer = ((Customer) custObject);
			}
		}
		//System.out.println("Customer ID is "+id);
		//System.out.println(" Customer Details " + matchCustomer.toString());
		return (matchCustomer);
		
	}
	
	public void printAccountBalances(DllNodeList customerList){
		DllNode tmp;
		Object custObject;
		Customer cust;
		StringBuffer str = new StringBuffer();
		
		str.append(" Customer Balances as of " + (new Date()).toString() +" are as follows: [ ");
		for (tmp=customerList.getHead(); tmp != null; tmp = tmp.next){
			custObject = tmp.info;
			cust = (Customer) custObject;
			str.append("{ CustomerID: ");
			str.append(cust.getCustomerID());
			str.append(" ; Customer Name: ");
			str.append(cust.getCustomerName());
			str.append(" ; Account Balance :");
			str.append(cust.getAccounts()[0].getAccountBalance());
			str.append(" } ");
		}
		str.append(" ] ");
		System.out.println(str.toString());
	}
	
	public void checkConsistency(DllNodeList customerList, DllNodeList txnList){
		// Sum of all transaction amounts should explain the differences in account balances
		
		DllNode tmp;
		Customer currentCust;
		//Account acct;
		//Operation ops;
		double initialBalance, finalBalance, sumTxnAmts;
		
		for (tmp = customerList.getHead(); tmp != null; tmp = tmp.next){
			currentCust = (Customer) tmp.info;
			for(Account tmpAcct : currentCust.getAccounts()){
				initialBalance = finalBalance = 0;
				sumTxnAmts = 0;
				for(Operation ops : tmpAcct.getAcctOps()){
					sumTxnAmts += ops.getAmount();
					finalBalance += ops.getAmount();
				}
				if(tmpAcct.getAccountBalance() == finalBalance){
					System.out.println();
					System.out.print("Customer Data is OK for " + currentCust.toString());
					System.out.print(" FINAL BALANCE is " + finalBalance);
				} else {
					System.out.println();
					System.out.print("Customer Data is NOT OK for " + currentCust.toString());
					System.out.print(" FINAL BALANCE is " + finalBalance + " : AccountBalance is " + tmpAcct.getAccountBalance());
					System.out.println();
				}
			}
			
		}
		
	}
}


