package packQueue;

public class Credit extends Operation {
	private static int factor = 1;

	public Credit(double amount) {
		super("Credit", factor*amount);
	}
		
}
