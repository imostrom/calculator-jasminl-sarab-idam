package com.finalproject.maven.calculator_jasminl_sarab_idam;

import static org.junit.Assert.*;

import org.junit.Test;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

public class ScientificCalculatorTest {
	private static final Logger LOG = Logger.getLogger(ScientificCalculator.class.getName());
	ScientificCalculator scientific = new ScientificCalculator();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testSquarePositive() {
		double value = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			value = Double.valueOf(df.format(random.nextDouble() * 100));
			result = value * value;
			LOG.info("Testing the square method with: " + value + " The result: " + result);
			assertEquals(Math.round(scientific.square(value)), Math.round(result), 0.1);
		}

	}

	@Test
	public void testSquareNegative() {
		double value = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			value = Double.valueOf(df.format(random.nextDouble() * -100));
			result = value * value;
			LOG.info("Testing the square method with: " + value + " The result: " + result);
			assertEquals(Math.round(scientific.square(value)), Math.round(result), 0.1);
		}
	}

	@Test
	public void testSquareZeros() {
		double value = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			value = Double.valueOf(df.format(random.nextDouble() * 0));
			result = value * value;
			LOG.info("Testing the square method with: " + value + " The result: " + result);
			assertEquals(Math.round(scientific.square(value)), Math.round(result), 0.1);
		}

	}

	public double helpMethodExponent(double base, double exponent) {
		double result = Math.pow(base, exponent);
		return result;
	}

	@Test
	public void testraisedToThePowerOffPositive() {
		double base = 0;
		double exponent = 0;

		for (int j = 0; j < 50; j++) {
			base = Double.valueOf(df.format(Math.ceil(random.nextDouble() * 5)));
			exponent = Double.valueOf(df.format(Math.ceil(random.nextDouble() * 5)));
			double result = helpMethodExponent(base, exponent);

			LOG.info("Testing the raisedToThePowerOff with: " + base + " and " + exponent + " The result: " + result);
			assertEquals(scientific.raisedToThePowerOff(base, exponent), helpMethodExponent(base, exponent), 0.1);

		}
	}

	@Test
	public void testraisedToThePowerOffNegative() {
		double base = 0;
		double exponent = 0;

		for (int j = 0; j < 50; j++) {
			base = Double.valueOf(df.format(random.nextDouble() * (-5)));
			exponent = Double.valueOf(df.format(random.nextDouble() * (-5)));
			double result = helpMethodExponent(base, exponent);
			LOG.info("Testing the raisedToThePowerOff with: " + base + exponent + " The result: " + result);
			assertEquals(scientific.raisedToThePowerOff(base, exponent), helpMethodExponent(base, exponent), 0.1);

		}
	}

	@Test
	public void testraisedToThePowerOffZeros() {
		double base = 0;
		double exponent = 0;

		double result = helpMethodExponent(base, exponent);

		LOG.info("Testing the raisedToThePowerOff with: " + base + exponent + " The result: " + result);
		assertEquals(scientific.raisedToThePowerOff(base, exponent), helpMethodExponent(base, exponent), 0.1);

	}

	@Test
	public void testRemainderPositive() {
		double dividend = 0;
		double divisor = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			dividend = Double.valueOf(df.format(random.nextDouble() * 100));
			divisor = Double.valueOf(df.format(random.nextDouble() * 100));
			result = dividend % divisor;

			LOG.info("Testing the remainder with: " + dividend + divisor + " The result: " + result);
			assertEquals(scientific.remainder(dividend, divisor), result, 0.1);

		}

	}

	@Test
	public void testRemainderNegative() {
		double dividend = 0;
		double divisor = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			dividend = Double.valueOf(df.format(random.nextDouble() * -100));
			divisor = Double.valueOf(df.format(random.nextDouble() * -100));
			result = dividend % divisor;

			LOG.info("Testing the remainder with: " + dividend + divisor + " The result: " + result);
			assertEquals(scientific.remainder(dividend, divisor), result, 0.1);

		}

	}

	@Test
	public void testRemainderZero() {
		double dividend = 0;
		double divisor = 0;
		double result = 0;

		result = dividend % divisor;

		LOG.info("Testing the remainder with: " + dividend + divisor + " The result: " + result);
		assertEquals(scientific.remainder(dividend, divisor), result, 0.1);

	}

	@Test
	public void testCubePositiveNumbers() {
		double value = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			value = Double.valueOf(df.format(random.nextDouble() * 100));
			result = value * value * value;

			LOG.info("Testing the cube method with: " + value + "The result:" + result);
			assertEquals(scientific.cube(value), result, 0.1);
		}
	}

	@Test
	public void testCubeNegativeNumbers() {
		double value = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			value = Double.valueOf(df.format(random.nextDouble() * (-100)));
			result = value * value * value;

			LOG.info("Testing the cube method with: " + value + "The result:" + result);
			assertEquals(scientific.cube(value), result, 0.1);
		}
	}

	@Test
	public void testCubeZero() {
		double value = 0;
		double result = 0;

		result = value * value * value;

		LOG.info("Testing the cube method with: " + value + "The result:" + result);
		assertEquals(scientific.cube(value), result, 0.1);
	}

	@Test
	public void testSquareRootPositiveNumbers() {
		double factor = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			factor = Double.valueOf(df.format(random.nextDouble() * 100));
			result = Math.sqrt(factor);

			LOG.info("Testing the square root method with: " + factor + "The result:" + result);
			assertEquals(scientific.squareRoot(factor), result, 0.1);
		}
	}

	@Test
	public void testSquareRootNegativeNumbers() {
		double factor = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			factor = Double.valueOf(df.format(random.nextDouble() * (-100)));
			result = Math.sqrt(factor);

			LOG.info("Testing the square root method with: " + factor + "The result:" + result);
			assertEquals(scientific.squareRoot(factor), result, 0.1);
		}
	}

	@Test
	public void testSquareRootZero() {
		double factor = 0;
		double result = 0;

		result = Math.sqrt(factor);

		LOG.info("Testing the square root method with: " + factor + "The result:" + result);
		assertEquals(Math.round(scientific.squareRoot(factor)), Math.round(result), 0.1);
	}

	@Test
	public void testPercentagePositiveNumbers() {
		double number = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			number = Double.valueOf(df.format(random.nextDouble() * 100));
			result = number / 100;

			LOG.info("Testing the percentage method with: " + number + " The result:" + result + "%");
			assertEquals(scientific.percentage(number), result, 0.1);
		}
	}

	@Test
	public void testPercentageNegativeNumbers() {
		double number = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			number = Double.valueOf(df.format(random.nextDouble() * (-100)));
			result = number / 100;

			LOG.info("Testing the percentage method with: " + number + " The result:" + result + "%");
			assertEquals(scientific.percentage(number), result, 0.1);
		}
	}

	@Test
	public void testPercentageZero() {
		double number = 0;
		double result = 0;

		result = number / 100;

		LOG.info("Testing the percentage method with: " + number + " The result:" + result + "%");
		assertEquals(scientific.percentage(number), result, 0.1);
	}

}