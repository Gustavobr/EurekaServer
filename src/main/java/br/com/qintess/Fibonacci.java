package br.com.qintess;

import java.util.Scanner;

import javax.swing.JOptionPane;


// @Auithor: Gustavo Rodrigues
public class Fibonacci {

	/*
	 * @Author: Gustavo Rodrigues this class will implements the fibonacci method.
	 * As result will print the first ten numbers increment by the fibonacci rule.
	 */
	static int x1 = 0;
	static int x2 = 1;
	static int x3 = 0;

	public static void fibonacci(int count) throws NumberFormatException, Exception {

		if (count > 0) {

			x3 = x1 + x2;
			x1 = x2;
			x2 = x3;

			System.out.println(" " + x3);
			fibonacci(count - 1);

		}

	}

	/* class Main */
	public static void main(String args[]) throws Exception {
		Scanner scan = new Scanner(System.in);
		String count = JOptionPane.showInputDialog(null, scan);
		if (Integer.parseInt(count) > 0) {
			System.out.println(" " + x3);
			fibonacci(Integer.parseInt(count));
			scan.close();
		}
	}

}
