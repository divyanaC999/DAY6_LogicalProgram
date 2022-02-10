package com.fibonacciseries;

import java.util.Scanner;

public class FibonacciSeries {
	static void Fibonacci(int count) {
		int num1 = 0, num2 = 1;
		int counter = 0;
		while (counter < count) {
			System.out.print(num1 + " ");
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter = counter + 1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many fibonnaci elements to print ?");
		int count = sc.nextInt();
		System.out.println("fibonnaci elements are :");
		sc.close();
		Fibonacci(count);
	}
}
