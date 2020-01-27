package Week3;

public class CalculatorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		System.out.println(calc.addTwoNumbers(5.5,  6.5));
		System.out.println(calc.getLastCalculation());
		calc.resetLastCalculation();
		System.out.println(calc.getLastCalculation());
		
		calc.divideTwoNumbers(55.0, 0.0);
		System.out.println(calc.divideTwoNumbers(44.0, 11.0));
		
		System.out.println(calc.absoluteDifference(55.0, 77.0));
		System.out.println(calc.absoluteDifferenceV2(55.0,  77.0));
		
	}

}
