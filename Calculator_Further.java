import java.util.*;
//Nicole Olson
public class Calculator_Further {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int done = 1;
		while(done==1){ //while loop is set up to stop the question loop when user types done
		double num1, num2; // input numbers and answer are taken as doubles so mathematics with decimals is possible as well. integer problems just have an answer put out as x.0
		double answer = 0.0;
		String operator, choice;
		System.out.println("Please input the first number:");
		num1 = input.nextDouble();
		System.out.println("Please input which operator you'd like to use (+,-,*,/):");
		operator = input.next();
		System.out.println("Please input the second number:"); //Questions are ordered how someone would think of the problem, rather than 2 numbers then the operator or vice versa
		num2 = input.nextDouble();
		switch (operator){ //sets up each problem based on the user's operator input
			case "+": answer = num1 + num2;
			System.out.println("The answer is " + answer);
			break;
			case "-": answer = num1 - num2;
			System.out.println("The answer is " + answer);
			break;
			case "*": answer = num1 * num2;
			System.out.println("The answer is " + answer);
			break;
			case "/": answer = num1 / num2;
			System.out.println("The answer is " + answer);
			break;
			default:
				System.out.println("Invalid Input.");
		}
		System.out.println("If you're done, type in done. If you'd like to continue, type in continue.");
		choice = input.next();
		switch (choice) { //set as a separate switch loop to verify if the user would like to continue or not. possibly not the best way to check? still works better than putting the done in the operator loop
		case "continue":
			break;
			case "done": 
			done=2;
			System.out.println("Goodbye!");
			break;
			default:
				System.out.println("Invalid input, please type in done or continue.");
	}
}
input.close();
}
}