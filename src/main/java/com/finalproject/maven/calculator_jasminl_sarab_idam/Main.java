package com.finalproject.maven.calculator_jasminl_sarab_idam;

/**
 * The main class Main creates a calculator and prints the user input to be used
 * in Simple Calculator and Scientific Calculator
 * 
 * @author Ida Mostrom, Sara Berg, Jasmin Linderoth
 * @version 1.0
 *
 */
public class Main {
	/**
	 * The main method creates a simple calculator "sc" and a scientific calculator
	 * "scic" that is used to call on the methods created in the SimpleCalculator
	 * and ScientificCalculator.It also creates a main frame.
	 * 
	 * @param args main arguments 
	 */
	
	public static void main(String[] args) {
		
		SimpleCalculator sc = new SimpleCalculator();
		ScientificCalculator scic = new ScientificCalculator();
		MainFrame window = new MainFrame();

	}

}