package CodePackage;

/**
 * @author ThuHien
 * Class demo Inheritance of OOP
 * Superclass is Personnel, Subclass is Student, Teacher,...
 */

public class Personnel {
	
	private String fullName;
	private String address;
	
	public String getFullName() {
		return fullName;
	}	
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Constructor
	 */
	public Personnel() {
		fullName = "";
		address = "";
	}
	
	public Personnel(String fullName, String address) {
		this.fullName = fullName;
		this.address = address;
	}
	
	public Personnel(Personnel A) {
		this.fullName = A.fullName;
		this.address = A.address;
	}
}
