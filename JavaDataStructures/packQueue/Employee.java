package packQueue;

public class Employee {
	private int emp_id;
	private String emp_name;
	
	public Employee(int empID){
		this(empID, null);
	}
	
	public Employee(int empID, String empName){
		setEmpID(empID);
		setEmpName(empName);
	}

	/**
	 * @return the emp_id
	 */
	public int getEmpID() {
		return emp_id;
	}

	/**
	 * @param emp_id the emp_id to set
	 */
	public void setEmpID(int emp_id) {
		this.emp_id = emp_id;
	}

	/**
	 * @return the emp_name
	 */
	public String getEmpName() {
		return emp_name;
	}

	/**
	 * @param emp_name the emp_name to set
	 */
	public void setEmpName(String emp_name) {
		this.emp_name = emp_name;
	}
	
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
	}
	
}
