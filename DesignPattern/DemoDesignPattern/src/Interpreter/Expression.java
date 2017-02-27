package Interpreter;
/**
 * @author ThuHien
 * classes TerminalExpression, AndExpression, OrExpression implementing this interface.
 */

public interface Expression {
	public boolean interpret(String context);
}
