package Week3;

public class Calculator {

	private double lastCalculation;
	
	// Note that there is no constructor implemented, thus a default one will be created for us automatically.
	
	public void resetLastCalculation() {
		lastCalculation = 0.0;
	}
	
	public double getLastCalculation() {
		return lastCalculation;
	}
	
	public double addTwoNumbers(double num1, double num2) {
		lastCalculation = num1 + num2;
		return lastCalculation;
	}
	
	public double absoluteDifference(double num1, double num2) {
		// Here we have used the Math java library to calculate the absolute difference between two numbers
		lastCalculation = Math.abs(num1 - num2);
		return lastCalculation;
	}
	
	// We will implement the calculation of the absolute difference ourselves with control statements.
	public double absoluteDifferenceV2(double num1, double num2) {
		// if num1 and num2 are equal, then the absolute difference is zero
		if (num1 == num2) {
			lastCalculation = num1 - num2;
		} else if (num1 > num2) { // else if num1 is greater then num2, the absolute difference is num1 - num2
			lastCalculation = num1 - num2;
		} else { // else num2 is greater than num1 and the absolute difference is num2 - num1
			lastCalculation = num2 - num1;
		}
		return lastCalculation;
	}
	
	public boolean numberIsPositive(double num1) {
		// if num1 is greater then 0, then it is positive
		if (num1 > 0.0) {
			return true;
		} else { // The number is 0.0 or less then 0.0 and so we will return false
			return false;
		}
	}
	
	public double divideTwoNumbers(double numerator, double denominator) {
		
		// Here we have an if statement, if true, go into the the if block of code
		// Note here, if we go into the if block, we will return the code to the caller without the rest of the method executing.
		if (denominator == 0.0) {
			System.out.println("Error:  You cannot divide a number by zero!");
			return 0.0;
		} 
		
		// Here we could have used an else statement, however, since we are putting a return statement inside the if block, 
		// The else is implied.  If the denominator is not == to 0.0, then we will execute the following two lines of code.
		lastCalculation = numerator / denominator;
		return lastCalculation;
	} 
	
}
