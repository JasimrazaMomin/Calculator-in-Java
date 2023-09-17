import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class EvaluatePostfix {

	
	// returns true if parameter c is one of: +, -, *, /
	public static boolean isOperator(char c) {
		if (c == '-' || c == '+' || c == '*' || c == '/') {
			return true;
		} else {
		return false;
		}
	}

	
	// returns true if parameter c is in the range from '0' to '9'.
	// note that in ASCII, '0' comes before '1'
	public static boolean isOperand(char c) {
		if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9'){
			return true;
		} else {
		return false;
		}
	}

	
	// perform the operation with infix notation: <operand1> <operator> <operand2> 
	// for example, performOperation('-','5','2') will perform "5 - 2" and return 3.
	public static Double performOperation(char operator, Double operand1, Double operand2) {
		double res = 0;
		if (operator == '-'){
			res = operand1 - operand2;
		} else if (operator == '+') {
			res = operand1 + operand2;
		} else if (operator == '*') {
			res = operand1 * operand2;
		} else if (operator == '/') {
			res = operand1 / operand2;
		}
		return res;
	}

	
	// main method
	public static void main(String[] args) throws IOException {

		// ask user for a postfix expression
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter your postfix expression: ");
		String userInput = stdin.readLine();
		
		// convert the userInput string to a char[] array
		char[] charArray = userInput.toCharArray();
		
		// create a Stack with generic type Double to hold operands and intermediate calculations
		Stack<Double> myStack = new Stack<Double>();

		// ADD CODE BELOW THIS LINE TO PERFORM THE OPERATIONS AS DESCRIBED IN VIDEO.
		// BY THE END OF THE CODE, THE STACK SHOULD ONLY HAVE ONE DOUBLE OBJECT IN IT
		
		for (int i=0; i<charArray.length;i++){
			if (isOperand(charArray[i])== true){
				myStack.push((double) Character.getNumericValue(charArray[i]));
			} else if (isOperator(charArray[i])== true) {
				double op2 = myStack.pop();
				double op1 = myStack.pop();
				double ans = performOperation(charArray[i],op1,op2);
				myStack.push(ans);
			}
		}
		// output the finalAnswer to the user
		System.out.println("The expression evaluates to: " + myStack.pop());

	}

}
