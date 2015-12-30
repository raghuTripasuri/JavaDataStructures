package packQueue;

public class Debit extends Operation {

	private static int factor = -1;

	public Debit( double amount) {
		super("Debit", factor*amount);
		
	}
	
}
