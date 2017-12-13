package com.finalproject.maven.calculator_jasminl_sarab_idam;

/**
 * This interface declare the methods for basic math operations.
 * 
 * @author Ida Mostrom,Sara Berg, Jasmin Linderoth
 * @version 1.0
 *
 * The method addition- calculating firstNumber added to secondNumber
 * The method subtraction - calculating firstNumber subtracted from secondNumber
 * The method  multiplication - calculating firstNumber multiplied with secondNumber
 * The method division - calculating firstNumber divided by secondNumber
 */

public interface BasicMathOperations {
	/**
	 * 
	 * @param firstNumber is added with secondNumber
	 * @param secondNumber is added with firstNumber
	 * @return firstNumber + secondNumber
	 */
	public double addition(double firstNumber, double secondNumber);
	/**
	 * 
	 * @param firstNumber is subtracts from secondNumber
	 * @param secondNumber is subtracted from firstNumber
	 * @return firstNumber - secondNumber
	 */
	public double subtraction(double firstNumber, double secondNumber);
	/**
	 * 
	 * @param firstNumber is multiplied with secondNumber
	 * @param secondNumber is multiplied with firstNumber
	 * @return firstNumber * secondNumber
	 */
	public double multiplication(double firstNumber, double secondNumber);
	/**
	 * 
	 * @param firstNumber is divided with secondNumber
	 * @param secondNumber is the divident of  firstNumber
	 * @return firstNumber / secondNumber
	 */
	public double division(double firstNumber, double secondNumber);

}