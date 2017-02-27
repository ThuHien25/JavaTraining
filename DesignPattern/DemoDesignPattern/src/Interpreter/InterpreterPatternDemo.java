package Interpreter;
/**
 * @author ThuHien
 * InterpreterPatternDemo uses Expression class
 * to create rules and then parse them.
 */

public class InterpreterPatternDemo {

	//Rule: David and John are male
	public static Expression getMaleExpression() {
		Expression david = new TerminalExpression("david");
		Expression john = new TerminalExpression("john");
		return new OrExpression(david, john);
	}
	
	//Rule: Hana is a married women
	public static Expression getMarriedWomenExpression() {
		Expression hana = new TerminalExpression("hana");
		Expression married = new TerminalExpression("married");
		return new AndExpression(hana, married);
	}
	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomenExpression();
		
		System.out.println("John is male? " +isMale.interpret("john"));
		System.out.println("Hana is a married women? " +isMarriedWoman.interpret("married"));

	}

}
