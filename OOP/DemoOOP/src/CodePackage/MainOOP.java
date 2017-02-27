package CodePackage;

/**
 * @author ThuHien
 * Class main demo some way to using object, class,...
 */
public class MainOOP {

	public static void main(String[] args) {
		
		//Demo Inheritance
		Student student01 = new Student();
		student01.setFullName("Pham Thu Hien");
		student01.setAddress("Dong Thap");
		student01.setMediumScore(8.23);
		
		Teacher teacher01 = new Teacher();
		teacher01.setFullName("Bui Cong Danh");
		teacher01.setAddress("TP HCM");
		teacher01.setSalary(5000000);
		
		//Demo Object
		Customer hien = new Customer();        //Object customer name 'hien' 
		
		//Attribute: Name, Address, Id, AccountNumber		
		hien.setName("Pham Thu Hien");
		hien.setAddress("HCM City");
		hien.setId("3412345612");
		hien.setAccountNumber("005123454");
		
		//Method: withdrawCash, transfers, recharges
		hien.withdrawCash();
		hien.tranfers();
		hien.recharge();
	}

}
