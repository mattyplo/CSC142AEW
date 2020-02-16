package Week6;

import java.util.Random;

public class LoopClient {

	public static void main(String[] args) {
		//countToTenForLoop();
		//countToTenWhileLoop();
		//countToGivenNumberFromZero(15);
		//printRandomNumbers();
		//printCountRandomNumbers();
		//zeroToNinetyNineWithTwoLoops();
		//printZeroToFiftySkipMultiplesOfThree();
		//printFiftyToZeroNoLastDigitFives();
		//printFromGreatestToLeast(143, 99);
	}

	// Write a method that prints to the console the numbers 1 - 10 in order using a for loop
	public static void countToTenForLoop() {
		for (int i = 1; i < 11; i ++) {
			System.out.println(i);
		}
	}

	// Write a method that prints to the console the numbers 1 - 10 in order using a while loop
	public static void countToTenWhileLoop() {
		int count = 1;
		while(count < 11) {
			System.out.println(count);
			count ++;
		}
	}
	
	// Write a method that prints to the console from zero up to and including the number passed in as an argument
	public static void countToGivenNumberFromZero(int num) {
		for (int i = 0; i <= num; i ++) {
			System.out.println(i);
		}
	}
	
	// Print random numbers from zero to 25 until the random number is a zero.  Use a while loop.
	public static void printRandomNumbers() {
		Random rand = new Random();
		int randomNumber = rand.nextInt(25);
		while (randomNumber != 0) {
			System.out.println(randomNumber);
			randomNumber = rand.nextInt(25);
		}
	}
	
	// Randomly generate a random number from 0 to 25 until that number is a zero. 
	// Print the random numbers to the console.
	// Count the number of random numbers generated and print that to the screen at the end of the loop.
	public static void printCountRandomNumbers() {
		Random rand = new Random();
		int randomNumber = rand.nextInt(25);
		int count = 0;
		while(randomNumber != 0) {
			System.out.println(randomNumber);
			randomNumber = rand.nextInt(25);
			count ++;
		}
		System.out.println ("The number of random numbers generated was: " + count);
	}
	
	// Count from 0 to 99 using two loops.  The first loop should count from 0 to 9.
	// The second loop should count from 0 to 9.  
	// hint: one of the loops should be nested inside the other
	public static void zeroToNinetyNineWithTwoLoops() {
		for(int i = 0; i < 10; i ++) {
			for (int j = 0; j < 10; j ++) {
				System.out.println(Integer.toString(i) + Integer.toString(j));
			}
		}
	}
	
	// Create a method that uses a loop that prints the numbers 0 to 50.
	// The loop should not print numbers that are a multiple of three.
	public static void printZeroToFiftySkipMultiplesOfThree() {
		for (int i = 0; i < 51; i ++) {
			if (i % 3 != 0) {
				System.out.println(i);
			}
		}
	}
	
	// Create a method that uses a while loop and prints all the numbers from 50 to 0
	// If the number ends in 5, it should not be printed
	// If you can find a more elegant solution to this question than I have written here...
	// Bonus Points!!!
	public static void printFiftyToZeroNoLastDigitFives() {
		int count = 50;
		while(count >= 0) {
			if (count % 5 == 0) {
				if(count % 10 == 0) {
					System.out.println(count);
				}
			} else {
				System.out.println(count);
			}
			count --;
		}
	}
	
	// Write a method that takes two integers as an argument.  The method will print those integers and all integers in between
	// Them from greatest to least.
	public static void printFromGreatestToLeast(int num1, int num2) {
		// Determine which num is greater
		int startNum;
		int endNum;
		if (num1 > num2) {
			startNum = num1;
			endNum = num2;
		} else {
			startNum = num2;
			endNum = num1;
		}
		for (int i = startNum; i >= endNum; i --) {
			System.out.println(i);
		}
	}
}

