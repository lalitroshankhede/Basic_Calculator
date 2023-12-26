package com.controller;

import java.util.Scanner;

import com.bean.Calcu_Menu;
import com.bean.CalculatorMain;
import com.dao.Calcu_Dao;

public class Calcu_Controller implements Calcu_Dao {

	Scanner input = new Scanner(System.in);

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		int num1, num2;

		System.out.println("Enter 1st no.");
		num1 = input.nextInt();
		System.out.println("Enter 2nd no.");
		num2 = input.nextInt();

		System.out.println("Addition of Two no. is : " + (num1 + num2));

		System.out.println("Do you want to continue ?");
		System.out.println("1.Yes 2. No");
		int choose = input.nextInt();
		do {

			switch (choose) {
			case 1:
				addition();
				break;

			case 2:
				new Calcu_Menu();
				break;

			default:
				System.out.println("Invalid Option please try again !");
				new CalculatorMain();
				break;
			}
		} while (choose == 2);

	}

	@Override
	public void substraction() {
		// TODO Auto-generated method stub
		int num1, num2;

		System.out.println("Enter 1st no.");
		num1 = input.nextInt();
		System.out.println("Enter 2nd no.");
		num2 = input.nextInt();

		System.out.println("Substraction of Two no. is : " + (num1 - num2));
		System.out.println("Do you want to continue ?");
		System.out.println("1.Yes 2. No");
		int choose = input.nextInt();
		do {

			switch (choose) {
			case 1:
				substraction();
				break;

			case 2:
				new Calcu_Menu();
				break;

			default:
				System.out.println("Invalid Option please try again !");
				new CalculatorMain();
				break;
			}
		} while (choose == 2);
	}

	@Override
	public void multiplication() {
		// TODO Auto-generated method stub

		int num1, num2;

		System.out.println("Enter 1st no.");
		num1 = input.nextInt();
		System.out.println("Enter 2nd no.");
		num2 = input.nextInt();

		System.out.println("Multiplication of Two no. is : " + (num1 * num2));
		System.out.println("Do you want to continue ?");
		System.out.println("1.Yes 2. No");
		int choose = input.nextInt();
		do {

			switch (choose) {
			case 1:
				multiplication();
				break;

			case 2:
				new Calcu_Menu();
				break;

			default:
				System.out.println("Invalid Option please try again !");
				new CalculatorMain();
				break;
			}
		} while (choose == 2);
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub

		int num1, num2;
		System.out.println("Enter 1st no.");
		num1 = input.nextInt();
		System.out.println("Enter 2nd no.");
		num2 = input.nextInt();
		try {
			int result = num1 / num2;
			System.out.println("Divison of two no. is " + result);
		} catch (ArithmeticException e) {

			System.out.println("Can't Divided by Zero");
		}

		System.out.println("Do you want to continue ?");
		System.out.println("1.Yes 2. No");
		int choose = input.nextInt();
		do {

			switch (choose) {
			case 1:
				division();
				break;

			case 2:
				new Calcu_Menu();
				break;

			default:
				System.out.println("Invalid Option please try again !");
				new CalculatorMain();
				break;
			}
		} while (choose == 2);
	}

	@Override
	public void modulas() {
		// TODO Auto-generated method stub

		double num1, num2;
		System.out.println("Enter 1st no.");
		num1 = input.nextInt();
		System.out.println("Enter 2nd no.");
		num2 = input.nextInt();
		double result = num1 % num2;
		System.out.println("Modulas of Two no. is : " + result);

		System.out.println("Do you want to continue ?");
		System.out.println("1.Yes 2. No");
		int choose = input.nextInt();
		do {

			switch (choose) {
			case 1:
				modulas();
				break;

			case 2:
				new Calcu_Menu();
				break;

			default:
				System.out.println("Invalid Option please try again !");
				new CalculatorMain();
				break;
			}
		} while (choose == 2);
	}

}
