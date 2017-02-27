package CodePackage;

/**
 * @author ThuHien
 * Class demo Inheritance of OOP
 * Superclass is Personnel, Subclass is Student, Teacher,...
 */

public class Student extends Personnel {
	
	private double mediumScore;

	public double getMediumScore() {
		return mediumScore;
	}

	public void setMediumScore(double mediumScore) {
		this.mediumScore = mediumScore;
	}
}
