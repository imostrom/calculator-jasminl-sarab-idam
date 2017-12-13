package com.finalproject.maven.calculator_jasminl_sarab_idam;

import static org.junit.Assert.*;

import org.junit.Test;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

public class SimpleCalculatorTest {
	private static final Logger LOG = Logger.getLogger(SimpleCalculator.class.getName());
	SimpleCalculator calculator = new SimpleCalculator();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testAddPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber + secondNumber;

			LOG.info("Testing the add method with: " + firstNumber + " and " + secondNumber + "The result:" + result);
			assertEquals(calculator.addition(firstNumber, secondNumber), result, 0.1);
		}
	}

	@Test
	public void testAddNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-100)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-100)));
			result = firstNumber + secondNumber;

			LOG.info("Testing the add method with: " + firstNumber + " and " + secondNumber + "The result:" + result);
			assertEquals(calculator.addition(firstNumber, secondNumber), result, 0.1);
		}
	}

	@Test
	public void testAddZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		result = firstNumber + secondNumber;

		LOG.info("Testing the add method with: " + firstNumber + " and " + secondNumber + "The result:" + result);
		assertEquals(calculator.addition(firstNumber, secondNumber), result, 0.1);

		for (int i = 0; i < 50; i++) {
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (100)));
			result = firstNumber + secondNumber;

			LOG.info("Testing the add method with: " + firstNumber + " and " + secondNumber + "The result:" + result);
			assertEquals(calculator.addition(firstNumber, secondNumber), result, 0.1);
		}
	}

	@Test
	public void testSubtractPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber - secondNumber;

			LOG.info("Testing the subtract method: " + firstNumber + " and " + secondNumber + "The result:" + result);
			assertEquals(calculator.subtraction(firstNumber, secondNumber), result, 0.1);
		}
	}

	@Test
	public void testSubtractNegativeNumbers() {

		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-100)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-100)));
			result = firstNumber - secondNumber;

			LOG.info("Testing the subtract method with: " + firstNumber + " and " + secondNumber + "The result:"
					+ result);
			assertEquals(calculator.subtraction(firstNumber, secondNumber), result, 0.1);
		}
	}

	@Test
	public void testSubtractZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		result = firstNumber - secondNumber;

		LOG.info("Testing the subtract method: " + firstNumber + " and " + secondNumber + "The result:" + result);
		assertEquals(Math.round(calculator.subtraction(firstNumber, secondNumber)), Math.round(result), 1);

		for (int i = 0; i < 50; i++) {
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (100)));
			result = firstNumber - secondNumber;

			LOG.info("Testing the subtract method with: " + firstNumber + " and " + secondNumber + "The result:"
					+ result);
			assertEquals(calculator.subtraction(firstNumber, secondNumber), result, 0.1);
		}
	}

	@Test
	public void testMultiplyPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber * secondNumber;

			LOG.info("Testing the multiply method with: " + firstNumber + " and " + secondNumber);
			assertEquals(calculator.multiplication(firstNumber, secondNumber), result, 0.1);
		}
	}

	@Test
	public void testMultiplyNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-100)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (100)));
			result = firstNumber * secondNumber;

			LOG.info("Testing the multiply method with: " + firstNumber + " and " + secondNumber + "The result:"
					+ result);
			assertEquals(calculator.multiplication(firstNumber, secondNumber), result, 0.1);
		}
	}

	@Test
	public void testMultiplyZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		result = firstNumber * secondNumber;

		LOG.info("Testing the multiply method with: " + firstNumber + " and " + secondNumber + "The result:" + result);
		assertEquals(Math.round(calculator.multiplication(firstNumber, secondNumber)), Math.round(result), 1);

		for (int i = 0; i < 50; i++) {
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (100)));
			result = firstNumber * secondNumber;

			LOG.info("Testing the multiply method with: " + firstNumber + " and " + secondNumber + "The result:"
					+ result);
			assertEquals(calculator.multiplication(firstNumber, secondNumber), result, 0.1);
		}
	}

	@Test
	public void testDividePositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber / secondNumber;

			LOG.info(
					"Testing the divide method with: " + firstNumber + " and " + secondNumber + "The result:" + result);
			assertEquals(calculator.division(firstNumber, secondNumber), result, 0.1);
		}
	}

	@Test
	public void testDivideNegativeNumbers() {

		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-100)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-100)));
			result = firstNumber / secondNumber;

			LOG.info(
					"Testing the divide method with: " + firstNumber + " and " + secondNumber + "The result:" + result);
			assertEquals(calculator.division(firstNumber, secondNumber), result, 0.1);
		}
	}

	@Test
	public void testDivideZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = -0.123456;

		result = firstNumber / secondNumber;

		LOG.info("Testing the add method with: " + firstNumber + " and " + secondNumber + "The result:" + result);
		assertEquals(calculator.division(firstNumber, secondNumber), result, 0.1);

		for (int i = 0; i < 50; i++) {
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (10)));
			result = firstNumber / secondNumber;

			LOG.info("Testing the division method with: " + firstNumber + " and " + secondNumber + "The result:"
					+ result);
			assertEquals(calculator.division(firstNumber, secondNumber), result, 0.1);
		}

		for (int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (10)));
			;
			secondNumber = 0;
			result = -0.0987654321;

			LOG.info("Testing the division method with: " + firstNumber + " and " + secondNumber + "The result:"
					+ result);
			assertEquals(calculator.division(firstNumber, secondNumber), result, 0.1);
		}
	}
}