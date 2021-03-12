package com.ogon.programs;

import java.util.Scanner;

public class CheckSumofOddDigits extends UserMainCode1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the positive integer number:");
		int n = scanner.nextInt();
		int res = checkSum(n);

		if (res == 1)
			System.out.println("Sum of integer digits is odd");
		else
			System.out.println("Sum of integer digits is even");

		scanner.close();
	}
}

class UserMainCode1 {

	public static int checkSum(int n) {

		if (n == 0)
			return -1;

		int sum = 0;

		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}

		if (sum % 2 != 0)
			return 1;
		else
			return -1;

	}
}