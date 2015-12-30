package packQueue;

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
		Queue customerQueue = new Queue();
		StringBuffer str = new StringBuffer();
		Customer cust;
		Account acct;
		
		for (int i = 1; i < 6; i++){
			str.setLength(0);
			str.append("c_xyz_");
			str.append(i);
			cust = new Customer(i, str.toString());
			acct = new Account(i*125014, "Savings");
			acct.customer = cust;
			acct.accountBalance = 1000;
			cust.accounts = new Account[1];
			cust.accounts[0] = acct;
			if(i%2 == 0)
				cust.customerCategory ="NORMAL";
			 else cust.customerCategory = "PRIVILEGE";
			cust.totalNetWorth = getNetWorth(cust);
			customerQueue.enqueue(cust);
		}
		System.out.println("Customers are "+ customerQueue.toString());
		
		

	}
	public static double getNetWorth(Customer cust){
		
		double totalBalance = 0;
		for (Account account : cust.getAccounts()){
			totalBalance += account.getAccountBalance();
		}
		return (totalBalance);
	}

}
