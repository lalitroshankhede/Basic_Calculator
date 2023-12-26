package com.bean;

import java.util.Scanner;

import com.controller.Calcu_Controller;
import com.dao.Calcu_Dao;

public class Calcu_Menu {

	public Calcu_Menu() {
		// TODO Auto-generated constructor stub

		System.out.println("****  Basic Calculator ****");
		System.out.println("Choose any one following option :");

		System.out.println("1. Addition");
		System.out.println("2. Substration");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulas");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int choose = input.nextInt();

		switch (choose) {
		case 1: {

			Calcu_Dao obj = new Calcu_Controller();
			obj.addition();
			break;
		}

		case 2: {

			Calcu_Dao obj = new Calcu_Controller();
			obj.substraction();
			break;
		}

		case 3: {

			Calcu_Dao obj = new Calcu_Controller();
			obj.multiplication();
			break;
		}

		case 4: {

			Calcu_Dao obj = new Calcu_Controller();
			obj.division();
			break;
		}

		case 5: {

			Calcu_Dao obj = new Calcu_Controller();
			obj.modulas();
			break;
		}

		default:
			System.out.println("Invalid Option please try again !");
			new CalculatorMain();
			break;

		}
	}

}
