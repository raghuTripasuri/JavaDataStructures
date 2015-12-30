package packQueue;

public class Operation {
	
	private String operationType;
	private double amount;
	
	public Operation(String operationType, double amount) {
		super();
		this.operationType = operationType;
		this.amount = amount;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Operation [operationType=" + operationType + ", amount=" + amount + "]";
	}
	
	
}
