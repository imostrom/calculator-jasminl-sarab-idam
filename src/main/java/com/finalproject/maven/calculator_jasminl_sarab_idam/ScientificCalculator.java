package com.finalproject.maven.calculator_jasminl_sarab_idam;

/**
 * The class ScientificCalculator extends the SimpleCalculator and implements
 * the interface AdvancedMathOperations.
 * 
 * @author Ida Mostrom, Sara Berg, Jasmin Linderoth
 * @version 1.0
 *
 */

public class ScientificCalculator extends SimpleCalculator implements AdvancedMathOperations {
	/**
	 * Method that returns the square of a number
	 * 
	 * @return number - the number to be squared
	 */
	public double square(double number) {

		return Math.pow(number, 2);
	}

	/**
	 * Method that returns the base raised to the power of an exponent
	 * 
	 * @return base - the number to be raised
	 * @return exponent - the raising number used for the base
	 */
	public double raisedToThePowerOff(double base, double exponent) {

		return Math.pow(base, exponent);
	}

	/**
	 * Method that returns the remainder of a dividend and a divisor
	 * 
	 * @return dividend - the number to find the remainder of
	 * @return divisor - the number used for finding the remainder of the dividend
	 */
	public double remainder(double dividend, double divisor) {

		return dividend % divisor;
	}

	/**
	 * Method that returns the cube of a number
	 * 
	 * @return number - number to be calculated
	 */
	public double cube(double number) {

		return Math.pow(number, 3);
	}

	/**
	 * Method that returns the percentage of a number
	 * 
	 * @return number - number to be calculated
	 */
	public double percentage(double number) {

		return number / 100;
	}

	/**
	 * Method that returns the square root of a factor
	 * 
	 * @return factor - number to be calculated
	 */
	public double squareRoot(double factor) {

		return Math.sqrt(factor);
	}

}