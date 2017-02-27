package CodePackage;
/**
 * @author ThuHien
 * Class demo Object of OOP
 */
public class Customer {
	private String name;
	private String address;
	private String id;
	private String accountNumber;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void withdrawCash() {}
	
	public void tranfers() {}
	
	public void recharge() {}
	
}
