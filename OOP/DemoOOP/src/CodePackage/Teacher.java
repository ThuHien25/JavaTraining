package CodePackage;

/**
 * @author ThuHien
 * Class demo Inheritance of OOP
 * Superclass is Personnel, Subclass is Student, Teacher,...
 */

public class Teacher extends Personnel {
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
