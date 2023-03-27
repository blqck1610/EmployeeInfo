
public class Employee {
	private String eID;
	private String name;
	private String department;
	private String dob;
	public Employee() {
		
	}
	public Employee(String eID, String name, String department, String dob) {
		this.eID = eID;
		this.name = name;
		this.department = department;
		this.dob = dob;
	}
	public String geteID() {
		return eID;
	}
	public void seteID(String eID) {
		this.eID = eID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
