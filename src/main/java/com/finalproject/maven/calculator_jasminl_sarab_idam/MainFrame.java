package com.finalproject.maven.calculator_jasminl_sarab_idam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

/**
 * The class Mainframe is the GUI of the calculator project.
 * 
 * @author Ida Mostrom, Sara Berg, Jasmin Linderoth
 * @version 1.0
 *
 */
public class MainFrame {

	ScientificCalculator scientific = new ScientificCalculator();
	SimpleCalculator simple = new SimpleCalculator();

	private JFrame frmCalculator = new JFrame();
	private JFrame frmCalculator_1;
	private JTextField textField = new JTextField();
	private JTextField tfFirstNumber;
	private JButton btnC = new JButton("C");
	private JButton btnDivision = new JButton("÷");
	private JButton btnX = new JButton("x");
	private JButton btnPlus = new JButton("+");
	private JButton btnMinus = new JButton("-");
	private JButton btnProcent = new JButton("%");
	private JButton btnSquared = new JButton("x²");
	private JButton btnCubed = new JButton("x³");
	private JButton btnMod = new JButton("mod");
	private JButton btnSquareRoot = new JButton("√");
	private JButton btnToThePowerOf = new JButton("xⁿ");
	private final JTextField tfSecondNumber = new JTextField();
	private JLabel lblResult = new JLabel("Result:");

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
		addComponents();
		addActionListeners();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		tfSecondNumber.setBounds(162, 12, 95, 44);
		tfSecondNumber.setColumns(10);

		frmCalculator_1 = new JFrame();
		frmCalculator_1.getContentPane().setBackground(Color.PINK);
		frmCalculator_1.setTitle("Calculator");
		frmCalculator_1.setBounds(100, 100, 298, 354);
		frmCalculator_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator_1.getContentPane().setLayout(null);

		tfFirstNumber = new JTextField();
		tfFirstNumber.setBounds(30, 12, 95, 44);
		frmCalculator_1.getContentPane().add(tfFirstNumber);
		tfFirstNumber.setColumns(10);
		frmCalculator_1.setVisible(true);

		frmCalculator_1.getContentPane().add(tfSecondNumber);

	}

	private void addComponents() {
		frmCalculator_1.getContentPane().add(btnC);

		btnDivision.setBackground(Color.LIGHT_GRAY);
		frmCalculator_1.getContentPane().add(btnDivision);
		btnX.setBackground(Color.LIGHT_GRAY);
		frmCalculator_1.getContentPane().add(btnX);
		btnPlus.setBackground(Color.LIGHT_GRAY);
		frmCalculator_1.getContentPane().add(btnPlus);
		btnMinus.setBackground(Color.LIGHT_GRAY);
		frmCalculator_1.getContentPane().add(btnMinus);
		btnProcent.setBackground(Color.LIGHT_GRAY);
		frmCalculator_1.getContentPane().add(btnProcent);
		btnSquared.setBackground(Color.LIGHT_GRAY);
		frmCalculator_1.getContentPane().add(btnSquared);
		btnCubed.setBackground(Color.LIGHT_GRAY);
		frmCalculator_1.getContentPane().add(btnCubed);
		btnMod.setBackground(Color.LIGHT_GRAY);
		frmCalculator_1.getContentPane().add(btnMod);
		btnSquareRoot.setBackground(Color.LIGHT_GRAY);
		frmCalculator_1.getContentPane().add(btnSquareRoot);
		btnToThePowerOf.setBackground(Color.LIGHT_GRAY);
		frmCalculator_1.getContentPane().add(btnToThePowerOf);

		frmCalculator_1.getContentPane().add(tfSecondNumber);

		lblResult.setBounds(30, 68, 241, 29);
		frmCalculator_1.getContentPane().add(lblResult);

	}

	private void addActionListeners() {

		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResult.setText("Result:");
				tfFirstNumber.setText("");
				tfSecondNumber.setText("");
				btnDivision.setBackground(Color.LIGHT_GRAY);
				btnX.setBackground(Color.LIGHT_GRAY);
				btnPlus.setBackground(Color.LIGHT_GRAY);
				btnMinus.setBackground(Color.LIGHT_GRAY);
				btnProcent.setBackground(Color.LIGHT_GRAY);
				btnSquared.setBackground(Color.LIGHT_GRAY);
				btnCubed.setBackground(Color.LIGHT_GRAY);
				btnMod.setBackground(Color.LIGHT_GRAY);
				btnSquareRoot.setBackground(Color.LIGHT_GRAY);
				btnProcent.setBackground(Color.LIGHT_GRAY);
				btnToThePowerOf.setBackground(Color.LIGHT_GRAY);

			}
		});
		btnC.setBounds(190, 109, 60, 80);

		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
				double secondNumber = Double.parseDouble(tfSecondNumber.getText().toString());
				double result = simple.division(firstNumber, secondNumber);

				lblResult.setText("Result: " + result);
				tfFirstNumber.setText("");
				tfSecondNumber.setText("");
				btnDivision.setBackground(Color.GRAY);
			}
		});
		btnDivision.setBounds(30, 160, 60, 40);

		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
				double secondNumber = Double.parseDouble(tfSecondNumber.getText().toString());
				double result = simple.multiplication(firstNumber, secondNumber);

				lblResult.setText("Result: " + result);
				tfFirstNumber.setText("");
				tfSecondNumber.setText("");

				btnX.setBackground(Color.GRAY);
			}
		});
		btnX.setBounds(30, 109, 60, 40);

		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
				double secondNumber = Double.parseDouble(tfSecondNumber.getText().toString());
				double result = simple.addition(firstNumber, secondNumber);

				lblResult.setText("Result: " + result);
				tfFirstNumber.setText("");
				tfSecondNumber.setText("");

				btnPlus.setBackground(Color.GRAY);
			}
		});
		btnPlus.setBounds(30, 210, 60, 40);

		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
				double secondNumber = Double.parseDouble(tfSecondNumber.getText().toString());
				double result = simple.subtraction(firstNumber, secondNumber);

				lblResult.setText("Result: " + result);
				tfFirstNumber.setText("");
				tfSecondNumber.setText("");

				btnMinus.setBackground(Color.GRAY);
			}
		});
		btnMinus.setBounds(30, 260, 60, 40);

		btnProcent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
				double result = scientific.percentage(firstNumber);

				lblResult.setText("Result: " + result);
				tfFirstNumber.setText("");
				tfSecondNumber.setText("");

				btnProcent.setBackground(Color.GRAY);
			}
		});
		btnProcent.setBounds(190, 210, 60, 40);

		btnSquared.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
				double result = scientific.square(firstNumber);

				lblResult.setText("Result: " + result);
				tfFirstNumber.setText("");
				tfSecondNumber.setText("");

				btnSquared.setBackground(Color.GRAY);
			}
		});
		btnSquared.setBounds(110, 210, 60, 40);

		btnCubed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
				double result = scientific.cube(firstNumber);

				lblResult.setText("Result: " + result);
				tfFirstNumber.setText("");
				tfSecondNumber.setText("");

				btnCubed.setBackground(Color.GRAY);
			}
		});
		btnCubed.setBounds(110, 160, 60, 40);

		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
				double secondNumber = Double.parseDouble(tfSecondNumber.getText().toString());
				double result = scientific.remainder(firstNumber, secondNumber);

				lblResult.setText("Result: " + result);
				tfFirstNumber.setText("");
				tfSecondNumber.setText("");

				btnMod.setBackground(Color.GRAY);
			}
		});
		btnMod.setFont(new Font("Dialog", Font.BOLD, 10));

		btnMod.setBounds(110, 260, 60, 40);

		btnSquareRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
				double result = scientific.squareRoot(firstNumber);

				lblResult.setText("Result: " + result);
				tfFirstNumber.setText("");
				tfSecondNumber.setText("");

				btnSquareRoot.setBackground(Color.GRAY);
			}
		});
		btnSquareRoot.setBounds(190, 260, 60, 40);

		btnToThePowerOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
				double secondNumber = Double.parseDouble(tfSecondNumber.getText().toString());
				double result = scientific.raisedToThePowerOff(firstNumber, secondNumber);

				lblResult.setText("Result: " + result);
				tfFirstNumber.setText("");
				tfSecondNumber.setText("");

				btnToThePowerOf.setBackground(Color.GRAY);
			}
		});
		btnToThePowerOf.setBounds(110, 109, 60, 40);

	}
}