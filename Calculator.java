import java.io.*;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int done = 1;
		while(done==1){
		double num1, num2;
		double answer = 0.0;
		System.out.println("Please input the first number:");
		num1 = input.nextDouble();
		System.out.println("Please input the second number:");
		num2 = input.nextDouble();
		System.out.println("Please input which operator you'd like to use, or type done if you're done: (+,-,*,/)");
		String operator = input.next();
		switch (operator){
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
			case "done":
			done=2;
			System.out.println("Goodbye!");
			break;
			
		}
	}
}
}
