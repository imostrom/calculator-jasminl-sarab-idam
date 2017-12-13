package com.finalproject.maven.calculator_jasminl_sarab_idam;

/**
 * The class SimpleCalculator implements the interface BasicMathOperations.
 * 
 * @author Ida Mostrom, Sara Berg, Jasmin Linderoth
 * @version 1.0
 *
 */

public class SimpleCalculator implements BasicMathOperations {
	/**
	 * Method that returns sum of firstNumber added to secondNumber
	 * 
	 * @return firstNumber - the first number to be added
	 * @return secondNumber - the second number to be added
	 */
	public double addition(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}

	/**
	 * Method that returns sum of firstNumber subtracted from secondNumber
	 * 
	 * @return firstNumber - the first number to be subtracted from
	 * @return secondNumber - the second number to be subtracted
	 */
	public double subtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	/**
	 * Method that returns sum of firstNumber multiplied with secondNumber
	 * 
	 * @return firstNumber - the first number to be multiplied
	 * @return secondNumber - the second number to be multiplied
	 */
	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}

	/**
	 * Method that returns sum of firstNumber divided by secondNumber, if
	 * secondNumber is 0 then it returns a message saying "Division by zero?" and a
	 * bogus number
	 * 
	 * @return firstNumber - the first number to be divided by
	 * @return secondNumber - the second number to be divided with
	 */
	public double division(double firstNumber, double secondNumber) {
		double result = firstNumber / secondNumber;
		if (Double.isInfinite(result)) {
			System.out.println("Division by zero?");
			return -0.0987654321;
		} else {
			return result;
		}
	}
}