import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class EvaluateInfix {
	
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
			if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8'
					|| c == '9') {
				return true;
			} else {
				return false;
			}
		}

		// return true if op1's operator has higher precedence than op2's operator.
		// with only the four basic operators this can happen in a few ways:
		// 1. if op1 is * or /, and op2 is + or - (* or / before + or -)
		// 2. if op1 is * or /, and op2 is * or / (Left-to-Right for * or /)
		// 3. if op1 is + or -, and op2 is + or - (Left-to-Right for + or -)
		public static boolean hasHigherPrec(char op1, char op2) {
			if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
				return true;
			} else if ((op1 == '*' || op1 == '/') && (op2 == '*' || op2 == '/')) {
				return true;
			} else if ((op1 == '+' || op1 == '-') && (op2 == '+' || op2 == '-')) {
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
		
		public static void main(String[] args) throws IOException {

			// ask user for an infix expression
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Please enter your infix expression: ");
			String userInput = stdin.readLine();

			// convert the userInput string to a char[] array
			char[] charArray = userInput.toCharArray();

			// create a Stack with generic type Character to hold operators
			Stack<Character> myStack = new Stack<Character>();

			// create a string to hold the final postfix expression
			String result = "";

			// ADD CODE BELOW THIS LINE TO PERFORM THE OPERATIONS AS DESCRIBED IN
			// VIDEO.
			// BY THE END OF THE CODE, 'result' SHOULD HAVE THE POSTFIX EXPRESSION
			// IN IT

			for (int i = 0; i < charArray.length; i++) {
				if (isOperand(charArray[i]) == true) {
					result = result + charArray[i];
				} else if (isOperator(charArray[i]) == true) {
					while (!myStack.isEmpty() && myStack.peek().charValue()!='(' && hasHigherPrec(myStack.peek().charValue(), charArray[i])) {
						result = result + myStack.pop();
					}
					myStack.push(charArray[i]);
				} else if (charArray[i]=='(') {
					myStack.push(charArray[i]);
				} else if (charArray[i]==')') {
					while (!myStack.isEmpty() && myStack.peek().charValue()!='(') {
						result = result + myStack.pop();
					}
					myStack.pop();
				}
			}
			while (!myStack.isEmpty()){
				result = result + myStack.pop();
			}
			
			// convert the userInput string to a char[] array
			char[] charArray2 = result.toCharArray();
			
			// create a Stack with generic type Double to hold operands and intermediate calculations
			Stack<Double> myStack2 = new Stack<Double>();

			// ADD CODE BELOW THIS LINE TO PERFORM THE OPERATIONS AS DESCRIBED IN VIDEO.
			// BY THE END OF THE CODE, THE STACK SHOULD ONLY HAVE ONE DOUBLE OBJECT IN IT
			
			for (int i=0; i<charArray2.length;i++){
				if (isOperand(charArray2[i])== true){
					myStack2.push((double) Character.getNumericValue(charArray2[i]));
				} else if (isOperator(charArray2[i])== true) {
					double op2 = myStack2.pop();
					double op1 = myStack2.pop();
					double ans = performOperation(charArray2[i],op1,op2);
					myStack2.push(ans);
				}
			}
			// output the finalAnswer to the user
			System.out.println("The expression evaluates to: " + myStack2.pop());
			
		}
	
}
