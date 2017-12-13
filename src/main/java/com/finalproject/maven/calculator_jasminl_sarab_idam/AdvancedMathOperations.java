package com.finalproject.maven.calculator_jasminl_sarab_idam;

/**
 * This interface declare the methods for advanced math operations.
 * 
 * @author Ida Mostrom,Sara Berg, Jasmin Linderoth
 * @version 1.0
 *
 *          The method square - calculating the square of number The method
 *          raisedToThePowerOf - calculating the base raised to the power of
 *          exponent The method remainder - calculating the remainder from
 *          dividend and divisor The method cube - calculating the cube of a
 *          number The method percentage - calculating the percentage of a
 *          number The method squareRoot - calculating the square root of factor
 */
public interface AdvancedMathOperations {
	/**
	 * 
	 * @param number
	 *            the number to be squared
	 * @return number squared
	 */

	public double square(double number);

	/**
	 * 
	 * @param base
	 *            the number to be raised
	 * @param exponent
	 *            is the number that base is raised to
	 * @return base raised to the power of exponent
	 */

	public double raisedToThePowerOff(double base, double exponent);

	/**
	 * 
	 * @param dividend
	 *            is the total number
	 * @param divisor
	 *            is the number to be found in dividend
	 * @return dividend % divisor
	 */
	public double remainder(double dividend, double divisor);

	/**
	 * 
	 * @param number
	 *            is the number to be cubed
	 * @return number cubed
	 */

	public double cube(double number);

	/**
	 * 
	 * @param number
	 *            is the number to find percentage of
	 * @return the numbers percentage
	 */

	public double percentage(double number);

	/**
	 * 
	 * @param factor
	 *            is the number to find square root of
	 * @return factors squareroot
	 */
	public double squareRoot(double factor);

}